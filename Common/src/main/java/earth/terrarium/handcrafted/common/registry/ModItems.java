package earth.terrarium.handcrafted.common.registry;

import earth.terrarium.handcrafted.Handcrafted;
import earth.terrarium.handcrafted.common.item.*;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ModItems {
    public static final CreativeModeTab ITEM_GROUP = ModRegistryHelpers.createTab(new ResourceLocation(Handcrafted.MOD_ID, "main"), () -> new ItemStack(ModItems.MANGROVE_FANCY_BED.get()));

    public static final Supplier<Item> BLACK_CUSHION = register("black_cushion", () -> new CushionBlockItem(ModBlocks.BLACK_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BLUE_CUSHION = register("blue_cushion", () -> new CushionBlockItem(ModBlocks.BLUE_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BROWN_CUSHION = register("brown_cushion", () -> new CushionBlockItem(ModBlocks.BROWN_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CYAN_CUSHION = register("cyan_cushion", () -> new CushionBlockItem(ModBlocks.CYAN_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> GRAY_CUSHION = register("gray_cushion", () -> new CushionBlockItem(ModBlocks.GRAY_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> GREEN_CUSHION = register("green_cushion", () -> new CushionBlockItem(ModBlocks.GREEN_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> LIGHT_BLUE_CUSHION = register("light_blue_cushion", () -> new CushionBlockItem(ModBlocks.LIGHT_BLUE_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> LIGHT_GRAY_CUSHION = register("light_gray_cushion", () -> new CushionBlockItem(ModBlocks.LIGHT_GRAY_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> LIME_CUSHION = register("lime_cushion", () -> new CushionBlockItem(ModBlocks.LIME_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MAGENTA_CUSHION = register("magenta_cushion", () -> new CushionBlockItem(ModBlocks.MAGENTA_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> ORANGE_CUSHION = register("orange_cushion", () -> new CushionBlockItem(ModBlocks.ORANGE_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> PINK_CUSHION = register("pink_cushion", () -> new CushionBlockItem(ModBlocks.PINK_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> PURPLE_CUSHION = register("purple_cushion", () -> new CushionBlockItem(ModBlocks.PURPLE_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> RED_CUSHION = register("red_cushion", () -> new CushionBlockItem(ModBlocks.RED_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WHITE_CUSHION = register("white_cushion", () -> new CushionBlockItem(ModBlocks.WHITE_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> YELLOW_CUSHION = register("yellow_cushion", () -> new CushionBlockItem(ModBlocks.YELLOW_CUSHION.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> BLACK_SHEET = register("black_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BLUE_SHEET = register("blue_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BROWN_SHEET = register("brown_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CYAN_SHEET = register("cyan_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> GRAY_SHEET = register("gray_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> GREEN_SHEET = register("green_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> LIGHT_BLUE_SHEET = register("light_blue_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> LIGHT_GRAY_SHEET = register("light_gray_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> LIME_SHEET = register("lime_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MAGENTA_SHEET = register("magenta_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> ORANGE_SHEET = register("orange_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> PINK_SHEET = register("pink_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> PURPLE_SHEET = register("purple_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> RED_SHEET = register("red_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WHITE_SHEET = register("white_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> YELLOW_SHEET = register("yellow_sheet", () -> new SheetItem(new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> HAMMER = register("hammer", () -> new HammerItem(new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> STACKABLE_BOOK = register("stackable_book", () -> new BlockItem(ModBlocks.STACKABLE_BOOK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> FANCY_PAINTING = register("fancy_painting", () -> new FancyPaintingItem(ModEntityTypes.FANCY_PAINTING.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ACACIA_CHAIR = register("acacia_chair", () -> new ModRenderedBlockItem(ModBlocks.ACACIA_CHAIR.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BIRCH_CHAIR = register("birch_chair", () -> new ModRenderedBlockItem(ModBlocks.BIRCH_CHAIR.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> DARK_OAK_CHAIR = register("dark_oak_chair", () -> new ModRenderedBlockItem(ModBlocks.DARK_OAK_CHAIR.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> JUNGLE_CHAIR = register("jungle_chair", () -> new ModRenderedBlockItem(ModBlocks.JUNGLE_CHAIR.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MANGROVE_CHAIR = register("mangrove_chair", () -> new ModRenderedBlockItem(ModBlocks.MANGROVE_CHAIR.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> OAK_CHAIR = register("oak_chair", () -> new ModRenderedBlockItem(ModBlocks.OAK_CHAIR.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPRUCE_CHAIR = register("spruce_chair", () -> new ModRenderedBlockItem(ModBlocks.SPRUCE_CHAIR.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CRIMSON_CHAIR = register("crimson_chair", () -> new ModRenderedBlockItem(ModBlocks.CRIMSON_CHAIR.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WARPED_CHAIR = register("warped_chair", () -> new ModRenderedBlockItem(ModBlocks.WARPED_CHAIR.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ACACIA_TABLE = register("acacia_table", () -> new ModRenderedBlockItem(ModBlocks.ACACIA_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BIRCH_TABLE = register("birch_table", () -> new ModRenderedBlockItem(ModBlocks.BIRCH_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> DARK_OAK_TABLE = register("dark_oak_table", () -> new ModRenderedBlockItem(ModBlocks.DARK_OAK_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> JUNGLE_TABLE = register("jungle_table", () -> new ModRenderedBlockItem(ModBlocks.JUNGLE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MANGROVE_TABLE = register("mangrove_table", () -> new ModRenderedBlockItem(ModBlocks.MANGROVE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> OAK_TABLE = register("oak_table", () -> new ModRenderedBlockItem(ModBlocks.OAK_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPRUCE_TABLE = register("spruce_table", () -> new ModRenderedBlockItem(ModBlocks.SPRUCE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CRIMSON_TABLE = register("crimson_table", () -> new ModRenderedBlockItem(ModBlocks.CRIMSON_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WARPED_TABLE = register("warped_table", () -> new ModRenderedBlockItem(ModBlocks.WARPED_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ACACIA_BENCH = register("acacia_bench", () -> new ModRenderedBlockItem(ModBlocks.ACACIA_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BIRCH_BENCH = register("birch_bench", () -> new ModRenderedBlockItem(ModBlocks.BIRCH_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> DARK_OAK_BENCH = register("dark_oak_bench", () -> new ModRenderedBlockItem(ModBlocks.DARK_OAK_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> JUNGLE_BENCH = register("jungle_bench", () -> new ModRenderedBlockItem(ModBlocks.JUNGLE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MANGROVE_BENCH = register("mangrove_bench", () -> new ModRenderedBlockItem(ModBlocks.MANGROVE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> OAK_BENCH = register("oak_bench", () -> new ModRenderedBlockItem(ModBlocks.OAK_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPRUCE_BENCH = register("spruce_bench", () -> new ModRenderedBlockItem(ModBlocks.SPRUCE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CRIMSON_BENCH = register("crimson_bench", () -> new ModRenderedBlockItem(ModBlocks.CRIMSON_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WARPED_BENCH = register("warped_bench", () -> new ModRenderedBlockItem(ModBlocks.WARPED_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> BENCH = register("bench", () -> new ModRenderedBlockItem(ModBlocks.BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> FROZEN_BENCH = register("frozen_bench", () -> new ModRenderedBlockItem(ModBlocks.FROZEN_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ACACIA_COUCH = register("acacia_couch", () -> new ModRenderedBlockItem(ModBlocks.ACACIA_COUCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BIRCH_COUCH = register("birch_couch", () -> new ModRenderedBlockItem(ModBlocks.BIRCH_COUCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> DARK_OAK_COUCH = register("dark_oak_couch", () -> new ModRenderedBlockItem(ModBlocks.DARK_OAK_COUCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> JUNGLE_COUCH = register("jungle_couch", () -> new ModRenderedBlockItem(ModBlocks.JUNGLE_COUCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MANGROVE_COUCH = register("mangrove_couch", () -> new ModRenderedBlockItem(ModBlocks.MANGROVE_COUCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> OAK_COUCH = register("oak_couch", () -> new ModRenderedBlockItem(ModBlocks.OAK_COUCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPRUCE_COUCH = register("spruce_couch", () -> new ModRenderedBlockItem(ModBlocks.SPRUCE_COUCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CRIMSON_COUCH = register("crimson_couch", () -> new ModRenderedBlockItem(ModBlocks.CRIMSON_COUCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WARPED_COUCH = register("warped_couch", () -> new ModRenderedBlockItem(ModBlocks.WARPED_COUCH.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ACACIA_FANCY_BED = register("acacia_fancy_bed", () -> new ModRenderedBlockItem(ModBlocks.ACACIA_FANCY_BED.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BIRCH_FANCY_BED = register("birch_fancy_bed", () -> new ModRenderedBlockItem(ModBlocks.BIRCH_FANCY_BED.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> DARK_OAK_FANCY_BED = register("dark_oak_fancy_bed", () -> new ModRenderedBlockItem(ModBlocks.DARK_OAK_FANCY_BED.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> JUNGLE_FANCY_BED = register("jungle_fancy_bed", () -> new ModRenderedBlockItem(ModBlocks.JUNGLE_FANCY_BED.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MANGROVE_FANCY_BED = register("mangrove_fancy_bed", () -> new ModRenderedBlockItem(ModBlocks.MANGROVE_FANCY_BED.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> OAK_FANCY_BED = register("oak_fancy_bed", () -> new ModRenderedBlockItem(ModBlocks.OAK_FANCY_BED.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPRUCE_FANCY_BED = register("spruce_fancy_bed", () -> new ModRenderedBlockItem(ModBlocks.SPRUCE_FANCY_BED.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CRIMSON_FANCY_BED = register("crimson_fancy_bed", () -> new ModRenderedBlockItem(ModBlocks.CRIMSON_FANCY_BED.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WARPED_FANCY_BED = register("warped_fancy_bed", () -> new ModRenderedBlockItem(ModBlocks.WARPED_FANCY_BED.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ACACIA_TABLE_BENCH = register("acacia_table_bench", () -> new ModRenderedBlockItem(ModBlocks.ACACIA_TABLE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BIRCH_TABLE_BENCH = register("birch_table_bench", () -> new ModRenderedBlockItem(ModBlocks.BIRCH_TABLE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> DARK_OAK_TABLE_BENCH = register("dark_oak_table_bench", () -> new ModRenderedBlockItem(ModBlocks.DARK_OAK_TABLE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> JUNGLE_TABLE_BENCH = register("jungle_table_bench", () -> new ModRenderedBlockItem(ModBlocks.JUNGLE_TABLE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MANGROVE_TABLE_BENCH = register("mangrove_table_bench", () -> new ModRenderedBlockItem(ModBlocks.MANGROVE_TABLE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> OAK_TABLE_BENCH = register("oak_table_bench", () -> new ModRenderedBlockItem(ModBlocks.OAK_TABLE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPRUCE_TABLE_BENCH = register("spruce_table_bench", () -> new ModRenderedBlockItem(ModBlocks.SPRUCE_TABLE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CRIMSON_TABLE_BENCH = register("crimson_table_bench", () -> new ModRenderedBlockItem(ModBlocks.CRIMSON_TABLE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WARPED_TABLE_BENCH = register("warped_table_bench", () -> new ModRenderedBlockItem(ModBlocks.WARPED_TABLE_BENCH.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ACACIA_NIGHTSTAND = register("acacia_nightstand", () -> new ModRenderedBlockItem(ModBlocks.ACACIA_NIGHTSTAND.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BIRCH_NIGHTSTAND = register("birch_nightstand", () -> new ModRenderedBlockItem(ModBlocks.BIRCH_NIGHTSTAND.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> DARK_OAK_NIGHTSTAND = register("dark_oak_nightstand", () -> new ModRenderedBlockItem(ModBlocks.DARK_OAK_NIGHTSTAND.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> JUNGLE_NIGHTSTAND = register("jungle_nightstand", () -> new ModRenderedBlockItem(ModBlocks.JUNGLE_NIGHTSTAND.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MANGROVE_NIGHTSTAND = register("mangrove_nightstand", () -> new ModRenderedBlockItem(ModBlocks.MANGROVE_NIGHTSTAND.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> OAK_NIGHTSTAND = register("oak_nightstand", () -> new ModRenderedBlockItem(ModBlocks.OAK_NIGHTSTAND.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPRUCE_NIGHTSTAND = register("spruce_nightstand", () -> new ModRenderedBlockItem(ModBlocks.SPRUCE_NIGHTSTAND.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CRIMSON_NIGHTSTAND = register("crimson_nightstand", () -> new ModRenderedBlockItem(ModBlocks.CRIMSON_NIGHTSTAND.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WARPED_NIGHTSTAND = register("warped_nightstand", () -> new ModRenderedBlockItem(ModBlocks.WARPED_NIGHTSTAND.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ACACIA_DESK = register("acacia_desk", () -> new ModRenderedBlockItem(ModBlocks.ACACIA_DESK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BIRCH_DESK = register("birch_desk", () -> new ModRenderedBlockItem(ModBlocks.BIRCH_DESK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> DARK_OAK_DESK = register("dark_oak_desk", () -> new ModRenderedBlockItem(ModBlocks.DARK_OAK_DESK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> JUNGLE_DESK = register("jungle_desk", () -> new ModRenderedBlockItem(ModBlocks.JUNGLE_DESK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MANGROVE_DESK = register("mangrove_desk", () -> new ModRenderedBlockItem(ModBlocks.MANGROVE_DESK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> OAK_DESK = register("oak_desk", () -> new ModRenderedBlockItem(ModBlocks.OAK_DESK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPRUCE_DESK = register("spruce_desk", () -> new ModRenderedBlockItem(ModBlocks.SPRUCE_DESK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CRIMSON_DESK = register("crimson_desk", () -> new ModRenderedBlockItem(ModBlocks.CRIMSON_DESK.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WARPED_DESK = register("warped_desk", () -> new ModRenderedBlockItem(ModBlocks.WARPED_DESK.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ACACIA_SIDE_TABLE = register("acacia_side_table", () -> new ModRenderedBlockItem(ModBlocks.ACACIA_SIDE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BIRCH_SIDE_TABLE = register("birch_side_table", () -> new ModRenderedBlockItem(ModBlocks.BIRCH_SIDE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> DARK_OAK_SIDE_TABLE = register("dark_oak_side_table", () -> new ModRenderedBlockItem(ModBlocks.DARK_OAK_SIDE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> JUNGLE_SIDE_TABLE = register("jungle_side_table", () -> new ModRenderedBlockItem(ModBlocks.JUNGLE_SIDE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MANGROVE_SIDE_TABLE = register("mangrove_side_table", () -> new ModRenderedBlockItem(ModBlocks.MANGROVE_SIDE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> OAK_SIDE_TABLE = register("oak_side_table", () -> new ModRenderedBlockItem(ModBlocks.OAK_SIDE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPRUCE_SIDE_TABLE = register("spruce_side_table", () -> new ModRenderedBlockItem(ModBlocks.SPRUCE_SIDE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CRIMSON_SIDE_TABLE = register("crimson_side_table", () -> new ModRenderedBlockItem(ModBlocks.CRIMSON_SIDE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WARPED_SIDE_TABLE = register("warped_side_table", () -> new ModRenderedBlockItem(ModBlocks.WARPED_SIDE_TABLE.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ACACIA_DRAWER = register("acacia_drawer", () -> new BlockItem(ModBlocks.ACACIA_DRAWER_1.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BIRCH_DRAWER = register("birch_drawer", () -> new BlockItem(ModBlocks.BIRCH_DRAWER_1.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> DARK_OAK_DRAWER = register("dark_oak_drawer", () -> new BlockItem(ModBlocks.DARK_OAK_DRAWER_1.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> JUNGLE_DRAWER = register("jungle_drawer", () -> new BlockItem(ModBlocks.JUNGLE_DRAWER_1.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> MANGROVE_DRAWER = register("mangrove_drawer", () -> new BlockItem(ModBlocks.MANGROVE_DRAWER_1.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> OAK_DRAWER = register("oak_drawer", () -> new BlockItem(ModBlocks.OAK_DRAWER_1.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPRUCE_DRAWER = register("spruce_drawer", () -> new BlockItem(ModBlocks.SPRUCE_DRAWER_1.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CRIMSON_DRAWER = register("crimson_drawer", () -> new BlockItem(ModBlocks.CRIMSON_DRAWER_1.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WARPED_DRAWER = register("warped_drawer", () -> new BlockItem(ModBlocks.WARPED_DRAWER_1.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> OAK_CUPBOARD = register("oak_cupboard", () -> new BlockItem(ModBlocks.OAK_CUPBOARD_1.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> OAK_SHELF = register("oak_shelf", () -> new BlockItem(ModBlocks.OAK_SHELF_1.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> BERRY_JAM_JAR = register("berry_jam_jar", () -> new ModRenderedBlockItem(ModBlocks.BERRY_JAM_JAR.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> WHITE_CUP = register("white_cup", () -> new BlockItem(ModBlocks.WHITE_CUP.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WHITE_PLATE = register("white_plate", () -> new BlockItem(ModBlocks.WHITE_PLATE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WHITE_BOWL = register("white_bowl", () -> new BlockItem(ModBlocks.WHITE_BOWL.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WHITE_CROCKERY_COMBO = register("white_crockery_combo", () -> new BlockItem(ModBlocks.WHITE_CROCKERY_COMBO.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> YELLOW_CUP = register("yellow_cup", () -> new BlockItem(ModBlocks.YELLOW_CUP.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> YELLOW_PLATE = register("yellow_plate", () -> new BlockItem(ModBlocks.YELLOW_PLATE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> YELLOW_BOWL = register("yellow_bowl", () -> new BlockItem(ModBlocks.YELLOW_BOWL.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> YELLOW_CROCKERY_COMBO = register("yellow_crockery_combo", () -> new BlockItem(ModBlocks.YELLOW_CROCKERY_COMBO.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> BLUE_CUP = register("blue_cup", () -> new BlockItem(ModBlocks.BLUE_CUP.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BLUE_PLATE = register("blue_plate", () -> new BlockItem(ModBlocks.BLUE_PLATE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BLUE_BOWL = register("blue_bowl", () -> new BlockItem(ModBlocks.BLUE_BOWL.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BLUE_CROCKERY_COMBO = register("blue_crockery_combo", () -> new BlockItem(ModBlocks.BLUE_CROCKERY_COMBO.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> WOOD_CUP = register("wood_cup", () -> new BlockItem(ModBlocks.WOOD_CUP.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WOOD_PLATE = register("wood_plate", () -> new BlockItem(ModBlocks.WOOD_PLATE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WOOD_BOWL = register("wood_bowl", () -> new BlockItem(ModBlocks.WOOD_BOWL.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WOOD_CROCKERY_COMBO = register("wood_crockery_combo", () -> new BlockItem(ModBlocks.WOOD_CROCKERY_COMBO.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> CLAY_CUP = register("clay_cup", () -> new BlockItem(ModBlocks.CLAY_CUP.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CLAY_PLATE = register("clay_plate", () -> new BlockItem(ModBlocks.CLAY_PLATE.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CLAY_BOWL = register("clay_bowl", () -> new BlockItem(ModBlocks.CLAY_BOWL.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CLAY_CROCKERY_COMBO = register("clay_crockery_combo", () -> new BlockItem(ModBlocks.CLAY_CROCKERY_COMBO.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> ROUGH_THIN_POT = register("rough_thin_pot", () -> new BlockItem(ModBlocks.ROUGH_THIN_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> ROUGH_MEDIUM_POT = register("rough_medium_pot", () -> new BlockItem(ModBlocks.ROUGH_MEDIUM_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> ROUGH_WIDE_POT = register("rough_wide_pot", () -> new BlockItem(ModBlocks.ROUGH_WIDE_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> ROUGH_THICK_POT = register("rough_thick_pot", () -> new BlockItem(ModBlocks.ROUGH_THICK_POT.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> WHITE_GLAZED_THIN_POT = register("white_glazed_thin_pot", () -> new BlockItem(ModBlocks.WHITE_GLAZED_THIN_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WHITE_GLAZED_MEDIUM_POT = register("white_glazed_medium_pot", () -> new BlockItem(ModBlocks.WHITE_GLAZED_MEDIUM_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WHITE_GLAZED_WIDE_POT = register("white_glazed_wide_pot", () -> new BlockItem(ModBlocks.WHITE_GLAZED_WIDE_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WHITE_GLAZED_THICK_POT = register("white_glazed_thick_pot", () -> new BlockItem(ModBlocks.WHITE_GLAZED_THICK_POT.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> GOLD_THIN_POT = register("blue_glazed_thin_pot", () -> new BlockItem(ModBlocks.BLUE_GLAZED_THIN_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BLUE_GLAZED_MEDIUM_POT = register("blue_glazed_medium_pot", () -> new BlockItem(ModBlocks.BLUE_GLAZED_MEDIUM_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BLUE_GLAZED_WIDE_POT = register("blue_glazed_wide_pot", () -> new BlockItem(ModBlocks.BLUE_GLAZED_WIDE_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BLUE_GLAZED_THICK_POT = register("blue_glazed_thick_pot", () -> new BlockItem(ModBlocks.BLUE_GLAZED_THICK_POT.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> GOLDEN_THIN_POT = register("golden_thin_pot", () -> new BlockItem(ModBlocks.GOLDEN_THIN_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> GOLDEN_MEDIUM_POT = register("golden_medium_pot", () -> new BlockItem(ModBlocks.GOLDEN_MEDIUM_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> GOLDEN_WIDE_POT = register("golden_wide_pot", () -> new BlockItem(ModBlocks.GOLDEN_WIDE_POT.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> GOLDEN_THICK_POT = register("golden_thick_pot", () -> new BlockItem(ModBlocks.GOLDEN_THICK_POT.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> BEAR_TROPHY = register("bear_trophy", () -> new BlockItem(ModBlocks.BEAR_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> BLAZE_TROPHY = register("blaze_trophy", () -> new BlockItem(ModBlocks.BLAZE_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> FOX_TROPHY = register("fox_trophy", () -> new BlockItem(ModBlocks.FOX_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> GOAT_TROPHY = register("goat_trophy", () -> new BlockItem(ModBlocks.GOAT_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> PUFFERFISH_TROPHY = register("pufferfish_trophy", () -> new BlockItem(ModBlocks.PUFFERFISH_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SALMON_TROPHY = register("salmon_trophy", () -> new BlockItem(ModBlocks.SALMON_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SILVERFISH_TROPHY = register("silverfish_trophy", () -> new BlockItem(ModBlocks.SILVERFISH_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SKELETON_HORSE_TROPHY = register("skeleton_horse_trophy", () -> new BlockItem(ModBlocks.SKELETON_HORSE_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SPIDER_TROPHY = register("spider_trophy", () -> new BlockItem(ModBlocks.SPIDER_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> TROPICAL_FISH_TROPHY = register("tropical_fish_trophy", () -> new BlockItem(ModBlocks.TROPICAL_FISH_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WITHER_SKELETON_TROPHY = register("wither_skeleton_trophy", () -> new BlockItem(ModBlocks.WITHER_SKELETON_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> WOLF_TROPHY = register("wolf_trophy", () -> new BlockItem(ModBlocks.WOLF_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> PHANTOM_TROPHY = register("phantom_trophy", () -> new BlockItem(ModBlocks.PHANTOM_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> CREEPER_TROPHY = register("creeper_trophy", () -> new BlockItem(ModBlocks.CREEPER_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> SKELETON_TROPHY = register("skeleton_trophy", () -> new BlockItem(ModBlocks.SKELETON_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> EVOKER_TROPHY = register("evoker_trophy", () -> new BlockItem(ModBlocks.EVOKER_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> PILLAGER_TROPHY = register("pillager_trophy", () -> new BlockItem(ModBlocks.PILLAGER_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));
    public static final Supplier<Item> VINDICATOR_TROPHY = register("vindicator_trophy", () -> new BlockItem(ModBlocks.VINDICATOR_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));

    public static final Supplier<Item> WITCH_TROPHY = register("witch_trophy", () -> new ModRenderedBlockItem(ModBlocks.WITCH_TROPHY.get(), new Item.Properties().tab(ITEM_GROUP)));

    private static <T extends Item> Supplier<T> register(String id, Supplier<T> item) {
        return ModRegistryHelpers.register(Registry.ITEM, id, item);
    }

    public static void init() {
    }
}