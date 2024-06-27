package net.meh.forged.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.meh.forged.block.ModBlocks;
import net.meh.forged.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registryWrapper) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PLATINUM_HELMET)
                .add(ModItems.PLATINUM_CHESTPLATE)
                .add(ModItems.PLATINUM_LEGGINGS)
                .add(ModItems.PLATINUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.MAPLE_PLANKS.asItem())
                .add(ModBlocks.MAPLE_PLANKS_CARVED.asItem())
                .add(ModBlocks.BLEAK_PLANKS.asItem())
                .add(ModBlocks.BLEAK_PLANKS_CARVED.asItem())
                .add(ModBlocks.FIR_PLANKS.asItem())
                .add(ModBlocks.FIR_PLANKS_CARVED.asItem())
                .add(ModBlocks.PALM_PLANKS.asItem())
                .add(ModBlocks.PALM_PLANKS_CARVED.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem())
                .add(ModBlocks.BLEAK_LOG.asItem())
                .add(ModBlocks.STRIPPED_BLEAK_LOG.asItem())
                .add(ModBlocks.BLEAK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BLEAK_WOOD.asItem())
                .add(ModBlocks.FIR_LOG.asItem())
                .add(ModBlocks.STRIPPED_FIR_LOG.asItem())
                .add(ModBlocks.FIR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_FIR_WOOD.asItem())
                .add(ModBlocks.PALM_LOG.asItem())
                .add(ModBlocks.STRIPPED_PALM_LOG.asItem())
                .add(ModBlocks.PALM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PALM_WOOD.asItem());
    }
}
