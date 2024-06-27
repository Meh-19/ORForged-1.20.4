package net.meh.forged.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.meh.forged.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PLATINUM_ORE)
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)
                .add(ModBlocks.PLATINUM_BLOCK)
                .add(ModBlocks.PLATINUM_BRICKS)
                .add(ModBlocks.PLATINUM_PILLAR)

                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_BRICKS)
                .add(ModBlocks.RUBY_PILLAR);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.MAPLE_PLANKS)
                .add(ModBlocks.MAPLE_PLANKS_CARVED)
                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_MAPLE_WOOD)
                .add(ModBlocks.MAPLE_STAIRS)
                .add(ModBlocks.MAPLE_SLAB)
                .add(ModBlocks.MAPLE_BUTTON)
                .add(ModBlocks.MAPLE_PRESSURE_PLATE)
                .add(ModBlocks.MAPLE_FENCE)
                .add(ModBlocks.MAPLE_FENCE_GATE)
                .add(ModBlocks.BLEAK_PLANKS)
                .add(ModBlocks.BLEAK_PLANKS_CARVED)
                .add(ModBlocks.BLEAK_LOG)
                .add(ModBlocks.STRIPPED_BLEAK_LOG)
                .add(ModBlocks.BLEAK_WOOD)
                .add(ModBlocks.STRIPPED_BLEAK_WOOD)
                .add(ModBlocks.BLEAK_STAIRS)
                .add(ModBlocks.BLEAK_SLAB)
                .add(ModBlocks.BLEAK_BUTTON)
                .add(ModBlocks.BLEAK_PRESSURE_PLATE)
                .add(ModBlocks.BLEAK_FENCE)
                .add(ModBlocks.BLEAK_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.ORANGE_MAPLE_LEAVES)
                .add(ModBlocks.RED_MAPLE_LEAVES);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PLATINUM_ORE)
                .add(ModBlocks.RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_MAPLE_WOOD)
                .add(ModBlocks.BLEAK_LOG)
                .add(ModBlocks.STRIPPED_BLEAK_LOG)
                .add(ModBlocks.BLEAK_WOOD)
                .add(ModBlocks.STRIPPED_BLEAK_WOOD);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.MAPLE_FENCE)
                .add(ModBlocks.BLEAK_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.MAPLE_FENCE_GATE)
                .add(ModBlocks.BLEAK_FENCE_GATE);

    }
}
