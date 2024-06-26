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
    public static final ItemGroup PLATINUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ForgedMod.MOD_ID, "platinum"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.platinum"))
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

                    }).build());

    public static void registerItemGroups() {
        ForgedMod.LOGGER.info("Registering Item Groups for " + ForgedMod.MOD_ID);
    }

}