package ca.skynetcloud.electricfencemod.init;

import ca.skynetcloud.electricfencemod.Electricfencemod;
import ca.skynetcloud.electricfencemod.block.fences.ElectricFencesBlockBase;
import ca.skynetcloud.electricfencemod.block.fences.ElectricalCabinet;
import ca.skynetcloud.electricfencemod.block.fences.gate.ElectricFenceGate;
import ca.skynetcloud.electricfencemod.block.fences.top.ElectricFenceTop;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Electricfencemod.MODID);


    public static RegistryObject<Block> ElectricFence;
    public static RegistryObject<Block> ElectricFenceTop;
    public static RegistryObject<Block> ElectricFenceGate;
    public static RegistryObject<Block> electrical_cabinet;
    public static RegistryObject<Block> WHITE_Electric_Fence;
    public static RegistryObject<Block> ORANGE_Electric_Fence;
    public static RegistryObject<Block> MAGENTA_Electric_Fence;
    public static RegistryObject<Block> LIGHT_BLUE_Electric_Fence;
    public static RegistryObject<Block> YELLOW_Electric_Fence;
    public static RegistryObject<Block> LIME_Electric_Fence;
    public static RegistryObject<Block> PINK_Electric_Fence;
    public static RegistryObject<Block> GRAY_Electric_Fence;
    public static RegistryObject<Block> LIGHT_GRAY_Electric_Fence;
    public static RegistryObject<Block> CYAN_Electric_Fence;
    public static RegistryObject<Block> PURPLE_Electric_Fence;
    public static RegistryObject<Block> BLUE_Electric_Fence;
    public static RegistryObject<Block> BROWN_Electric_Fence;
    public static RegistryObject<Block> GREEN_Electric_Fence;
    public static RegistryObject<Block> RED_Electric_Fence;
    public static RegistryObject<Block> BLACK_Electric_Fence;
    public static RegistryObject<Block> WHITE_Electric_FenceTop;
    public static RegistryObject<Block> ORANGE_Electric_FenceTop;
    public static RegistryObject<Block> MAGENTA_Electric_FenceTop;
    public static RegistryObject<Block> LIGHT_BLUE_Electric_FenceTop;
    public static RegistryObject<Block> YELLOW_Electric_FenceTop;
    public static RegistryObject<Block> LIME_Electric_FenceTop;
    public static RegistryObject<Block> PINK_Electric_FenceTop;
    public static RegistryObject<Block> GRAY_Electric_FenceTop;
    public static RegistryObject<Block> LIGHT_GRAY_Electric_FenceTop;
    public static RegistryObject<Block> CYAN_Electric_FenceTop;
    public static RegistryObject<Block> PURPLE_Electric_FenceTop;
    public static RegistryObject<Block> BLUE_Electric_FenceTop;
    public static RegistryObject<Block> BROWN_Electric_FenceTop;
    public static RegistryObject<Block> GREEN_Electric_FenceTop;
    public static RegistryObject<Block> RED_Electric_FenceTop;
    public static RegistryObject<Block> BLACK_Electric_FenceTop;
    public static RegistryObject<Block> WHITE_Electric_FenceGate;
    public static RegistryObject<Block> ORANGE_Electric_FenceGate;
    public static RegistryObject<Block> MAGENTA_Electric_FenceGate;
    public static RegistryObject<Block> LIGHT_BLUE_Electric_FenceGate;
    public static RegistryObject<Block> YELLOW_Electric_FenceGate;
    public static RegistryObject<Block> LIME_Electric_FenceGate;
    public static RegistryObject<Block> PINK_Electric_FenceGate;
    public static RegistryObject<Block> GRAY_Electric_FenceGate;
    public static RegistryObject<Block> LIGHT_GRAY_Electric_FenceGate;
    public static RegistryObject<Block> CYAN_Electric_FenceGate;
    public static RegistryObject<Block> PURPLE_Electric_FenceGate;
    public static RegistryObject<Block> BLUE_Electric_FenceGate;
    public static RegistryObject<Block> BROWN_Electric_FenceGate;
    public static RegistryObject<Block> GREEN_Electric_FenceGate;
    public static RegistryObject<Block> RED_Electric_FenceGate;
    public static RegistryObject<Block> BLACK_Electric_FenceGate;

    static {
        YELLOW_Electric_FenceGate = BLOCKS.register("yellow_electric_fence_gate", () -> new ElectricFenceGate());
        LIGHT_BLUE_Electric_FenceGate = BLOCKS.register("light_blue_electric_fence_gate", () -> new ElectricFenceGate());
        MAGENTA_Electric_FenceGate = BLOCKS.register("magenta_electric_fence_gate", () -> new ElectricFenceGate());
        ORANGE_Electric_FenceGate = BLOCKS.register("orange_electric_fence_gate", () -> new ElectricFenceGate());
        WHITE_Electric_FenceGate = BLOCKS.register("white_electric_fence_gate", () -> new ElectricFenceGate());
        BLACK_Electric_FenceTop = BLOCKS.register("black_electric_fence_top", () -> new ElectricFenceTop());
        RED_Electric_FenceTop = BLOCKS.register("red_electric_fence_top", () -> new ElectricFenceTop());
        GREEN_Electric_FenceTop = BLOCKS.register("green_electric_fence_top", () -> new ElectricFenceTop());
        BROWN_Electric_FenceTop = BLOCKS.register("brown_electric_fence_top", () -> new ElectricFenceTop());
        BLUE_Electric_FenceTop = BLOCKS.register("blue_electric_fence_top", () -> new ElectricFenceTop());
        PURPLE_Electric_FenceTop = BLOCKS.register("purple_electric_fence_top", () -> new ElectricFenceTop());
        CYAN_Electric_FenceTop = BLOCKS.register("cyan_electric_fence_top", () -> new ElectricFenceTop());
        LIGHT_GRAY_Electric_FenceTop = BLOCKS.register("light_gray_electric_fence_top", () -> new ElectricFenceTop());
        GRAY_Electric_FenceTop = BLOCKS.register("gray_electric_fence_top", () -> new ElectricFenceTop());
        PINK_Electric_FenceTop = BLOCKS.register("pink_electric_fence_top", () -> new ElectricFenceTop());
        LIME_Electric_FenceTop = BLOCKS.register("lime_electric_fence_top", () -> new ElectricFenceTop());
        YELLOW_Electric_FenceTop = BLOCKS.register("yellow_electric_fence_top", () -> new ElectricFenceTop());
        LIGHT_BLUE_Electric_FenceTop = BLOCKS.register("light_blue_electric_fence_top", () -> new ElectricFenceTop());
        MAGENTA_Electric_FenceTop = BLOCKS.register("magenta_electric_fence_top", () -> new ElectricFenceTop());
        ORANGE_Electric_FenceTop = BLOCKS.register("orange_electric_fence_top", () -> new ElectricFenceTop());
        WHITE_Electric_FenceTop = BLOCKS.register("white_electric_fence_top", () -> new ElectricFenceTop());
        BLACK_Electric_Fence = BLOCKS.register("black_electric_fence", () -> new ElectricFencesBlockBase());
        RED_Electric_Fence = BLOCKS.register("red_electric_fence", () -> new ElectricFencesBlockBase());
        GREEN_Electric_Fence = BLOCKS.register("green_electric_fence", () -> new ElectricFencesBlockBase());
        BROWN_Electric_Fence = BLOCKS.register("brown_electric_fence", () -> new ElectricFencesBlockBase());
        BLUE_Electric_Fence = BLOCKS.register("blue_electric_fence", () -> new ElectricFencesBlockBase());
        PURPLE_Electric_Fence = BLOCKS.register("purple_electric_fence", () -> new ElectricFencesBlockBase());
        CYAN_Electric_Fence = BLOCKS.register("cyan_electric_fence", () -> new ElectricFencesBlockBase());
        LIGHT_GRAY_Electric_Fence = BLOCKS.register("light_gray_electric_fence", () -> new ElectricFencesBlockBase());
        GRAY_Electric_Fence = BLOCKS.register("gray_electric_fence", () -> new ElectricFencesBlockBase());
        PINK_Electric_Fence = BLOCKS.register("pink_electric_fence", () -> new ElectricFencesBlockBase());
        LIME_Electric_FenceGate = BLOCKS.register("lime_electric_fence_gate", () -> new ElectricFenceGate());
        PINK_Electric_FenceGate = BLOCKS.register("pink_electric_fence_gate", () -> new ElectricFenceGate());
        GRAY_Electric_FenceGate = BLOCKS.register("gray_electric_fence_gate", () -> new ElectricFenceGate());
        LIGHT_GRAY_Electric_FenceGate = BLOCKS.register("light_gray_electric_fence_gate", () -> new ElectricFenceGate());
        CYAN_Electric_FenceGate = BLOCKS.register("cyan_electric_fence_gate", () -> new ElectricFenceGate());
        PURPLE_Electric_FenceGate = BLOCKS.register("purple_electric_fence_gate", () -> new ElectricFenceGate());
        RED_Electric_FenceGate = BLOCKS.register("red_electric_fence_gate", () -> new ElectricFenceGate());
        GREEN_Electric_FenceGate = BLOCKS.register("green_electric_fence_gate", () -> new ElectricFenceGate());
        BROWN_Electric_FenceGate = BLOCKS.register("brown_electric_fence_gate", () -> new ElectricFenceGate());
        BLUE_Electric_FenceGate = BLOCKS.register("blue_electric_fence_gate", () -> new ElectricFenceGate());
        BLACK_Electric_FenceGate = BLOCKS.register("black_electric_fence_gate", () -> new ElectricFenceGate());
        LIME_Electric_Fence = BLOCKS.register("lime_electric_fence", () -> new ElectricFencesBlockBase());
        YELLOW_Electric_Fence = BLOCKS.register("yellow_electric_fence", () -> new ElectricFencesBlockBase());
        LIGHT_BLUE_Electric_Fence = BLOCKS.register("light_blue_electric_fence", () -> new ElectricFencesBlockBase());
        MAGENTA_Electric_Fence = BLOCKS.register("magenta_electric_fence", () -> new ElectricFencesBlockBase());
        ORANGE_Electric_Fence = BLOCKS.register("orange_electric_fence", () -> new ElectricFencesBlockBase());
        WHITE_Electric_Fence = BLOCKS.register("white_electric_fence", () -> new ElectricFencesBlockBase());
        electrical_cabinet = BLOCKS.register("electrical_cabinet", () -> new ElectricalCabinet());
        ElectricFenceGate = BLOCKS.register("electric_fence_gate", () -> new ElectricFenceGate());
        ElectricFenceTop = BLOCKS.register("electric_fence_top", () -> new ElectricFenceTop());
        ElectricFence = BLOCKS.register("electric_fence", () -> new ElectricFencesBlockBase());
    }
}
