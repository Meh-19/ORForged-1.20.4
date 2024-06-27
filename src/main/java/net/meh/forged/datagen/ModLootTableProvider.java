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
        addDrop(ModBlocks.BLEAK_PLANKS_CARVED);

        addDrop(ModBlocks.BLEAK_STAIRS);
        addDrop(ModBlocks.BLEAK_BUTTON);
        addDrop(ModBlocks.BLEAK_PRESSURE_PLATE);
        addDrop(ModBlocks.BLEAK_FENCE);
        addDrop(ModBlocks.BLEAK_FENCE_GATE);
        addDrop(ModBlocks.BLEAK_SLAB, slabDrops(ModBlocks.BLEAK_SLAB));

        addDrop(ModBlocks.BLEAK_LEAVES, leavesDrops(ModBlocks.RED_MAPLE_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.FIR_LOG);
        addDrop(ModBlocks.STRIPPED_FIR_LOG);
        addDrop(ModBlocks.FIR_WOOD);
        addDrop(ModBlocks.STRIPPED_FIR_WOOD);
        addDrop(ModBlocks.FIR_PLANKS);
        addDrop(ModBlocks.FIR_PLANKS_CARVED);

        addDrop(ModBlocks.FIR_STAIRS);
        addDrop(ModBlocks.FIR_BUTTON);
        addDrop(ModBlocks.FIR_PRESSURE_PLATE);
        addDrop(ModBlocks.FIR_FENCE);
        addDrop(ModBlocks.FIR_FENCE_GATE);
        addDrop(ModBlocks.FIR_SLAB, slabDrops(ModBlocks.FIR_SLAB));

        addDrop(ModBlocks.GREEN_FIR_LEAVES, leavesDrops(ModBlocks.GREEN_FIR_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.ORANGE_FIR_LEAVES, leavesDrops(ModBlocks.ORANGE_FIR_LEAVES, ModBlocks.RUBY_BLOCK, 0.0025f)); //TODO
    }
}
