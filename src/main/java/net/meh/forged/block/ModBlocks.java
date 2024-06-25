package net.meh.forged.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.meh.forged.ForgedMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
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
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.STONE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(PLATINUM_BLOCK);
        entries.add(PLATINUM_BRICKS);
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
