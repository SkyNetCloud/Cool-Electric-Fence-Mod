package ca.skynetcloud.electricfencemod.data;

import ca.skynetcloud.electricfencemod.Electricfencemod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Electricfencemod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new ModRecipes(generator));
            ModBlockTags blocktags = new ModBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blocktags);

        }
        if (event.includeClient()) {

        }

    }
}
