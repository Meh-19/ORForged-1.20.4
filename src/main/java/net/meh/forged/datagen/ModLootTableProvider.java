package net.meh.forged.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.meh.forged.block.ModBlocks;
import net.meh.forged.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PLATINUM_BLOCK);
        addDrop(ModBlocks.PLATINUM_BRICKS);
        addDrop(ModBlocks.PLATINUM_PILLAR);

        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_BRICKS);
        addDrop(ModBlocks.RUBY_PILLAR);

        addDrop(ModBlocks.PLATINUM_ORE, oreDrops(ModBlocks.PLATINUM_ORE, ModItems.PLATINUM));
        addDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE, oreDrops(ModBlocks.PLATINUM_ORE, ModItems.PLATINUM));

        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));

        addDrop(ModBlocks.MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_MAPLE_LOG);
        addDrop(ModBlocks.MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_MAPLE_WOOD);
        addDrop(ModBlocks.MAPLE_PLANKS);
        addDrop(ModBlocks.VERTICAL_MAPLE_PLANKS);
        addDrop(ModBlocks.MAPLE_PLANKS_CARVED);

        addDrop(ModBlocks.MAPLE_STAIRS);
        addDrop(ModBlocks.MAPLE_BUTTON);
        addDrop(ModBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAPLE_FENCE);
        addDrop(ModBlocks.MAPLE_FENCE_GATE);
        addDrop(ModBlocks.MAPLE_SLAB, slabDrops(ModBlocks.MAPLE_SLAB));

        addDrop(ModBlocks.RED_MAPLE_LEAVES, leavesDrops(ModBlocks.RED_MAPLE_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.ORANGE_MAPLE_LEAVES, leavesDrops(ModBlocks.ORANGE_MAPLE_LEAVES, ModBlocks.RUBY_BLOCK, 0.0025f)); //TODO

        addDrop(ModBlocks.BLEAK_LOG);
        addDrop(ModBlocks.STRIPPED_BLEAK_LOG);
        addDrop(ModBlocks.BLEAK_WOOD);
        addDrop(ModBlocks.STRIPPED_BLEAK_WOOD);
        addDrop(ModBlocks.BLEAK_PLANKS);
        addDrop(ModBlocks.VERTICAL_BLEAK_PLANKS);
        addDrop(ModBlocks.BLEAK_PLANKS_CARVED);

        addDrop(ModBlocks.BLEAK_STAIRS);
        addDrop(ModBlocks.BLEAK_BUTTON);
        addDrop(ModBlocks.BLEAK_PRESSURE_PLATE);
        addDrop(ModBlocks.BLEAK_FENCE);
        addDrop(ModBlocks.BLEAK_FENCE_GATE);
        addDrop(ModBlocks.BLEAK_SLAB, slabDrops(ModBlocks.BLEAK_SLAB));

        addDrop(ModBlocks.BLEAK_LEAVES, leavesDrops(ModBlocks.BLEAK_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.FIR_LOG);
        addDrop(ModBlocks.STRIPPED_FIR_LOG);
        addDrop(ModBlocks.FIR_WOOD);
        addDrop(ModBlocks.STRIPPED_FIR_WOOD);
        addDrop(ModBlocks.FIR_PLANKS);
        addDrop(ModBlocks.VERTICAL_FIR_PLANKS);
        addDrop(ModBlocks.FIR_PLANKS_CARVED);

        addDrop(ModBlocks.FIR_STAIRS);
        addDrop(ModBlocks.FIR_BUTTON);
        addDrop(ModBlocks.FIR_PRESSURE_PLATE);
        addDrop(ModBlocks.FIR_FENCE);
        addDrop(ModBlocks.FIR_FENCE_GATE);
        addDrop(ModBlocks.FIR_SLAB, slabDrops(ModBlocks.FIR_SLAB));

        addDrop(ModBlocks.GREEN_FIR_LEAVES, leavesDrops(ModBlocks.GREEN_FIR_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.ORANGE_FIR_LEAVES, leavesDrops(ModBlocks.ORANGE_FIR_LEAVES, ModBlocks.RUBY_BLOCK, 0.0025f)); //TODO

        addDrop(ModBlocks.PALM_LOG);
        addDrop(ModBlocks.STRIPPED_PALM_LOG);
        addDrop(ModBlocks.PALM_WOOD);
        addDrop(ModBlocks.STRIPPED_PALM_WOOD);
        addDrop(ModBlocks.PALM_PLANKS);
        addDrop(ModBlocks.VERTICAL_PALM_PLANKS);
        addDrop(ModBlocks.PALM_PLANKS_CARVED);
        addDrop(ModBlocks.PALM_CROWN);

        addDrop(ModBlocks.PALM_STAIRS);
        addDrop(ModBlocks.PALM_BUTTON);
        addDrop(ModBlocks.PALM_PRESSURE_PLATE);
        addDrop(ModBlocks.PALM_FENCE);
        addDrop(ModBlocks.PALM_FENCE_GATE);
        addDrop(ModBlocks.PALM_SLAB, slabDrops(ModBlocks.PALM_SLAB));

        addDrop(ModBlocks.PALM_LEAVES, leavesDrops(ModBlocks.PALM_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.BAYOU_LOG);
        addDrop(ModBlocks.STRIPPED_BAYOU_LOG);
        addDrop(ModBlocks.BAYOU_WOOD);
        addDrop(ModBlocks.STRIPPED_BAYOU_WOOD);
        addDrop(ModBlocks.BAYOU_PLANKS);
        addDrop(ModBlocks.VERTICAL_BAYOU_PLANKS);
        addDrop(ModBlocks.BAYOU_PLANKS_CARVED);

        addDrop(ModBlocks.BAYOU_STAIRS);
        addDrop(ModBlocks.BAYOU_BUTTON);
        addDrop(ModBlocks.BAYOU_PRESSURE_PLATE);
        addDrop(ModBlocks.BAYOU_FENCE);
        addDrop(ModBlocks.BAYOU_FENCE_GATE);
        addDrop(ModBlocks.BAYOU_SLAB, slabDrops(ModBlocks.BAYOU_SLAB));

        addDrop(ModBlocks.BAYOU_LEAVES, leavesDrops(ModBlocks.BAYOU_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.WISTERIA_LOG);
        addDrop(ModBlocks.STRIPPED_WISTERIA_LOG);
        addDrop(ModBlocks.WISTERIA_WOOD);
        addDrop(ModBlocks.STRIPPED_WISTERIA_WOOD);
        addDrop(ModBlocks.WISTERIA_PLANKS);
        addDrop(ModBlocks.VERTICAL_WISTERIA_PLANKS);
        addDrop(ModBlocks.WISTERIA_PLANKS_CARVED);

        addDrop(ModBlocks.WISTERIA_STAIRS);
        addDrop(ModBlocks.WISTERIA_BUTTON);
        addDrop(ModBlocks.WISTERIA_PRESSURE_PLATE);
        addDrop(ModBlocks.WISTERIA_FENCE);
        addDrop(ModBlocks.WISTERIA_FENCE_GATE);
        addDrop(ModBlocks.WISTERIA_SLAB, slabDrops(ModBlocks.WISTERIA_SLAB));

        addDrop(ModBlocks.WISTERIA_LEAVES, leavesDrops(ModBlocks.WISTERIA_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.WISTERIA_FLOWERS_BLUE, leavesDrops(ModBlocks.WISTERIA_FLOWERS_BLUE, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.WISTERIA_FLOWERS_PINK, leavesDrops(ModBlocks.WISTERIA_FLOWERS_PINK, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.WISTERIA_FLOWERS_PURPLE, leavesDrops(ModBlocks.WISTERIA_FLOWERS_PURPLE, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.WISTERIA_FLOWERS_WHITE, leavesDrops(ModBlocks.WISTERIA_FLOWERS_WHITE, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.BAOBAB_LOG);
        addDrop(ModBlocks.STRIPPED_BAOBAB_LOG);
        addDrop(ModBlocks.BAOBAB_WOOD);
        addDrop(ModBlocks.STRIPPED_BAOBAB_WOOD);
        addDrop(ModBlocks.BAOBAB_PLANKS);
        addDrop(ModBlocks.VERTICAL_BAOBAB_PLANKS);
        addDrop(ModBlocks.BAOBAB_PLANKS_CARVED);

        addDrop(ModBlocks.BAOBAB_STAIRS);
        addDrop(ModBlocks.BAOBAB_BUTTON);
        addDrop(ModBlocks.BAOBAB_PRESSURE_PLATE);
        addDrop(ModBlocks.BAOBAB_FENCE);
        addDrop(ModBlocks.BAOBAB_FENCE_GATE);
        addDrop(ModBlocks.BAOBAB_SLAB, slabDrops(ModBlocks.BAOBAB_SLAB));

        addDrop(ModBlocks.BAOBAB_LEAVES, leavesDrops(ModBlocks.BAOBAB_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.FUNGAL_PLANKS_CARVED);
        addDrop(ModBlocks.FUNGAL_PLANKS);
        addDrop(ModBlocks.VERTICAL_FUNGAL_PLANKS);
        addDrop(ModBlocks.FUNGAL_STAIRS);
        addDrop(ModBlocks.FUNGAL_BUTTON);
        addDrop(ModBlocks.FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.FUNGAL_FENCE);
        addDrop(ModBlocks.FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.FUNGAL_SLAB, slabDrops(ModBlocks.FUNGAL_SLAB));

        addDrop(ModBlocks.WHITE_FUNGAL_PLANKS);
        addDrop(ModBlocks.WHITE_FUNGAL_STAIRS);
        addDrop(ModBlocks.WHITE_FUNGAL_BUTTON);
        addDrop(ModBlocks.WHITE_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_FUNGAL_FENCE);
        addDrop(ModBlocks.WHITE_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.WHITE_FUNGAL_SLAB, slabDrops(ModBlocks.WHITE_FUNGAL_SLAB));

        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_FUNGAL_SLAB));

        addDrop(ModBlocks.GRAY_FUNGAL_PLANKS);
        addDrop(ModBlocks.GRAY_FUNGAL_STAIRS);
        addDrop(ModBlocks.GRAY_FUNGAL_BUTTON);
        addDrop(ModBlocks.GRAY_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_FUNGAL_FENCE);
        addDrop(ModBlocks.GRAY_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.GRAY_FUNGAL_SLAB, slabDrops(ModBlocks.GRAY_FUNGAL_SLAB));

        addDrop(ModBlocks.BLACK_FUNGAL_PLANKS);
        addDrop(ModBlocks.BLACK_FUNGAL_STAIRS);
        addDrop(ModBlocks.BLACK_FUNGAL_BUTTON);
        addDrop(ModBlocks.BLACK_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_FUNGAL_FENCE);
        addDrop(ModBlocks.BLACK_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.BLACK_FUNGAL_SLAB, slabDrops(ModBlocks.BLACK_FUNGAL_SLAB));

        addDrop(ModBlocks.BROWN_FUNGAL_PLANKS);
        addDrop(ModBlocks.BROWN_FUNGAL_STAIRS);
        addDrop(ModBlocks.BROWN_FUNGAL_BUTTON);
        addDrop(ModBlocks.BROWN_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_FUNGAL_FENCE);
        addDrop(ModBlocks.BROWN_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.BROWN_FUNGAL_SLAB, slabDrops(ModBlocks.BROWN_FUNGAL_SLAB));

        addDrop(ModBlocks.RED_FUNGAL_PLANKS);
        addDrop(ModBlocks.RED_FUNGAL_STAIRS);
        addDrop(ModBlocks.RED_FUNGAL_BUTTON);
        addDrop(ModBlocks.RED_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_FUNGAL_FENCE);
        addDrop(ModBlocks.RED_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.RED_FUNGAL_SLAB, slabDrops(ModBlocks.RED_FUNGAL_SLAB));

        addDrop(ModBlocks.ORANGE_FUNGAL_PLANKS);
        addDrop(ModBlocks.ORANGE_FUNGAL_STAIRS);
        addDrop(ModBlocks.ORANGE_FUNGAL_BUTTON);
        addDrop(ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_FUNGAL_FENCE);
        addDrop(ModBlocks.ORANGE_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_FUNGAL_SLAB, slabDrops(ModBlocks.ORANGE_FUNGAL_SLAB));

        addDrop(ModBlocks.YELLOW_FUNGAL_PLANKS);
        addDrop(ModBlocks.YELLOW_FUNGAL_STAIRS);
        addDrop(ModBlocks.YELLOW_FUNGAL_BUTTON);
        addDrop(ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_FUNGAL_FENCE);
        addDrop(ModBlocks.YELLOW_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_FUNGAL_SLAB, slabDrops(ModBlocks.YELLOW_FUNGAL_SLAB));

        addDrop(ModBlocks.LIME_FUNGAL_PLANKS);
        addDrop(ModBlocks.LIME_FUNGAL_STAIRS);
        addDrop(ModBlocks.LIME_FUNGAL_BUTTON);
        addDrop(ModBlocks.LIME_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_FUNGAL_FENCE);
        addDrop(ModBlocks.LIME_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.LIME_FUNGAL_SLAB, slabDrops(ModBlocks.LIME_FUNGAL_SLAB));

        addDrop(ModBlocks.GREEN_FUNGAL_PLANKS);
        addDrop(ModBlocks.GREEN_FUNGAL_STAIRS);
        addDrop(ModBlocks.GREEN_FUNGAL_BUTTON);
        addDrop(ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_FUNGAL_FENCE);
        addDrop(ModBlocks.GREEN_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.GREEN_FUNGAL_SLAB, slabDrops(ModBlocks.GREEN_FUNGAL_SLAB));

        addDrop(ModBlocks.CYAN_FUNGAL_PLANKS);
        addDrop(ModBlocks.CYAN_FUNGAL_STAIRS);
        addDrop(ModBlocks.CYAN_FUNGAL_BUTTON);
        addDrop(ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_FUNGAL_FENCE);
        addDrop(ModBlocks.CYAN_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.CYAN_FUNGAL_SLAB, slabDrops(ModBlocks.CYAN_FUNGAL_SLAB));

        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_FUNGAL_SLAB));

        addDrop(ModBlocks.BLUE_FUNGAL_PLANKS);
        addDrop(ModBlocks.BLUE_FUNGAL_STAIRS);
        addDrop(ModBlocks.BLUE_FUNGAL_BUTTON);
        addDrop(ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_FUNGAL_FENCE);
        addDrop(ModBlocks.BLUE_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.BLUE_FUNGAL_SLAB, slabDrops(ModBlocks.BLUE_FUNGAL_SLAB));

        addDrop(ModBlocks.PURPLE_FUNGAL_PLANKS);
        addDrop(ModBlocks.PURPLE_FUNGAL_STAIRS);
        addDrop(ModBlocks.PURPLE_FUNGAL_BUTTON);
        addDrop(ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_FUNGAL_FENCE);
        addDrop(ModBlocks.PURPLE_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.PURPLE_FUNGAL_SLAB, slabDrops(ModBlocks.PURPLE_FUNGAL_SLAB));

        addDrop(ModBlocks.MAGENTA_FUNGAL_PLANKS);
        addDrop(ModBlocks.MAGENTA_FUNGAL_STAIRS);
        addDrop(ModBlocks.MAGENTA_FUNGAL_BUTTON);
        addDrop(ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_FUNGAL_FENCE);
        addDrop(ModBlocks.MAGENTA_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_FUNGAL_SLAB, slabDrops(ModBlocks.MAGENTA_FUNGAL_SLAB));

        addDrop(ModBlocks.PINK_FUNGAL_PLANKS);
        addDrop(ModBlocks.PINK_FUNGAL_STAIRS);
        addDrop(ModBlocks.PINK_FUNGAL_BUTTON);
        addDrop(ModBlocks.PINK_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_FUNGAL_FENCE);
        addDrop(ModBlocks.PINK_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.PINK_FUNGAL_SLAB, slabDrops(ModBlocks.PINK_FUNGAL_SLAB));
    }
}
