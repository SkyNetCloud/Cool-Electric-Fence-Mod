package ca.skynetcloud.electricfencemod.world.level.levelgen.feature;

import ca.skynetcloud.electricfencemod.Electricfencemod;
import ca.skynetcloud.electricfencemod.world.level.block.BlockInit;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;



import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;



@Mod.EventBusSubscriber
public class FeatureInit {

    public static final DeferredRegister<Feature<?>> FEATURE = DeferredRegister.create(ForgeRegistries.FEATURES, Electricfencemod.MODID);
    private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
    public static final RegistryObject<Feature<?>> SHOCK_FLOWER;

    static {
        SHOCK_FLOWER = register("shock_flower", ShockFeature::feature, new FeatureRegistration(
                GenerationStep.Decoration.VEGETAL_DECORATION, ShockFeature.GENERATE_BIOMES, ShockFeature::placedFeature));
    }

    private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
        FEATURE_REGISTRATIONS.add(featureRegistration);
        return FEATURE.register(registryname, feature);
    }

    @SubscribeEvent
    public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
        for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
            if (registration.biomes() == null || registration.biomes().contains(event.getName()))
                event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
           Electricfencemod.LOGGER.info("");
        }
    }

    private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
                                              Supplier<Holder<PlacedFeature>> placedFeature) {
    }

}
