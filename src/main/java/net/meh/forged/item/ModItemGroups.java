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
                        entries.add(ModBlocks.MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_MAPLE_WOOD);
                        entries.add(ModBlocks.MAPLE_PLANKS);
                        entries.add(ModBlocks.MAPLE_STAIRS);
                        entries.add(ModBlocks.MAPLE_SLAB);
                        entries.add(ModBlocks.MAPLE_FENCE);
                        entries.add(ModBlocks.MAPLE_FENCE_GATE);
                        entries.add(ModBlocks.MAPLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAPLE_BUTTON);
                        entries.add(ModBlocks.VERTICAL_MAPLE_PLANKS);
                        entries.add(ModBlocks.MAPLE_PLANKS_CARVED);
                        entries.add(ModBlocks.ORANGE_MAPLE_LEAVES);
                        entries.add(ModBlocks.RED_MAPLE_LEAVES);

                        entries.add(ModBlocks.BLEAK_LOG);
                        entries.add(ModBlocks.BLEAK_WOOD);
                        entries.add(ModBlocks.STRIPPED_BLEAK_LOG);
                        entries.add(ModBlocks.STRIPPED_BLEAK_WOOD);
                        entries.add(ModBlocks.BLEAK_PLANKS);
                        entries.add(ModBlocks.BLEAK_STAIRS);
                        entries.add(ModBlocks.BLEAK_SLAB);
                        entries.add(ModBlocks.BLEAK_FENCE);
                        entries.add(ModBlocks.BLEAK_FENCE_GATE);
                        entries.add(ModBlocks.BLEAK_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLEAK_BUTTON);
                        entries.add(ModBlocks.VERTICAL_BLEAK_PLANKS);
                        entries.add(ModBlocks.BLEAK_PLANKS_CARVED);
                        entries.add(ModBlocks.BLEAK_LEAVES);

                        entries.add(ModBlocks.FIR_LOG);
                        entries.add(ModBlocks.FIR_WOOD);
                        entries.add(ModBlocks.STRIPPED_FIR_LOG);
                        entries.add(ModBlocks.STRIPPED_FIR_WOOD);
                        entries.add(ModBlocks.FIR_PLANKS);
                        entries.add(ModBlocks.FIR_STAIRS);
                        entries.add(ModBlocks.FIR_SLAB);
                        entries.add(ModBlocks.FIR_FENCE);
                        entries.add(ModBlocks.FIR_FENCE_GATE);
                        entries.add(ModBlocks.FIR_PRESSURE_PLATE);
                        entries.add(ModBlocks.FIR_BUTTON);
                        entries.add(ModBlocks.VERTICAL_FIR_PLANKS);
                        entries.add(ModBlocks.FIR_PLANKS_CARVED);
                        entries.add(ModBlocks.GREEN_FIR_LEAVES);
                        entries.add(ModBlocks.ORANGE_FIR_LEAVES);

                        entries.add(ModBlocks.PALM_LOG);
                        entries.add(ModBlocks.PALM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PALM_LOG);
                        entries.add(ModBlocks.STRIPPED_PALM_WOOD);
                        entries.add(ModBlocks.PALM_PLANKS);
                        entries.add(ModBlocks.PALM_STAIRS);
                        entries.add(ModBlocks.PALM_SLAB);
                        entries.add(ModBlocks.PALM_FENCE);
                        entries.add(ModBlocks.PALM_FENCE_GATE);
                        entries.add(ModBlocks.PALM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALM_BUTTON);
                        entries.add(ModBlocks.VERTICAL_PALM_PLANKS);
                        entries.add(ModBlocks.PALM_PLANKS_CARVED);
                        entries.add(ModBlocks.PALM_CROWN);
                        entries.add(ModBlocks.PALM_LEAVES);

                        entries.add(ModBlocks.BAYOU_LOG);
                        entries.add(ModBlocks.BAYOU_WOOD);
                        entries.add(ModBlocks.STRIPPED_BAYOU_LOG);
                        entries.add(ModBlocks.STRIPPED_BAYOU_WOOD);
                        entries.add(ModBlocks.BAYOU_PLANKS);
                        entries.add(ModBlocks.BAYOU_STAIRS);
                        entries.add(ModBlocks.BAYOU_SLAB);
                        entries.add(ModBlocks.BAYOU_FENCE);
                        entries.add(ModBlocks.BAYOU_FENCE_GATE);
                        entries.add(ModBlocks.BAYOU_PRESSURE_PLATE);
                        entries.add(ModBlocks.BAYOU_BUTTON);
                        entries.add(ModBlocks.VERTICAL_BAYOU_PLANKS);
                        entries.add(ModBlocks.BAYOU_PLANKS_CARVED);
                        entries.add(ModBlocks.BAYOU_LEAVES);

                        entries.add(ModBlocks.WISTERIA_LOG);
                        entries.add(ModBlocks.WISTERIA_WOOD);
                        entries.add(ModBlocks.STRIPPED_WISTERIA_LOG);
                        entries.add(ModBlocks.STRIPPED_WISTERIA_WOOD);
                        entries.add(ModBlocks.WISTERIA_PLANKS);
                        entries.add(ModBlocks.WISTERIA_STAIRS);
                        entries.add(ModBlocks.WISTERIA_SLAB);
                        entries.add(ModBlocks.WISTERIA_FENCE);
                        entries.add(ModBlocks.WISTERIA_FENCE_GATE);
                        entries.add(ModBlocks.WISTERIA_PRESSURE_PLATE);
                        entries.add(ModBlocks.WISTERIA_BUTTON);
                        entries.add(ModBlocks.VERTICAL_WISTERIA_PLANKS);
                        entries.add(ModBlocks.WISTERIA_PLANKS_CARVED);
                        entries.add(ModBlocks.WISTERIA_LEAVES);
                        entries.add(ModBlocks.WISTERIA_FLOWERS_BLUE);
                        entries.add(ModBlocks.WISTERIA_FLOWERS_PINK);
                        entries.add(ModBlocks.WISTERIA_FLOWERS_PURPLE);
                        entries.add(ModBlocks.WISTERIA_FLOWERS_WHITE);

                        entries.add(ModBlocks.BAOBAB_LOG);
                        entries.add(ModBlocks.BAOBAB_WOOD);
                        entries.add(ModBlocks.STRIPPED_BAOBAB_LOG);
                        entries.add(ModBlocks.STRIPPED_BAOBAB_WOOD);
                        entries.add(ModBlocks.BAOBAB_PLANKS);
                        entries.add(ModBlocks.BAOBAB_STAIRS);
                        entries.add(ModBlocks.BAOBAB_SLAB);
                        entries.add(ModBlocks.BAOBAB_FENCE);
                        entries.add(ModBlocks.BAOBAB_FENCE_GATE);
                        entries.add(ModBlocks.BAOBAB_PRESSURE_PLATE);
                        entries.add(ModBlocks.BAOBAB_BUTTON);
                        entries.add(ModBlocks.VERTICAL_BAOBAB_PLANKS);
                        entries.add(ModBlocks.BAOBAB_PLANKS_CARVED);
                        entries.add(ModBlocks.BAOBAB_LEAVES);

                        entries.add(ModBlocks.FUNGAL_PLANKS);
                        entries.add(ModBlocks.FUNGAL_STAIRS);
                        entries.add(ModBlocks.FUNGAL_SLAB);
                        entries.add(ModBlocks.FUNGAL_FENCE);
                        entries.add(ModBlocks.FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.FUNGAL_BUTTON);
                        entries.add(ModBlocks.VERTICAL_FUNGAL_PLANKS);
                        entries.add(ModBlocks.FUNGAL_PLANKS_CARVED);
// Planks
                        entries.add(ModBlocks.WHITE_FUNGAL_PLANKS);
                        entries.add(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS);
                        entries.add(ModBlocks.GRAY_FUNGAL_PLANKS);
                        entries.add(ModBlocks.BLACK_FUNGAL_PLANKS);
                        entries.add(ModBlocks.BROWN_FUNGAL_PLANKS);
                        entries.add(ModBlocks.RED_FUNGAL_PLANKS);
                        entries.add(ModBlocks.ORANGE_FUNGAL_PLANKS);
                        entries.add(ModBlocks.YELLOW_FUNGAL_PLANKS);
                        entries.add(ModBlocks.LIME_FUNGAL_PLANKS);
                        entries.add(ModBlocks.GREEN_FUNGAL_PLANKS);
                        entries.add(ModBlocks.CYAN_FUNGAL_PLANKS);
                        entries.add(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS);
                        entries.add(ModBlocks.BLUE_FUNGAL_PLANKS);
                        entries.add(ModBlocks.PURPLE_FUNGAL_PLANKS);
                        entries.add(ModBlocks.MAGENTA_FUNGAL_PLANKS);
                        entries.add(ModBlocks.PINK_FUNGAL_PLANKS);

// Stairs
                        entries.add(ModBlocks.WHITE_FUNGAL_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_FUNGAL_STAIRS);
                        entries.add(ModBlocks.GRAY_FUNGAL_STAIRS);
                        entries.add(ModBlocks.BLACK_FUNGAL_STAIRS);
                        entries.add(ModBlocks.BROWN_FUNGAL_STAIRS);
                        entries.add(ModBlocks.RED_FUNGAL_STAIRS);
                        entries.add(ModBlocks.ORANGE_FUNGAL_STAIRS);
                        entries.add(ModBlocks.YELLOW_FUNGAL_STAIRS);
                        entries.add(ModBlocks.LIME_FUNGAL_STAIRS);
                        entries.add(ModBlocks.GREEN_FUNGAL_STAIRS);
                        entries.add(ModBlocks.CYAN_FUNGAL_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS);
                        entries.add(ModBlocks.BLUE_FUNGAL_STAIRS);
                        entries.add(ModBlocks.PURPLE_FUNGAL_STAIRS);
                        entries.add(ModBlocks.MAGENTA_FUNGAL_STAIRS);
                        entries.add(ModBlocks.PINK_FUNGAL_STAIRS);

// Slabs
                        entries.add(ModBlocks.WHITE_FUNGAL_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_FUNGAL_SLAB);
                        entries.add(ModBlocks.GRAY_FUNGAL_SLAB);
                        entries.add(ModBlocks.BLACK_FUNGAL_SLAB);
                        entries.add(ModBlocks.BROWN_FUNGAL_SLAB);
                        entries.add(ModBlocks.RED_FUNGAL_SLAB);
                        entries.add(ModBlocks.ORANGE_FUNGAL_SLAB);
                        entries.add(ModBlocks.YELLOW_FUNGAL_SLAB);
                        entries.add(ModBlocks.LIME_FUNGAL_SLAB);
                        entries.add(ModBlocks.GREEN_FUNGAL_SLAB);
                        entries.add(ModBlocks.CYAN_FUNGAL_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_FUNGAL_SLAB);
                        entries.add(ModBlocks.BLUE_FUNGAL_SLAB);
                        entries.add(ModBlocks.PURPLE_FUNGAL_SLAB);
                        entries.add(ModBlocks.MAGENTA_FUNGAL_SLAB);
                        entries.add(ModBlocks.PINK_FUNGAL_SLAB);

// Fences
                        entries.add(ModBlocks.WHITE_FUNGAL_FENCE);
                        entries.add(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE);
                        entries.add(ModBlocks.GRAY_FUNGAL_FENCE);
                        entries.add(ModBlocks.BLACK_FUNGAL_FENCE);
                        entries.add(ModBlocks.BROWN_FUNGAL_FENCE);
                        entries.add(ModBlocks.RED_FUNGAL_FENCE);
                        entries.add(ModBlocks.ORANGE_FUNGAL_FENCE);
                        entries.add(ModBlocks.YELLOW_FUNGAL_FENCE);
                        entries.add(ModBlocks.LIME_FUNGAL_FENCE);
                        entries.add(ModBlocks.GREEN_FUNGAL_FENCE);
                        entries.add(ModBlocks.CYAN_FUNGAL_FENCE);
                        entries.add(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE);
                        entries.add(ModBlocks.BLUE_FUNGAL_FENCE);
                        entries.add(ModBlocks.PURPLE_FUNGAL_FENCE);
                        entries.add(ModBlocks.MAGENTA_FUNGAL_FENCE);
                        entries.add(ModBlocks.PINK_FUNGAL_FENCE);

// Fence Gates
                        entries.add(ModBlocks.WHITE_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.GRAY_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.BLACK_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.BROWN_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.RED_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.ORANGE_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.YELLOW_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.LIME_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.GREEN_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.CYAN_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.BLUE_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.PURPLE_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.MAGENTA_FUNGAL_FENCE_GATE);
                        entries.add(ModBlocks.PINK_FUNGAL_FENCE_GATE);

// Pressure Plates
                        entries.add(ModBlocks.WHITE_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_FUNGAL_PRESSURE_PLATE);

// Buttons
                        entries.add(ModBlocks.WHITE_FUNGAL_BUTTON);
                        entries.add(ModBlocks.LIGHT_GRAY_FUNGAL_BUTTON);
                        entries.add(ModBlocks.GRAY_FUNGAL_BUTTON);
                        entries.add(ModBlocks.BLACK_FUNGAL_BUTTON);
                        entries.add(ModBlocks.BROWN_FUNGAL_BUTTON);
                        entries.add(ModBlocks.RED_FUNGAL_BUTTON);
                        entries.add(ModBlocks.ORANGE_FUNGAL_BUTTON);
                        entries.add(ModBlocks.YELLOW_FUNGAL_BUTTON);
                        entries.add(ModBlocks.LIME_FUNGAL_BUTTON);
                        entries.add(ModBlocks.GREEN_FUNGAL_BUTTON);
                        entries.add(ModBlocks.CYAN_FUNGAL_BUTTON);
                        entries.add(ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON);
                        entries.add(ModBlocks.BLUE_FUNGAL_BUTTON);
                        entries.add(ModBlocks.PURPLE_FUNGAL_BUTTON);
                        entries.add(ModBlocks.MAGENTA_FUNGAL_BUTTON);
                        entries.add(ModBlocks.PINK_FUNGAL_BUTTON);


                    }).build());

    public static void registerItemGroups() {
        ForgedMod.LOGGER.info("Registering Item Groups for " + ForgedMod.MOD_ID);
    }

}