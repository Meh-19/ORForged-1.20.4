package net.meh.forged.world;

import net.meh.forged.ForgedMod;
import net.meh.forged.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_KEY = registerKey("maple");

public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
    RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
    RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

List<OreFeatureConfig.Target> overworldRubyOres =
        List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.RUBY_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

    List<OreFeatureConfig.Target> overworldPlatinumOres =
            List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.PLATINUM_ORE.getDefaultState()),
                    OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState()));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 6));
        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPlatinumOres, 6));

}

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(ForgedMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}