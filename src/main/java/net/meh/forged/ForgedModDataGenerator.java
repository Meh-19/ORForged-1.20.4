package net.meh.forged;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.meh.forged.block.ModBlocks;
import net.meh.forged.datagen.ModBlockTagProvider;
import net.meh.forged.datagen.ModItemTagProvider;
import net.meh.forged.datagen.ModLootTableProvider;
import net.meh.forged.datagen.ModModelProvider;

public class ForgedModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

pack.addProvider(ModBlockTagProvider::new);
pack.addProvider(ModItemTagProvider::new);
pack.addProvider(ModLootTableProvider::new);
pack.addProvider(ModModelProvider::new);
	}
}
