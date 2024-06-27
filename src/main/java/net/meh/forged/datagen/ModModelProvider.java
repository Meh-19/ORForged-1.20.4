package net.meh.forged.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.meh.forged.block.ModBlocks;
import net.meh.forged.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_PILLAR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_PILLAR);

        blockStateModelGenerator.registerLog(ModBlocks.MAPLE_LOG).log(ModBlocks.MAPLE_LOG).wood(ModBlocks.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MAPLE_LOG).log(ModBlocks.STRIPPED_MAPLE_LOG).wood(ModBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_MAPLE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_MAPLE_LEAVES);
        BlockStateModelGenerator.BlockTexturePool maplePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAPLE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAPLE_PLANKS_CARVED);

        maplePool.stairs(ModBlocks.MAPLE_STAIRS);
        maplePool.slab(ModBlocks.MAPLE_SLAB);
        maplePool.button(ModBlocks.MAPLE_BUTTON);
        maplePool.pressurePlate(ModBlocks.MAPLE_PRESSURE_PLATE);
        maplePool.fence(ModBlocks.MAPLE_FENCE);
        maplePool.fenceGate(ModBlocks.MAPLE_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.BLEAK_LOG).log(ModBlocks.BLEAK_LOG).wood(ModBlocks.BLEAK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLEAK_LOG).log(ModBlocks.STRIPPED_BLEAK_LOG).wood(ModBlocks.STRIPPED_BLEAK_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLEAK_LEAVES);
        BlockStateModelGenerator.BlockTexturePool bleakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLEAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLEAK_PLANKS_CARVED);

        bleakPool.stairs(ModBlocks.BLEAK_STAIRS);
        bleakPool.slab(ModBlocks.BLEAK_SLAB);
        bleakPool.button(ModBlocks.BLEAK_BUTTON);
        bleakPool.pressurePlate(ModBlocks.BLEAK_PRESSURE_PLATE);
        bleakPool.fence(ModBlocks.BLEAK_FENCE);
        bleakPool.fenceGate(ModBlocks.BLEAK_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.FIR_LOG).log(ModBlocks.FIR_LOG).wood(ModBlocks.FIR_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_FIR_LOG).log(ModBlocks.STRIPPED_FIR_LOG).wood(ModBlocks.STRIPPED_FIR_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_FIR_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_FIR_LEAVES);
        BlockStateModelGenerator.BlockTexturePool firPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIR_PLANKS_CARVED);

        firPool.stairs(ModBlocks.FIR_STAIRS);
        firPool.slab(ModBlocks.FIR_SLAB);
        firPool.button(ModBlocks.FIR_BUTTON);
        firPool.pressurePlate(ModBlocks.FIR_PRESSURE_PLATE);
        firPool.fence(ModBlocks.FIR_FENCE);
        firPool.fenceGate(ModBlocks.FIR_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG).log(ModBlocks.PALM_LOG).wood(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG).log(ModBlocks.STRIPPED_PALM_LOG).wood(ModBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_LEAVES);
        BlockStateModelGenerator.BlockTexturePool palmPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_PLANKS_CARVED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_CROWN);

        palmPool.stairs(ModBlocks.PALM_STAIRS);
        palmPool.slab(ModBlocks.PALM_SLAB);
        palmPool.button(ModBlocks.PALM_BUTTON);
        palmPool.pressurePlate(ModBlocks.PALM_PRESSURE_PLATE);
        palmPool.fence(ModBlocks.PALM_FENCE);
        palmPool.fenceGate(ModBlocks.PALM_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.BAYOU_LOG).log(ModBlocks.BAYOU_LOG).wood(ModBlocks.BAYOU_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BAYOU_LOG).log(ModBlocks.STRIPPED_BAYOU_LOG).wood(ModBlocks.STRIPPED_BAYOU_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAYOU_LEAVES);
        BlockStateModelGenerator.BlockTexturePool bayouPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAYOU_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAYOU_PLANKS_CARVED);

        bayouPool.stairs(ModBlocks.BAYOU_STAIRS);
        bayouPool.slab(ModBlocks.BAYOU_SLAB);
        bayouPool.button(ModBlocks.BAYOU_BUTTON);
        bayouPool.pressurePlate(ModBlocks.BAYOU_PRESSURE_PLATE);
        bayouPool.fence(ModBlocks.BAYOU_FENCE);
        bayouPool.fenceGate(ModBlocks.BAYOU_FENCE_GATE);

        blockStateModelGenerator.registerLog(ModBlocks.WISTERIA_LOG).log(ModBlocks.WISTERIA_LOG).wood(ModBlocks.WISTERIA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WISTERIA_LOG).log(ModBlocks.STRIPPED_WISTERIA_LOG).wood(ModBlocks.STRIPPED_WISTERIA_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_FLOWERS_WHITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_FLOWERS_BLUE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_FLOWERS_PINK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_FLOWERS_PURPLE);
        BlockStateModelGenerator.BlockTexturePool wisteriaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WISTERIA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WISTERIA_PLANKS_CARVED);

        wisteriaPool.stairs(ModBlocks.WISTERIA_STAIRS);
        wisteriaPool.slab(ModBlocks.WISTERIA_SLAB);
        wisteriaPool.button(ModBlocks.WISTERIA_BUTTON);
        wisteriaPool.pressurePlate(ModBlocks.WISTERIA_PRESSURE_PLATE);
        wisteriaPool.fence(ModBlocks.WISTERIA_FENCE);
        wisteriaPool.fenceGate(ModBlocks.WISTERIA_FENCE_GATE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.PLATINUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_BOOTS));
    }
}
