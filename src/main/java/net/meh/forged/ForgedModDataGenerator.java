package net.meh.forged;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.meh.forged.block.ModBlocks;
import net.meh.forged.datagen.*;
import net.meh.forged.world.ModConfiguredFeatures;
import net.meh.forged.world.ModPlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class ForgedModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

pack.addProvider(ModBlockTagProvider::new);
pack.addProvider(ModItemTagProvider::new);
pack.addProvider(ModLootTableProvider::new);
pack.addProvider(ModModelProvider::new);
pack.addProvider(ModRecipeProvider::new);
pack.addProvider(ModWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
