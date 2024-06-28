package net.meh.forged.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.meh.forged.ForgedMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block PLATINUM_BRICKS = registerBlock("platinum_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block PLATINUM_PILLAR = registerBlock("platinum_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(5.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.STONE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block RUBY_BRICKS = registerBlock("ruby_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block RUBY_PILLAR = registerBlock("ruby_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(5.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.STONE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block MAPLE_LOG = registerBlock("maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block MAPLE_PLANKS_CARVED = registerBlock("maple_planks_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block ORANGE_MAPLE_LEAVES = registerBlock("orange_maple_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));

    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new StairsBlock(ModBlocks.MAPLE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BLEAK_LOG = registerBlock("bleak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block BLEAK_WOOD = registerBlock("bleak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_BLEAK_LOG = registerBlock("stripped_bleak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_BLEAK_WOOD = registerBlock("stripped_bleak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block BLEAK_PLANKS = registerBlock("bleak_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block BLEAK_PLANKS_CARVED = registerBlock("bleak_planks_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block BLEAK_LEAVES = registerBlock("bleak_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));

    public static final Block BLEAK_STAIRS = registerBlock("bleak_stairs",
            new StairsBlock(ModBlocks.BLEAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLEAK_SLAB = registerBlock("bleak_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BLEAK_BUTTON = registerBlock("bleak_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLEAK_PRESSURE_PLATE = registerBlock("bleak_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BLEAK_FENCE = registerBlock("bleak_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLEAK_FENCE_GATE = registerBlock("bleak_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block FIR_LOG = registerBlock("fir_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block FIR_WOOD = registerBlock("fir_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_FIR_LOG = registerBlock("stripped_fir_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_FIR_WOOD = registerBlock("stripped_fir_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block FIR_PLANKS = registerBlock("fir_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block FIR_PLANKS_CARVED = registerBlock("fir_planks_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block GREEN_FIR_LEAVES = registerBlock("green_fir_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));
    public static final Block ORANGE_FIR_LEAVES = registerBlock("orange_fir_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));

    public static final Block FIR_STAIRS = registerBlock("fir_stairs",
            new StairsBlock(ModBlocks.FIR_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIR_SLAB = registerBlock("fir_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block FIR_BUTTON = registerBlock("fir_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIR_PRESSURE_PLATE = registerBlock("fir_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block FIR_FENCE = registerBlock("fir_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIR_FENCE_GATE = registerBlock("fir_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PALM_LOG = registerBlock("palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block PALM_PLANKS_CARVED = registerBlock("palm_planks_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block PALM_CROWN = registerBlock("palm_crown",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));

    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PALM_BUTTON = registerBlock("palm_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PALM_FENCE = registerBlock("palm_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BAYOU_LOG = registerBlock("bayou_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block BAYOU_WOOD = registerBlock("bayou_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_BAYOU_LOG = registerBlock("stripped_bayou_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_BAYOU_WOOD = registerBlock("stripped_bayou_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block BAYOU_PLANKS = registerBlock("bayou_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block BAYOU_PLANKS_CARVED = registerBlock("bayou_planks_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block BAYOU_LEAVES = registerBlock("bayou_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));

    public static final Block BAYOU_STAIRS = registerBlock("bayou_stairs",
            new StairsBlock(ModBlocks.BAYOU_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BAYOU_SLAB = registerBlock("bayou_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BAYOU_BUTTON = registerBlock("bayou_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BAYOU_PRESSURE_PLATE = registerBlock("bayou_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BAYOU_FENCE = registerBlock("bayou_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BAYOU_FENCE_GATE = registerBlock("bayou_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block WISTERIA_LOG = registerBlock("wisteria_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block WISTERIA_WOOD = registerBlock("wisteria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_WISTERIA_LOG = registerBlock("stripped_wisteria_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_WISTERIA_WOOD = registerBlock("stripped_wisteria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block WISTERIA_PLANKS = registerBlock("wisteria_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block WISTERIA_PLANKS_CARVED = registerBlock("wisteria_planks_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block WISTERIA_LEAVES = registerBlock("wisteria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));
    public static final Block WISTERIA_FLOWERS_BLUE = registerBlock("wisteria_flowers_blue",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));
    public static final Block WISTERIA_FLOWERS_PINK = registerBlock("wisteria_flowers_pink",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));
    public static final Block WISTERIA_FLOWERS_PURPLE = registerBlock("wisteria_flowers_purple",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));
    public static final Block WISTERIA_FLOWERS_WHITE = registerBlock("wisteria_flowers_white",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));

    public static final Block WISTERIA_STAIRS = registerBlock("wisteria_stairs",
            new StairsBlock(ModBlocks.WISTERIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WISTERIA_SLAB = registerBlock("wisteria_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block WISTERIA_BUTTON = registerBlock("wisteria_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WISTERIA_PRESSURE_PLATE = registerBlock("wisteria_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block WISTERIA_FENCE = registerBlock("wisteria_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WISTERIA_FENCE_GATE = registerBlock("wisteria_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BAOBAB_LOG = registerBlock("baobab_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block BAOBAB_WOOD = registerBlock("baobab_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_BAOBAB_LOG = registerBlock("stripped_baobab_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_BAOBAB_WOOD = registerBlock("stripped_baobab_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block BAOBAB_PLANKS = registerBlock("baobab_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block BAOBAB_PLANKS_CARVED = registerBlock("baobab_planks_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block BAOBAB_LEAVES = registerBlock("baobab_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2F).nonOpaque()));

    public static final Block BAOBAB_STAIRS = registerBlock("baobab_stairs",
            new StairsBlock(ModBlocks.BAOBAB_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BAOBAB_SLAB = registerBlock("baobab_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BAOBAB_BUTTON = registerBlock("baobab_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BAOBAB_PRESSURE_PLATE = registerBlock("baobab_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BAOBAB_FENCE = registerBlock("baobab_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BAOBAB_FENCE_GATE = registerBlock("baobab_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block FUNGAL_PLANKS = registerBlock("fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block FUNGAL_PLANKS_CARVED = registerBlock("fungal_planks_carved",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));

    public static final Block FUNGAL_STAIRS = registerBlock("fungal_stairs",
            new StairsBlock(ModBlocks.FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FUNGAL_SLAB = registerBlock("fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block FUNGAL_BUTTON = registerBlock("fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FUNGAL_PRESSURE_PLATE = registerBlock("fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block FUNGAL_FENCE = registerBlock("fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FUNGAL_FENCE_GATE = registerBlock("fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block WHITE_FUNGAL_PLANKS = registerBlock("white_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block WHITE_FUNGAL_STAIRS = registerBlock("white_fungal_stairs",
            new StairsBlock(ModBlocks.WHITE_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_FUNGAL_SLAB = registerBlock("white_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_FUNGAL_BUTTON = registerBlock("white_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_FUNGAL_PRESSURE_PLATE = registerBlock("white_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_FUNGAL_FENCE = registerBlock("white_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_FUNGAL_FENCE_GATE = registerBlock("white_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LIGHT_GRAY_FUNGAL_PLANKS = registerBlock("light_gray_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block LIGHT_GRAY_FUNGAL_STAIRS = registerBlock("light_gray_fungal_stairs",
            new StairsBlock(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIGHT_GRAY_FUNGAL_SLAB = registerBlock("light_gray_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIGHT_GRAY_FUNGAL_BUTTON = registerBlock("light_gray_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIGHT_GRAY_FUNGAL_PRESSURE_PLATE = registerBlock("light_gray_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIGHT_GRAY_FUNGAL_FENCE = registerBlock("light_gray_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIGHT_GRAY_FUNGAL_FENCE_GATE = registerBlock("light_gray_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block GRAY_FUNGAL_PLANKS = registerBlock("gray_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block GRAY_FUNGAL_STAIRS = registerBlock("gray_fungal_stairs",
            new StairsBlock(ModBlocks.GRAY_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GRAY_FUNGAL_SLAB = registerBlock("_gray_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GRAY_FUNGAL_BUTTON = registerBlock("gray_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GRAY_FUNGAL_PRESSURE_PLATE = registerBlock("gray_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GRAY_FUNGAL_FENCE = registerBlock("gray_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GRAY_FUNGAL_FENCE_GATE = registerBlock("gray_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BLACK_FUNGAL_PLANKS = registerBlock("black_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block BLACK_FUNGAL_STAIRS = registerBlock("black_fungal_stairs",
            new StairsBlock(ModBlocks.BLACK_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_FUNGAL_SLAB = registerBlock("black_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_FUNGAL_BUTTON = registerBlock("black_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_FUNGAL_PRESSURE_PLATE = registerBlock("black_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_FUNGAL_FENCE = registerBlock("black_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_FUNGAL_FENCE_GATE = registerBlock("black_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BROWN_FUNGAL_PLANKS = registerBlock("brown_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block BROWN_FUNGAL_STAIRS = registerBlock("brown_fungal_stairs",
            new StairsBlock(ModBlocks.BROWN_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BROWN_FUNGAL_SLAB = registerBlock("brown_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BROWN_FUNGAL_BUTTON = registerBlock("brown_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BROWN_FUNGAL_PRESSURE_PLATE = registerBlock("brown_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BROWN_FUNGAL_FENCE = registerBlock("brown_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BROWN_FUNGAL_FENCE_GATE = registerBlock("brown_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block RED_FUNGAL_PLANKS = registerBlock("red_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block RED_FUNGAL_STAIRS = registerBlock("red_fungal_stairs",
            new StairsBlock(ModBlocks.RED_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_FUNGAL_SLAB = registerBlock("red_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_FUNGAL_BUTTON = registerBlock("red_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_FUNGAL_PRESSURE_PLATE = registerBlock("red_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_FUNGAL_FENCE = registerBlock("red_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_FUNGAL_FENCE_GATE = registerBlock("red_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block ORANGE_FUNGAL_PLANKS = registerBlock("orange_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block ORANGE_FUNGAL_STAIRS = registerBlock("orange_fungal_stairs",
            new StairsBlock(ModBlocks.ORANGE_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_FUNGAL_SLAB = registerBlock("orange_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_FUNGAL_BUTTON = registerBlock("orange_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_FUNGAL_PRESSURE_PLATE = registerBlock("orange_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_FUNGAL_FENCE = registerBlock("orange_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_FUNGAL_FENCE_GATE = registerBlock("orange_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block YELLOW_FUNGAL_PLANKS = registerBlock("yellow_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block YELLOW_FUNGAL_STAIRS = registerBlock("yellow_fungal_stairs",
            new StairsBlock(ModBlocks.YELLOW_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_FUNGAL_SLAB = registerBlock("yellow_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_FUNGAL_BUTTON = registerBlock("yellow_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_FUNGAL_PRESSURE_PLATE = registerBlock("yellow_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_FUNGAL_FENCE = registerBlock("yellow_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_FUNGAL_FENCE_GATE = registerBlock("yellow_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LIME_FUNGAL_PLANKS = registerBlock("lime_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block LIME_FUNGAL_STAIRS = registerBlock("lime_fungal_stairs",
            new StairsBlock(ModBlocks.LIME_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIME_FUNGAL_SLAB = registerBlock("lime_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIME_FUNGAL_BUTTON = registerBlock("lime_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIME_FUNGAL_PRESSURE_PLATE = registerBlock("lime_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIME_FUNGAL_FENCE = registerBlock("lime_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIME_FUNGAL_FENCE_GATE = registerBlock("lime_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block GREEN_FUNGAL_PLANKS = registerBlock("green_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block GREEN_FUNGAL_STAIRS = registerBlock("green_fungal_stairs",
            new StairsBlock(ModBlocks.GREEN_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_FUNGAL_SLAB = registerBlock("green_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_FUNGAL_BUTTON = registerBlock("green_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_FUNGAL_PRESSURE_PLATE = registerBlock("green_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_FUNGAL_FENCE = registerBlock("green_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_FUNGAL_FENCE_GATE = registerBlock("green_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block CYAN_FUNGAL_PLANKS = registerBlock("cyan_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block CYAN_FUNGAL_STAIRS = registerBlock("cyan_fungal_stairs",
            new StairsBlock(ModBlocks.CYAN_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CYAN_FUNGAL_SLAB = registerBlock("cyan_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CYAN_FUNGAL_BUTTON = registerBlock("cyan_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CYAN_FUNGAL_PRESSURE_PLATE = registerBlock("cyan_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CYAN_FUNGAL_FENCE = registerBlock("cyan_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CYAN_FUNGAL_FENCE_GATE = registerBlock("cyan_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LIGHT_BLUE_FUNGAL_PLANKS = registerBlock("light_blue_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block LIGHT_BLUE_FUNGAL_STAIRS = registerBlock("light_blue_fungal_stairs",
            new StairsBlock(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIGHT_BLUE_FUNGAL_SLAB = registerBlock("light_blue_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIGHT_BLUE_FUNGAL_BUTTON = registerBlock("light_blue_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIGHT_BLUE_FUNGAL_PRESSURE_PLATE = registerBlock("light_blue_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIGHT_BLUE_FUNGAL_FENCE = registerBlock("light_blue_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LIGHT_BLUE_FUNGAL_FENCE_GATE = registerBlock("light_blue_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BLUE_FUNGAL_PLANKS = registerBlock("blue_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block BLUE_FUNGAL_STAIRS = registerBlock("blue_fungal_stairs",
            new StairsBlock(ModBlocks.BLUE_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_FUNGAL_SLAB = registerBlock("blue_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_FUNGAL_BUTTON = registerBlock("blue_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_FUNGAL_PRESSURE_PLATE = registerBlock("blue_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_FUNGAL_FENCE = registerBlock("blue_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_FUNGAL_FENCE_GATE = registerBlock("blue_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PURPLE_FUNGAL_PLANKS = registerBlock("purple_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block PURPLE_FUNGAL_STAIRS = registerBlock("purple_fungal_stairs",
            new StairsBlock(ModBlocks.PURPLE_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_FUNGAL_SLAB = registerBlock("purple_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_FUNGAL_BUTTON = registerBlock("purple_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_FUNGAL_PRESSURE_PLATE = registerBlock("purple_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_FUNGAL_FENCE = registerBlock("purple_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_FUNGAL_FENCE_GATE = registerBlock("purple_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block MAGENTA_FUNGAL_PLANKS = registerBlock("magenta_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block MAGENTA_FUNGAL_STAIRS = registerBlock("magenta_fungal_stairs",
            new StairsBlock(ModBlocks.MAGENTA_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAGENTA_FUNGAL_SLAB = registerBlock("magenta_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAGENTA_FUNGAL_BUTTON = registerBlock("magenta_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAGENTA_FUNGAL_PRESSURE_PLATE = registerBlock("magenta_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAGENTA_FUNGAL_FENCE = registerBlock("magenta_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAGENTA_FUNGAL_FENCE_GATE = registerBlock("magenta_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PINK_FUNGAL_PLANKS = registerBlock("pink_fungal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final Block PINK_FUNGAL_STAIRS = registerBlock("pink_fungal_stairs",
            new StairsBlock(ModBlocks.PINK_FUNGAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PINK_FUNGAL_SLAB = registerBlock("pink_fungal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PINK_FUNGAL_BUTTON = registerBlock("pink_fungal_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PINK_FUNGAL_PRESSURE_PLATE = registerBlock("pink_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PINK_FUNGAL_FENCE = registerBlock("pink_fungal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PINK_FUNGAL_FENCE_GATE = registerBlock("pink_fungal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(PLATINUM_BLOCK);
        entries.add(PLATINUM_BRICKS);
        entries.add(PLATINUM_PILLAR);
        entries.add(PLATINUM_ORE);
        entries.add(DEEPSLATE_PLATINUM_ORE);

    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ForgedMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ForgedMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ForgedMod.LOGGER.info("Registering ModBlocks for " + ForgedMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToIngredientItemGroup);
    }

}
