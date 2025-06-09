package net.meh.forged;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.meh.forged.block.ModBlocks;
import net.meh.forged.item.ModItemGroups;
import net.meh.forged.item.ModItems;
import net.meh.forged.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForgedMod implements ModInitializer {
	public static final String MOD_ID = "orforged";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		StrippableBlockRegistry.register(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAPLE_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAPLE_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_MAPLE_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_PLANKS_CARVED,5,20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MAPLE_LEAVES,30,60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_MAPLE_LEAVES,30,60);

		StrippableBlockRegistry.register(ModBlocks.BLEAK_LOG, ModBlocks.STRIPPED_BLEAK_LOG);
		StrippableBlockRegistry.register(ModBlocks.BLEAK_WOOD, ModBlocks.STRIPPED_BLEAK_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLEAK_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLEAK_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BLEAK_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BLEAK_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLEAK_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BLEAK_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLEAK_PLANKS_CARVED,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLEAK_LEAVES,30,60);

		StrippableBlockRegistry.register(ModBlocks.FIR_LOG, ModBlocks.STRIPPED_FIR_LOG);
		StrippableBlockRegistry.register(ModBlocks.FIR_WOOD, ModBlocks.STRIPPED_FIR_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIR_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIR_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_FIR_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_FIR_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIR_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_FIR_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIR_PLANKS_CARVED,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_FIR_LEAVES,30,60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_FIR_LEAVES,30,60);

		StrippableBlockRegistry.register(ModBlocks.PALM_LOG, ModBlocks.STRIPPED_FIR_LOG);
		StrippableBlockRegistry.register(ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_FIR_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALM_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALM_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_PALM_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_PLANKS_CARVED,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_CROWN,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_LEAVES,30,60);;

		StrippableBlockRegistry.register(ModBlocks.BAYOU_LOG, ModBlocks.STRIPPED_BAYOU_LOG);
		StrippableBlockRegistry.register(ModBlocks.BAYOU_WOOD, ModBlocks.STRIPPED_BAYOU_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAYOU_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAYOU_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BAYOU_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BAYOU_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAYOU_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAYOU_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAYOU_PLANKS_CARVED,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAYOU_LEAVES,30,60);;

		StrippableBlockRegistry.register(ModBlocks.WISTERIA_LOG, ModBlocks.STRIPPED_WISTERIA_LOG);
		StrippableBlockRegistry.register(ModBlocks.WISTERIA_WOOD, ModBlocks.STRIPPED_WISTERIA_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WISTERIA_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WISTERIA_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_WISTERIA_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_PLANKS_CARVED,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_LEAVES,30,60);;
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_FLOWERS_BLUE,30,60);;
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_FLOWERS_PINK,30,60);;
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_FLOWERS_PURPLE,30,60);;
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_FLOWERS_WHITE,30,60);;

		StrippableBlockRegistry.register(ModBlocks.BAOBAB_LOG, ModBlocks.STRIPPED_BAOBAB_LOG);
		StrippableBlockRegistry.register(ModBlocks.BAOBAB_WOOD, ModBlocks.STRIPPED_BAOBAB_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BAOBAB_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BAOBAB_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAOBAB_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_PLANKS_CARVED,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_LEAVES,30,60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FUNGAL_PLANKS_CARVED, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_FUNGAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_FUNGAL_PLANKS, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_BEAM,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLEAK_BEAM,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIR_BEAM,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_BEAM,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAYOU_BEAM,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_BEAM,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAOBAB_BEAM,5,5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_BEAM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_BEAM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_BEAM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_BEAM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_BEAM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_BEAM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_BEAM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_BEAM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_BEAM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_BEAM, 5, 5);
		ModWorldGeneration.generateModWorldGen();

	}
}