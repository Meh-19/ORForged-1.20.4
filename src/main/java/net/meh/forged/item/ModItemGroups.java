package net.meh.forged.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.meh.forged.ForgedMod;
import net.meh.forged.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FORGED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ForgedMod.MOD_ID, "forged"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.forged"))
                    .icon(() -> new ItemStack(ModItems.PLATINUM)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModBlocks.PLATINUM_BRICKS);
                        entries.add(ModBlocks.PLATINUM_PILLAR);
                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);

                        entries.add(ModItems.PLATINUM);

                        entries.add(ModItems.PLATINUM_SWORD);
                        entries.add(ModItems.PLATINUM_PICKAXE);
                        entries.add(ModItems.PLATINUM_AXE);
                        entries.add(ModItems.PLATINUM_SHOVEL);
                        entries.add(ModItems.PLATINUM_HOE);

                        entries.add(ModItems.PLATINUM_HELMET);
                        entries.add(ModItems.PLATINUM_CHESTPLATE);
                        entries.add(ModItems.PLATINUM_LEGGINGS);
                        entries.add(ModItems.PLATINUM_BOOTS);

                        entries.add(ModItems.RUBY);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_BRICKS);
                        entries.add(ModBlocks.RUBY_PILLAR);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);

                        entries.add(ModBlocks.MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_MAPLE_LOG);
                        entries.add(ModBlocks.MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAPLE_WOOD);
                        entries.add(ModBlocks.MAPLE_PLANKS);
                        entries.add(ModBlocks.ORANGE_MAPLE_LEAVES);
                        entries.add(ModBlocks.RED_MAPLE_LEAVES);

                    }).build());

    public static void registerItemGroups() {
        ForgedMod.LOGGER.info("Registering Item Groups for " + ForgedMod.MOD_ID);
    }

}