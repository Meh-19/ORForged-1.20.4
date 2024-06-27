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
