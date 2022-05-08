package ca.skynetcloud.electricfencemod.world.level.levelgen.feature;

import ca.skynetcloud.electricfencemod.Electricfencemod;
import ca.skynetcloud.electricfencemod.world.level.block.BlockInit;
import ca.skynetcloud.electricfencemod.world.level.block.ShockflowerBlock;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;


import java.util.Set;
import java.util.List;


public class ShockFeature extends RandomPatchFeature {
    public static ShockFeature FEATURE = null;
    public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;

    public static Feature<?> feature() {
        FEATURE = new ShockFeature();
        CONFIGURED_FEATURE = FeatureUtils.register("electricfencemod:shock_flower", FEATURE, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.SHOCKFLOWER.get().defaultBlockState())), List.of(), 7));
        PLACED_FEATURE = PlacementUtils.register("electricfencemod:shock_flower", CONFIGURED_FEATURE, List.of(CountPlacement.of(23),
                RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        return FEATURE;
    }


    public static Holder<PlacedFeature> placedFeature() {
        return PLACED_FEATURE;
    }


    public ShockFeature() {
        super(RandomPatchConfiguration.CODEC);
    }

    public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
        WorldGenLevel world = context.level();
        if (!generate_dimensions.contains(world.getLevel().dimension()))
            return false;
        return super.place(context);
    }

    public static final Set<ResourceLocation> GENERATE_BIOMES;

    static {
        GENERATE_BIOMES = Set.of(
                new ResourceLocation("forest"),
                new ResourceLocation("birch_forest"),
                new ResourceLocation("plains"));
    }

    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

}

