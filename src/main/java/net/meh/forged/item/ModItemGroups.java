package net.meh.forged.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.meh.forged.ForgedMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PLATINUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ForgedMod.MOD_ID, "platinum"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.platinum"))
                    .icon(() -> new ItemStack(ModItems.PLATINUM)).entries((displayContext, entries) -> {

                        entries.add(ModItems.PLATINUM);
                    }).build());

    public static void registerItemGroups() {
        ForgedMod.LOGGER.info("Registering Item Groups for " + ForgedMod.MOD_ID);
    }

}