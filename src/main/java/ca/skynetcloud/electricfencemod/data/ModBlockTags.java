package ca.skynetcloud.electricfencemod.data;

import ca.skynetcloud.electricfencemod.Electricfencemod;
import ca.skynetcloud.electricfencemod.world.level.block.BlockInit;
import ca.skynetcloud.electricfencemod.init.TagsInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTags extends BlockTagsProvider {


    public ModBlockTags(DataGenerator p_126511_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126511_, Electricfencemod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(){
        tag(TagsInit.Color_Fence)
                .add(BlockInit.BLACK_Electric_Fence.get())
                .add(BlockInit.RED_Electric_Fence.get())
                .add(BlockInit.BLUE_Electric_Fence.get())
                .add(BlockInit.YELLOW_Electric_Fence.get())
                .add(BlockInit.GREEN_Electric_Fence.get())
                .add(BlockInit.GRAY_Electric_Fence.get())
                .add(BlockInit.LIGHT_BLUE_Electric_Fence.get())
                .add(BlockInit.LIGHT_GRAY_Electric_Fence.get())
                .add(BlockInit.LIME_Electric_Fence.get())
                .add(BlockInit.MAGENTA_Electric_Fence.get())
                .add(BlockInit.ORANGE_Electric_Fence.get())
                .add(BlockInit.PINK_Electric_Fence.get())
                .add(BlockInit.PURPLE_Electric_Fence.get())
                .add(BlockInit.CYAN_Electric_Fence.get())
                .add(BlockInit.WHITE_Electric_Fence.get())
                .add(BlockInit.BROWN_Electric_Fence.get());

        tag(TagsInit.Color_Fence_Top)
                .add(BlockInit.BLACK_Electric_FenceTop.get())
                .add(BlockInit.RED_Electric_FenceTop.get())
                .add(BlockInit.BLUE_Electric_FenceTop.get())
                .add(BlockInit.YELLOW_Electric_FenceTop.get())
                .add(BlockInit.GREEN_Electric_FenceTop.get())
                .add(BlockInit.GRAY_Electric_FenceTop.get())
                .add(BlockInit.LIGHT_BLUE_Electric_FenceTop.get())
                .add(BlockInit.LIGHT_GRAY_Electric_FenceTop.get())
                .add(BlockInit.LIME_Electric_FenceTop.get())
                .add(BlockInit.MAGENTA_Electric_FenceTop.get())
                .add(BlockInit.ORANGE_Electric_FenceTop.get())
                .add(BlockInit.PINK_Electric_FenceTop.get())
                .add(BlockInit.PURPLE_Electric_FenceTop.get())
                .add(BlockInit.CYAN_Electric_FenceTop.get())
                .add(BlockInit.WHITE_Electric_FenceTop.get())
                .add(BlockInit.BROWN_Electric_FenceTop.get());

        tag(TagsInit.Color_Fence_Gate)
                .add(BlockInit.BLACK_Electric_FenceGate.get())
                .add(BlockInit.RED_Electric_FenceGate.get())
                .add(BlockInit.BLUE_Electric_FenceGate.get())
                .add(BlockInit.YELLOW_Electric_FenceGate.get())
                .add(BlockInit.GREEN_Electric_FenceGate.get())
                .add(BlockInit.GRAY_Electric_FenceGate.get())
                .add(BlockInit.LIGHT_BLUE_Electric_FenceGate.get())
                .add(BlockInit.LIGHT_GRAY_Electric_FenceGate.get())
                .add(BlockInit.LIME_Electric_FenceGate.get())
                .add(BlockInit.MAGENTA_Electric_FenceGate.get())
                .add(BlockInit.ORANGE_Electric_FenceGate.get())
                .add(BlockInit.PINK_Electric_FenceGate.get())
                .add(BlockInit.PURPLE_Electric_FenceGate.get())
                .add(BlockInit.CYAN_Electric_FenceGate.get())
                .add(BlockInit.WHITE_Electric_FenceGate.get())
                .add(BlockInit.BROWN_Electric_FenceGate.get());


    }

}
