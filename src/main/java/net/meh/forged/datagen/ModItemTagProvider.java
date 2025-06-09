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
                .add(ModBlocks.OAK_BEAM.asItem())
                .add(ModBlocks.SPRUCE_BEAM.asItem())
                .add(ModBlocks.BIRCH_BEAM.asItem())
                .add(ModBlocks.JUNGLE_BEAM.asItem())
                .add(ModBlocks.ACACIA_BEAM.asItem())
                .add(ModBlocks.DARK_OAK_BEAM.asItem())
                .add(ModBlocks.MANGROVE_BEAM.asItem())
                .add(ModBlocks.CHERRY_BEAM.asItem())
                .add(ModBlocks.WARPED_BEAM.asItem())
                .add(ModBlocks.CRIMSON_BEAM.asItem())

                .add(ModBlocks.MAPLE_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_MAPLE_PLANKS.asItem())
                .add(ModBlocks.MAPLE_PLANKS_CARVED.asItem())
                .add(ModBlocks.MAPLE_BEAM.asItem())
                .add(ModBlocks.BLEAK_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_BLEAK_PLANKS.asItem())
                .add(ModBlocks.BLEAK_PLANKS_CARVED.asItem())
                .add(ModBlocks.BLEAK_BEAM.asItem())
                .add(ModBlocks.FIR_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_FIR_PLANKS.asItem())
                .add(ModBlocks.FIR_PLANKS_CARVED.asItem())
                .add(ModBlocks.FIR_BEAM.asItem())
                .add(ModBlocks.PALM_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_PALM_PLANKS.asItem())
                .add(ModBlocks.PALM_PLANKS_CARVED.asItem())
                .add(ModBlocks.PALM_BEAM.asItem())
                .add(ModBlocks.BAYOU_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_BAYOU_PLANKS.asItem())
                .add(ModBlocks.BAYOU_PLANKS_CARVED.asItem())
                .add(ModBlocks.BAYOU_BEAM.asItem())
                .add(ModBlocks.WISTERIA_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_WISTERIA_PLANKS.asItem())
                .add(ModBlocks.WISTERIA_PLANKS_CARVED.asItem())
                .add(ModBlocks.WISTERIA_BEAM.asItem())
                .add(ModBlocks.BAOBAB_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_BAOBAB_PLANKS.asItem())
                .add(ModBlocks.BAOBAB_PLANKS_CARVED.asItem())
                .add(ModBlocks.BAOBAB_BEAM.asItem())
                .add(ModBlocks.FUNGAL_PLANKS_CARVED.asItem())
                .add(ModBlocks.FUNGAL_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.WHITE_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.GRAY_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.BLACK_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.BROWN_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.RED_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.ORANGE_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.YELLOW_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.LIME_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.GREEN_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.CYAN_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.BLUE_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.PURPLE_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.MAGENTA_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.PINK_FUNGAL_PLANKS.asItem());

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
                .add(ModBlocks.STRIPPED_PALM_WOOD.asItem())
                .add(ModBlocks.BAYOU_LOG.asItem())
                .add(ModBlocks.STRIPPED_BAYOU_LOG.asItem())
                .add(ModBlocks.BAYOU_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BAYOU_WOOD.asItem())
                .add(ModBlocks.WISTERIA_LOG.asItem())
                .add(ModBlocks.STRIPPED_WISTERIA_LOG.asItem())
                .add(ModBlocks.WISTERIA_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WISTERIA_WOOD.asItem())
                .add(ModBlocks.BAOBAB_LOG.asItem())
                .add(ModBlocks.STRIPPED_BAOBAB_LOG.asItem())
                .add(ModBlocks.BAOBAB_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BAOBAB_WOOD.asItem());
    }
}
