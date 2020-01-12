package com.bagel.buzzierbees.common.blocks;

import com.bagel.buzzierbees.common.BuzzierBees;
import mod.equinox.flamboyant.setup.ModSetup;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
	
	//Properties
	public static final Block.Properties FLOWER_PROPERTIES 		= Block.Properties.create(Material.PLANTS).func_226896_b_().doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT);
	public static final Block.Properties CANDLE_PROPERTIES 		= Block.Properties.create(Material.CORAL).hardnessAndResistance(0.0F).sound(SoundType.WOOD);
	public static final Block.Properties POT_PROPERTIES    		= Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().func_226896_b_();

	@ObjectHolder(BuzzierBees.MODID + ":wax_block")
	public static Block WAX_BLOCK;

	@ObjectHolder("minecraft:slime_block")
	public static Block SLIME_BLOCK;
	@ObjectHolder("minecraft:honey_block")
	public static Block HONEY_BLOCK;
	@ObjectHolder(BuzzierBees.MODID + ":clover_honey_block")
	public static Block CLOVER_HONEY_BLOCK;

	@ObjectHolder(BuzzierBees.MODID + ":crystallized_honey_block")
	public static Block CRYSTALLIZED_HONEY_BLOCK;
	@ObjectHolder(BuzzierBees.MODID + ":crystalized_clover_honey_block")
	public static Block CRYSTALLIZED_CLOVER_HONEY_BLOCK;
	@ObjectHolder(BuzzierBees.MODID + ":spruce_beehive")
	public static Block SPRUCE_BEEHIVE;
	@ObjectHolder(BuzzierBees.MODID + ":birch_beehive")
	public static Block BIRCH_BEEHIVE;
	@ObjectHolder(BuzzierBees.MODID + ":jungle_beehive")
	public static Block JUNGLE_BEEHIVE;
	@ObjectHolder(BuzzierBees.MODID + ":acacia_beehive")
	public static Block ACACIA_BEEHIVE;
	@ObjectHolder(BuzzierBees.MODID + ":dark_oak_beehive")
	public static Block DARK_OAK_BEEHIVE;

	@ObjectHolder(BuzzierBees.MODID + ":honey_lamp")
	public static Block HONEY_LAMP;

	//Hive Planks
	@ObjectHolder(BuzzierBees.MODID + ":hive_planks")
	public static Block HIVE_PLANKS;
	@ObjectHolder(BuzzierBees.MODID + ":hive_stairs")
	public static Block HIVE_STAIRS;
	@ObjectHolder(BuzzierBees.MODID + ":hive_slab")
	public static Block HIVE_SLAB;
	@ObjectHolder(BuzzierBees.MODID + ":hive_fence")
	public static Block HIVE_FENCE;
	@ObjectHolder(BuzzierBees.MODID + ":hive_fence_gate")
	public static Block HIVE_FENCE_GATE;
	@ObjectHolder(BuzzierBees.MODID + ":hive_pressure_plate")
	public static Block HIVE_PRESSURE_PLATE;
	@ObjectHolder(BuzzierBees.MODID + ":hive_button")
	public static Block HIVE_BUTTON;
	@ObjectHolder(BuzzierBees.MODID + ":hive_door")
	public static Block HIVE_DOOR;
	@ObjectHolder(BuzzierBees.MODID + ":hive_trapdoor")
	public static Block HIVE_TRAPDOOR;
	@ObjectHolder(BuzzierBees.MODID + ":hive_sign")
	public static Block HIVE_SIGN;
	@ObjectHolder(BuzzierBees.MODID + ":hive_wall_sign")
	public static Block HIVE_WALL_SIGN;

	//Honey Bricks
	@ObjectHolder(BuzzierBees.MODID + ":honey_block")
	public static Block HONEY_BRICKS;
	@ObjectHolder(BuzzierBees.MODID + ":honey_brick_stairs")
	public static Block HONEY_BRICK_STAIRS;
	@ObjectHolder(BuzzierBees.MODID + ":honey_brick_slab")
	public static Block HONEY_BRICK_SLAB;
	@ObjectHolder(BuzzierBees.MODID + ":honey_brick_wall")
	public static Block HONEY_BRICK_WALL;

	//Candles
	@ObjectHolder(BuzzierBees.MODID + ":candle")
	public static Block CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":white_candle")
	public static Block WHITE_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":orange_candle")
	public static Block ORANGE_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":magenta_candle")
	public static Block MAGENTA_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":light_blue_candle")
	public static Block LIGHT_BLUE_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":yellow_candle")
	public static Block YELLOW_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":lime_candle")
	public static Block LIME_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":pink_candle")
	public static Block PINK_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":gray_candle")
	public static Block GRAY_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":light_gray_candle")
	public static Block LIGHT_GRAY_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":cyan_candle")
	public static Block CYAN_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":purple_candle")
	public static Block PURPLE_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":blue_candle")
	public static Block BLUE_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":brown_candle")
	public static Block BROWN_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":green_candle")
	public static Block GREEN_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":red_candle")
	public static Block RED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":black_candle")
	public static Block BLACK_CANDLE;
	
	//Scented Candles
	@ObjectHolder(BuzzierBees.MODID + ":alium_scented_candle")
	public static Block ALLIUM_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":azure_bluet_scented_candle")
	public static Block AZURE_BLUET_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":blue_orchid_scented_candle")
	public static Block BLUE_ORCHID_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":dandelion_scented_candle")
	public static Block DANDELION_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":cornflower_scented_candle")
	public static Block CORNFLOWER_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":lily_of_the_valley_scented_candle")
	public static Block LILY_OF_THE_VALLEY_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":oxeye_daisy_scented_candle")
	public static Block OXEYE_DAISY_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":poppy_scented_candle")
	public static Block POPPY_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":white_tulip_scented_candle")
	public static Block WHITE_TULIP_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":orange_tulip_scented_candle")
	public static Block ORANGE_TULIP_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":pink_tulip_scented_candle")
	public static Block PINK_TULIP_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":red_tulip_scented_candle")
	public static Block RED_TULIP_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":wither_rose_scented_candle")
	public static Block WITHER_ROSE_SCENTED_CANDLE;

	//Mod Scented Candles
	@ObjectHolder(BuzzierBees.MODID + ":cartwheel_scented_candle")
	public static Block CARTWHEEL_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":bluebell_scented_candle")
	public static Block BLUEBELL_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":violet_scented_candle")
	public static Block VIOLET_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":columbine_scented_candle")
	public static Block COLUMBINE_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":jolyce_scented_candle")
	public static Block JOLYCE_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":daybloom_scented_candle")
	public static Block DAYBLOOM_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":white_clover_scented_candle")
	public static Block WHITE_CLOVER_SCENTED_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":pink_clover_scented_candle")
	public static Block PINK_CLOVER_SCENTED_CANDLE;

	//Flowers
	@ObjectHolder(BuzzierBees.MODID + ":cartwheel")
	public static Block CARTWHEEL;
	@ObjectHolder(BuzzierBees.MODID + ":bluebell")
	public static Block BLUEBELL;
	@ObjectHolder(BuzzierBees.MODID + ":violet")
	public static Block VIOLET;
	@ObjectHolder(BuzzierBees.MODID + ":columbine")
	public static Block COLUMBINE;
	@ObjectHolder(BuzzierBees.MODID + ":jolyce")
	public static Block JOLYCE;
	@ObjectHolder(BuzzierBees.MODID + ":daybloom")
	public static Block DAYBLOOM;
	@ObjectHolder(BuzzierBees.MODID + ":bird_of_pradise")
	public static Block BIRD_OF_PARADISE;
	@ObjectHolder(BuzzierBees.MODID + ":white_clover")
	public static Block WHITE_CLOVER;
	@ObjectHolder(BuzzierBees.MODID + ":pink_clover")
	public static Block PINK_CLOVER;

	//Potted Flowers
	public static Block POTTED_CARTWHEEL;
	public static Block POTTED_BLUEBELL;
	public static Block POTTED_VIOLET;
	public static Block POTTED_COLUMBINE;
	public static Block POTTED_JOLYCE;
	public static Block POTTED_DAYBLOOM;
	public static Block POTTED_WHITE_CLOVER;
	public static Block POTTED_PINK_CLOVER;

	//Flamboyant Compat
	@ObjectHolder(BuzzierBees.MODID + ":amber_candle")
	public static Block AMBER_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":beige_candle")
	public static Block BEIGE_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":cream_candle")
	public static Block CREAM_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":dark_green_candle")
	public static Block DARK_GREEN_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":forest_green_candle")
	public static Block FOREST_GREEN_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":hot_pink_candle")
	public static Block HOT_PINK_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":indigo_candle")
	public static Block INDIGO_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":maroon_candle")
	public static Block MAROON_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":navy_candle")
	public static Block NAVY_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":olive_candle")
	public static Block OLIVE_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":pale_green_candle")
	public static Block PALE_GREEN_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":pale_pink_candle")
	public static Block PALE_PINK_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":pale_yellow_candle")
	public static Block PALE_YELLOW_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":sky_blue_candle")
	public static Block SKY_BLUE_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":slate_gray_candle")
	public static Block SLATE_GRAY_CANDLE;
	@ObjectHolder(BuzzierBees.MODID + ":violet_candle")
	public static Block VIOLET_CANDLE;

	//Quark Compat
	public static Block HIVE_BOOKSHELF;
	public static Block HIVE_CHEST;
	public static Block HIVE_LADDER;
	@ObjectHolder(BuzzierBees.MODID + ":vertical_hive_slab")
	public static Block VERTICAL_HIVE_PLANKS;
	@ObjectHolder(BuzzierBees.MODID + ":hive_vertical_slab")
	public static Block HIVE_VERTICAL_SLAB;
	@ObjectHolder(BuzzierBees.MODID + ":honey_brick_vertical_slab")
	public static Block HONEY_BRICK_VERTICAL_SLAB;

	//TODO: 1.2
	public static Block BEEHIVE_BLOCK;

	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
    	BuzzierBees.LOGGER.info("Initiating Registering Blocks");
		SPRUCE_BEEHIVE = registerBlock(new BeehiveBlock(Block.Properties.from(Blocks.field_226906_mb_)), "spruce_beehive", ItemGroup.DECORATIONS);
		BIRCH_BEEHIVE = registerBlock(new BeehiveBlock(Block.Properties.from(Blocks.field_226906_mb_)), "birch_beehive", ItemGroup.DECORATIONS);
		JUNGLE_BEEHIVE = registerBlock(new BeehiveBlock(Block.Properties.from(Blocks.field_226906_mb_)), "jungle_beehive", ItemGroup.DECORATIONS);
		ACACIA_BEEHIVE = registerBlock(new BeehiveBlock(Block.Properties.from(Blocks.field_226906_mb_)), "acacia_beehive", ItemGroup.DECORATIONS);
		DARK_OAK_BEEHIVE = registerBlock(new BeehiveBlock(Block.Properties.from(Blocks.field_226906_mb_)), "dark_oak_beehive", ItemGroup.DECORATIONS);
		
		WAX_BLOCK          = registerBlock(new Block(Block.Properties.create(Material.CORAL).hardnessAndResistance(0.3F).sound(SoundType.CORAL)), "wax_block", ItemGroup.DECORATIONS);
		HONEY_LAMP         = registerBlock(new HoneyLamp(Block.Properties.from(Blocks.END_ROD).sound(SoundType.field_226947_m_)), "honey_lamp", ItemGroup.DECORATIONS);

		//SLIME_BLOCK 		= registerBlock(new NewSlimeBlock(Block.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).func_226896_b_()), "minecraft:slime_block", ItemGroup.DECORATIONS);
		//HONEY_BLOCK 		= registerBlock(new NewHoneyBlock(Block.Properties.create(Material.CLAY, MaterialColor.ADOBE).func_226897_b_(0.4F).func_226898_c_(0.5F).func_226896_b_().sound(SoundType.field_226947_m_)), "minecraft:honey_block", ItemGroup.DECORATIONS);
		//CLOVER_HONEY_BLOCK 	= registerBlock(new NewCloverHoneyBlock(Block.Properties.create(Material.CLAY, MaterialColor.ADOBE).slipperiness(0.75F).func_226897_b_(0.0F).slipperiness(0.75F).func_226898_c_(0.25F).func_226896_b_().sound(SoundType.field_226947_m_)), "clover_honey_block", ItemGroup.DECORATIONS);

		//TODO: Decide either it going to stay or not
		//Cut Content Section
		//CRYSTALLIZED_HONEY_BLOCK        = registerBlock(new Block(Block.Properties.create(Material.GLASS).func_226896_b_().hardnessAndResistance(0.3F).sound(SoundType.GLASS)), "crystallized_honey_block", ItemGroup.DECORATIONS);
		//CRYSTALLIZED_CLOVER_HONEY_BLOCK = registerBlock(new Block(Block.Properties.from(CRYSTALLIZED_HONEY_BLOCK)),"crystallized_clover_honey_block", ItemGroup.DECORATIONS);

		//Hive Planks Section
		HIVE_PLANKS 			= registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "hive_planks", ItemGroup.BUILDING_BLOCKS);
		HIVE_STAIRS 			= registerBlock(new StairsBlock(HIVE_PLANKS.getDefaultState(), Block.Properties.from(HIVE_PLANKS)), "hive_stairs", ItemGroup.BUILDING_BLOCKS);
		HIVE_SLAB 			= registerBlock(new SlabBlock(Block.Properties.from(HIVE_PLANKS)), "hive_slab", ItemGroup.BUILDING_BLOCKS);
        HIVE_FENCE 			= registerBlock(new FenceBlock(Block.Properties.from(HIVE_PLANKS)), "hive_fence", ItemGroup.DECORATIONS);
        HIVE_FENCE_GATE 		= registerBlock(new FenceGateBlock(Block.Properties.from(HIVE_PLANKS)), "hive_fence_gate", ItemGroup.REDSTONE);
        HIVE_BUTTON 			= registerBlock(new WoodButtonBlock(Block.Properties.from(HIVE_PLANKS).doesNotBlockMovement()), "hive_button", ItemGroup.REDSTONE);
		HIVE_PRESSURE_PLATE 	= registerBlock(new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(HIVE_PLANKS).doesNotBlockMovement()), "hive_pressure_plate", ItemGroup.REDSTONE);
		HIVE_DOOR 			= registerBlock(new DoorBlock(Block.Properties.from(HIVE_PLANKS).func_226896_b_()), "hive_door", ItemGroup.REDSTONE);
		HIVE_TRAPDOOR 		= registerBlock(new TrapDoorBlock(Block.Properties.from(HIVE_PLANKS).func_226896_b_()), "hive_trapdoor", ItemGroup.REDSTONE);
		//HIVE_SIGN 			= registerBlockNoGroupNoItem(new StandingSignBlock(Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), ModWoodType.HIVE_TYPE), "hive_sign");
		//HIVE_WALL_SIGN 		= registerBlockNoGroupNoItem(new WallSignBlock(Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(HIVE_SIGN), ModWoodType.HIVE_TYPE),"hive_wall_sign");
		
		//Honey Bricks Section
		HONEY_BRICKS        = registerBlock(new Block(Block.Properties.from(Blocks.BRICKS)),"honey_bricks", ItemGroup.BUILDING_BLOCKS);
		HONEY_BRICK_STAIRS 	= registerBlock(new StairsBlock(HONEY_BRICKS.getDefaultState(), Block.Properties.from(Blocks.BRICK_STAIRS)),"honey_brick_stairs", ItemGroup.BUILDING_BLOCKS);
		HONEY_BRICK_SLAB 	= registerBlock(new SlabBlock(Block.Properties.from(Blocks.BRICK_SLAB)),"honey_brick_slab", ItemGroup.BUILDING_BLOCKS);
		HONEY_BRICK_WALL 	= registerBlock(new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)),"honey_brick_wall", ItemGroup.DECORATIONS);

		//Flowers Section
		CARTWHEEL 			= registerBlock(new CartwheelBlock(Effects.SPEED, 11, FLOWER_PROPERTIES), "cartwheel", ItemGroup.DECORATIONS);
		BLUEBELL 			= registerBlock(new FlowerBlock(Effects.WATER_BREATHING, 6, FLOWER_PROPERTIES),	"bluebell", ItemGroup.DECORATIONS);
		DAYBLOOM 			= registerBlock(new FlowerBlock(Effects.GLOWING, 8, FLOWER_PROPERTIES), "daybloom", ItemGroup.DECORATIONS);
		VIOLET 				= registerBlock(new FlowerBlock(Effects.INVISIBILITY, 6, FLOWER_PROPERTIES), "violet", ItemGroup.DECORATIONS);
		JOLYCE 				= registerBlock(new FlowerBlock(Effects.STRENGTH, 8, FLOWER_PROPERTIES), "jolyce", ItemGroup.DECORATIONS);
		COLUMBINE 			= registerBlock(new FlowerBlock(Effects.MINING_FATIGUE, 6, FLOWER_PROPERTIES), "columbine", ItemGroup.DECORATIONS);
		WHITE_CLOVER 		= registerBlock(new FlowerBlock(Effects.UNLUCK, 30, FLOWER_PROPERTIES.func_226896_b_()), "white_clover", ItemGroup.DECORATIONS);
		PINK_CLOVER 		= registerBlock(new FlowerBlock(Effects.UNLUCK, 60, FLOWER_PROPERTIES.func_226896_b_()), "pink_clover", ItemGroup.DECORATIONS);
		BIRD_OF_PARADISE 	= registerBlock(new TallFlowerBlock(FLOWER_PROPERTIES), "bird_of_paradise", ItemGroup.DECORATIONS);
		
		//Potted Flowers Section
	    POTTED_CARTWHEEL 	= registerBlockNoItem(new PottedCartwheelBlock(CARTWHEEL, POT_PROPERTIES), "potted_cartwheel");
	    POTTED_BLUEBELL 	= registerBlockNoItem(new FlowerPotBlock(BLUEBELL, POT_PROPERTIES), "potted_bluebell");
	    POTTED_DAYBLOOM 	= registerBlockNoItem(new FlowerPotBlock(DAYBLOOM, POT_PROPERTIES), "potted_daybloom");
	    POTTED_VIOLET 		= registerBlockNoItem(new FlowerPotBlock(VIOLET, POT_PROPERTIES), "potted_violet");
	    POTTED_JOLYCE 		= registerBlockNoItem(new FlowerPotBlock(JOLYCE, POT_PROPERTIES), "potted_jolyce");
	    POTTED_COLUMBINE 	= registerBlockNoItem(new FlowerPotBlock(COLUMBINE, POT_PROPERTIES), "potted_columbine");
	    POTTED_WHITE_CLOVER = registerBlockNoItem(new FlowerPotBlock(WHITE_CLOVER, POT_PROPERTIES), "potted_white_clover");
	    POTTED_PINK_CLOVER 	= registerBlockNoItem(new FlowerPotBlock(PINK_CLOVER, POT_PROPERTIES), "potted_pink_clover");

		//Vanilla Candles Section
		CANDLE 				= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "candle", ItemGroup.DECORATIONS);
		WHITE_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "white_candle", ItemGroup.DECORATIONS);
		ORANGE_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "orange_candle", ItemGroup.DECORATIONS);
		MAGENTA_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "magenta_candle", ItemGroup.DECORATIONS);
		LIGHT_BLUE_CANDLE 	= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "light_blue_candle", ItemGroup.DECORATIONS);
		YELLOW_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "yellow_candle", ItemGroup.DECORATIONS);
		LIME_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "lime_candle", ItemGroup.DECORATIONS);
		PINK_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "pink_candle", ItemGroup.DECORATIONS);
		GRAY_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "gray_candle", ItemGroup.DECORATIONS);
		LIGHT_GRAY_CANDLE 	= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "light_gray_candle", ItemGroup.DECORATIONS);
		CYAN_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "cyan_candle", ItemGroup.DECORATIONS);
		PURPLE_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "purple_candle", ItemGroup.DECORATIONS);
		BLUE_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "blue_candle", ItemGroup.DECORATIONS);
		BROWN_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "brown_candle", ItemGroup.DECORATIONS);
		GREEN_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "green_candle", ItemGroup.DECORATIONS);
		RED_CANDLE 			= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "red_candle", ItemGroup.DECORATIONS);
		BLACK_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "black_candle", ItemGroup.DECORATIONS);
		
		//Vanilla Scented Candles Section
		ALLIUM_SCENTED_CANDLE             = registerBlock(new ScentedCandleBlock(Effects.FIRE_RESISTANCE, 70, 0, CANDLE_PROPERTIES), "allium_scented_candle",             ItemGroup.DECORATIONS);
		AZURE_BLUET_SCENTED_CANDLE        = registerBlock(new ScentedCandleBlock(Effects.BLINDNESS,       70, 0, CANDLE_PROPERTIES), "azure_bluet_scented_candle",        ItemGroup.DECORATIONS);
		BLUE_ORCHID_SCENTED_CANDLE        = registerBlock(new ScentedCandleBlock(Effects.SATURATION,      70, 0, CANDLE_PROPERTIES), "blue_orchid_scented_candle",        ItemGroup.DECORATIONS);
		DANDELION_SCENTED_CANDLE          = registerBlock(new ScentedCandleBlock(Effects.SATURATION,      70, 0, CANDLE_PROPERTIES), "dandelion_scented_candle",          ItemGroup.DECORATIONS);
		CORNFLOWER_SCENTED_CANDLE         = registerBlock(new ScentedCandleBlock(Effects.JUMP_BOOST,      70, 0, CANDLE_PROPERTIES), "cornflower_scented_candle",         ItemGroup.DECORATIONS);
		LILY_OF_THE_VALLEY_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.POISON,          70, 0, CANDLE_PROPERTIES), "lily_of_the_valley_scented_candle", ItemGroup.DECORATIONS);
		OXEYE_DAISY_SCENTED_CANDLE        = registerBlock(new ScentedCandleBlock(Effects.REGENERATION,    70, 0, CANDLE_PROPERTIES), "oxeye_daisy_scented_candle",        ItemGroup.DECORATIONS);
		POPPY_SCENTED_CANDLE              = registerBlock(new ScentedCandleBlock(Effects.NIGHT_VISION,    70, 0, CANDLE_PROPERTIES), "poppy_scented_candle",              ItemGroup.DECORATIONS);
		WHITE_TULIP_SCENTED_CANDLE        = registerBlock(new ScentedCandleBlock(Effects.WEAKNESS,        70, 0, CANDLE_PROPERTIES), "white_tulip_scented_candle",        ItemGroup.DECORATIONS);
		ORANGE_TULIP_SCENTED_CANDLE       = registerBlock(new ScentedCandleBlock(Effects.WEAKNESS,        70, 0, CANDLE_PROPERTIES), "orange_tulip_scented_candle",       ItemGroup.DECORATIONS);
		PINK_TULIP_SCENTED_CANDLE         = registerBlock(new ScentedCandleBlock(Effects.WEAKNESS,        70, 0, CANDLE_PROPERTIES), "pink_tulip_scented_candle",         ItemGroup.DECORATIONS);
		RED_TULIP_SCENTED_CANDLE          = registerBlock(new ScentedCandleBlock(Effects.WEAKNESS,        70, 0, CANDLE_PROPERTIES), "red_tulip_scented_candle",          ItemGroup.DECORATIONS);
		WITHER_ROSE_SCENTED_CANDLE        = registerBlock(new ScentedCandleBlock(Effects.WITHER,          70, 0, CANDLE_PROPERTIES), "wither_rose_scented_candle",        ItemGroup.DECORATIONS);
		
		//Mod Scented Candles Section
		CARTWHEEL_SCENTED_CANDLE    = registerBlock(new ScentedCandleBlock(Effects.SPEED,           70, 0, CANDLE_PROPERTIES), "cartwheel_scented_candle",    ItemGroup.DECORATIONS);
		BLUEBELL_SCENTED_CANDLE     = registerBlock(new ScentedCandleBlock(Effects.WATER_BREATHING, 70, 0, CANDLE_PROPERTIES), "bluebell_scented_candle",     ItemGroup.DECORATIONS);
		DAYBLOOM_SCENTED_CANDLE     = registerBlock(new ScentedCandleBlock(Effects.GLOWING,         70, 0, CANDLE_PROPERTIES), "daybloom_scented_candle",     ItemGroup.DECORATIONS);
		VIOLET_SCENTED_CANDLE       = registerBlock(new ScentedCandleBlock(Effects.INVISIBILITY,    70, 0, CANDLE_PROPERTIES), "violet_scented_candle",       ItemGroup.DECORATIONS);
		JOLYCE_SCENTED_CANDLE       = registerBlock(new ScentedCandleBlock(Effects.STRENGTH,        70, 0, CANDLE_PROPERTIES), "jolyce_scented_candle",       ItemGroup.DECORATIONS);
		COLUMBINE_SCENTED_CANDLE    = registerBlock(new ScentedCandleBlock(Effects.MINING_FATIGUE,  70, 0, CANDLE_PROPERTIES), "columbine_scented_candle",    ItemGroup.DECORATIONS);
		WHITE_CLOVER_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.UNLUCK,          70, 0, CANDLE_PROPERTIES), "white_clover_scented_candle", ItemGroup.DECORATIONS);
		PINK_CLOVER_SCENTED_CANDLE  = registerBlock(new ScentedCandleBlock(Effects.UNLUCK,          70, 0, CANDLE_PROPERTIES), "pink_clover_scented_candle",  ItemGroup.DECORATIONS);
		
		//Flamboyant Compat Section
		if (ModList.get().isLoaded("flamboyant")) {
			AMBER_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "amber_candle", 		ModSetup.itemGroup);
			BEIGE_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "beige_candle", 		ModSetup.itemGroup);
			CREAM_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "cream_candle", 		ModSetup.itemGroup);
			DARK_GREEN_CANDLE 	= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "dark_green_candle", 	ModSetup.itemGroup);
			FOREST_GREEN_CANDLE	= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "forest_green_candle", 	ModSetup.itemGroup);
			HOT_PINK_CANDLE 	= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "hot_pink_candle", 		ModSetup.itemGroup);
			INDIGO_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "indigo_candle", 		ModSetup.itemGroup);
			MAROON_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "maroon_candle", 		ModSetup.itemGroup);
			NAVY_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "navy_candle", 			ModSetup.itemGroup);
			OLIVE_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "olive_candle", 		ModSetup.itemGroup);
			PALE_GREEN_CANDLE 	= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "pale_green_candle", 	ModSetup.itemGroup);
			PALE_PINK_CANDLE 	= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "pale_pink_candle", 	ModSetup.itemGroup);
			PALE_YELLOW_CANDLE 	= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "pale_yellow_candle", 	ModSetup.itemGroup);
			SKY_BLUE_CANDLE 	= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "sky_blue_candle", 		ModSetup.itemGroup);
			SLATE_GRAY_CANDLE 	= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "slate_gray_candle", 	ModSetup.itemGroup);
			VIOLET_CANDLE 		= registerBlock(new CandleBlock(CANDLE_PROPERTIES), "violet_candle", 		ModSetup.itemGroup);
		}
		
		//Quark Compat Section
		if (ModList.get().isLoaded("quark")) {
			VERTICAL_HIVE_PLANKS 		= registerBlock(new Block(Block.Properties.from(HIVE_PLANKS)),              "vertical_hive_planks",      ItemGroup.BUILDING_BLOCKS);
			HIVE_VERTICAL_SLAB 			= registerBlock(new VerticalSlabBlock(Block.Properties.from(HIVE_PLANKS)),  "hive_vertical_slab",        ItemGroup.BUILDING_BLOCKS);
			HONEY_BRICK_VERTICAL_SLAB 	= registerBlock(new VerticalSlabBlock(Block.Properties.from(HONEY_BRICKS)), "honey_brick_vertical_slab", ItemGroup.BUILDING_BLOCKS);	
		}		
    }

	/*@SubscribeEvent
	public static void registerBlocksReplacements(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				new NewSlimeBlock(Block.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).func_226896_b_()).setRegistryName("minecraft:slime_block"),
				new NewHoneyBlock(Block.Properties.create(Material.CLAY, MaterialColor.ADOBE).func_226897_b_(0.4F).func_226898_c_(0.5F).func_226896_b_().sound(SoundType.field_226947_m_)).setRegistryName("minecraft:honey_block")
		);
	}

	@SubscribeEvent
	public static void registerItemsReplacements(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				new BlockItem(ModBlocks.SLIME_BLOCK, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("minecraft:slime_block"),
				new BlockItem(ModBlocks.HONEY_BLOCK, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("minecraft:honey_block")
		);
	}*/

    public static Block registerBlock(Block block, String name, ItemGroup group)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(group));
        block.setRegistryName(BuzzierBees.MODID,name);
        itemBlock.setRegistryName(BuzzierBees.MODID, name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
    
    public static Block registerBlockNoItem(Block block, String name)
    {
        block.setRegistryName(BuzzierBees.MODID,name);
        ForgeRegistries.BLOCKS.register(block);
        return block;
    }

    public static Block registerBlockNoGroupNoItem(Block block, String name)
    {
        block.setRegistryName(BuzzierBees.MODID,name);
        ForgeRegistries.BLOCKS.register(block);
        return block;
    }
    
    /*public static Block registerBlock(Block block, BlockItem itemBlock, String name) {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);

        if (itemBlock != null) {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);
        }

        return block;
    }*/
}