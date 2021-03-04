package com.minecraftabnormals.buzzier_bees.core.other;

import com.minecraftabnormals.buzzier_bees.common.entities.MoobloomEntity;
import com.minecraftabnormals.buzzier_bees.core.BBConfig;
import com.minecraftabnormals.buzzier_bees.core.BuzzierBees;
import com.minecraftabnormals.buzzier_bees.core.other.BBTags.EntityTypes;
import com.minecraftabnormals.buzzier_bees.core.registry.BBEffects;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.monster.PhantomEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = BuzzierBees.MOD_ID)
public class BBEvents {

	@SubscribeEvent
	public static void onLivingSpawned(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();
		if (entity instanceof MobEntity) {
			MobEntity mob = (MobEntity) entity;
			if (mob.getType().isContained(EntityTypes.MOOBLOOM_HOSTILES))
				mob.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(mob, MoobloomEntity.class, false));
		}
	}

	@SubscribeEvent
	public static void renewableFlowers(PlayerInteractEvent.RightClickBlock event) {
		PlayerEntity player = event.getPlayer();
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		Block block = world.getBlockState(pos).getBlock();
		ItemStack stack = player.getHeldItem(event.getHand());
		if (stack.getItem() != Items.BONE_MEAL)
			return;

		if (BBConfig.COMMON.shortFlowerDuplication.get()) {
			if (!(block instanceof FlowerBlock) || block.isIn(BBTags.Blocks.FLOWER_BLACKLIST) || (block instanceof IGrowable && ((IGrowable) block).canUseBonemeal(world, world.rand, pos, world.getBlockState(pos))))
				return;
			if (!player.isCreative())
				stack.shrink(1);
			player.swingArm(event.getHand());
			if (world.isRemote) BoneMealItem.spawnBonemealParticles(world, pos, world.rand.nextInt(12));
			Block.spawnAsEntity(world, pos, new ItemStack(block, 1));
		}

		if (!BBConfig.COMMON.tallFlowerDuplication.get()) {
			if (block instanceof TallFlowerBlock)
				event.setCanceled(true);
		}
	}

	@SubscribeEvent
	public static void onEntityUpdate(LivingUpdateEvent event) {
		LivingEntity entity = event.getEntityLiving();
		if (entity instanceof PhantomEntity) {
			if (((PhantomEntity) entity).getAttackTarget() instanceof ServerPlayerEntity) {
				ServerPlayerEntity player = (ServerPlayerEntity) ((PhantomEntity) entity).getAttackTarget();
				if (player.getActivePotionEffect(BBEffects.SUNNY.get()) != null) {
					((PhantomEntity) entity).setAttackTarget(null);
				}
			}
		}
	}

	@SubscribeEvent
	public static void bottleBug(PlayerInteractEvent.EntityInteractSpecific event) {
		if (event.getTarget() != null && !event.getWorld().isRemote) {

			ItemStack itemstack = event.getPlayer().getHeldItem(event.getHand());
			Item item = itemstack.getItem();

			Entity target = event.getTarget();
			EntityType<?> targetType = target.getType();
			PlayerEntity player = event.getPlayer();
			Hand hand = event.getHand();

			if (item == Items.GLASS_BOTTLE && target.isAlive() && BBCompat.ENTITY_TYPE_TO_BOTTLE_MAP.containsKey(targetType)) {
				ItemStack bottle = BBCompat.ENTITY_TYPE_TO_BOTTLE_MAP.get(targetType).apply(target);
				if (bottle != null) {
					itemstack.shrink(1);
					event.getWorld().playSound(null, event.getPos(), SoundEvents.ITEM_BOTTLE_FILL_DRAGONBREATH, SoundCategory.NEUTRAL, 1.0F, 1.0F);
					player.addStat(Stats.ITEM_USED.get(item));
					event.getTarget().remove();
					if (itemstack.isEmpty()) {
						player.setHeldItem(hand, bottle);
					} else if (!player.inventory.addItemStackToInventory(bottle)) {
						player.dropItem(bottle, false);
					}
					player.swingArm(hand);
				}
			}
		}
	}
}
