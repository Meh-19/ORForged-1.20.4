package net.meh.forged;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.meh.forged.block.ModBlocks;
import net.meh.forged.item.ModItemGroups;
import net.meh.forged.item.ModItems;
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
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_PLANKS_CARVED,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MAPLE_LEAVES,30,60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_MAPLE_LEAVES,30,60);
	}
}