package ca.skynetcloud.electricfencemod.world.item;

import ca.skynetcloud.electricfencemod.Electricfencemod;
import ca.skynetcloud.electricfencemod.world.level.block.BasicElectricFence;
import ca.skynetcloud.electricfencemod.world.level.block.ElectricalCabinet;
import ca.skynetcloud.electricfencemod.world.level.block.gate.ElectricFenceGate;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class WrenchTool extends Item{

 public WrenchTool()	{
     super(new Item.Properties().stacksTo(1).tab(Electricfencemod.electricfencemodTab.MAIN));
 }

    @Override
    public InteractionResult useOn(UseOnContext ctx) {
        InteractionResult result = null;
        Level level = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        Player player = ctx.getPlayer();
        if (!level.isClientSide && player != null) {
            BlockState target = level.getBlockState(pos);
            ItemStack stack = player.getMainHandItem();

            if (stack.getItem() instanceof WrenchTool && player.isCrouching()) {
                Block block = target.getBlock();
                if (removeIfValid(block, level, pos)) {
                    if (block instanceof BasicElectricFence || block instanceof ElectricFenceGate || block instanceof ElectricalCabinet) {
                        if (!player.addItem(new ItemStack(block)))
                            Block.popResource(level, player.blockPosition(), new ItemStack(block));
                        result = InteractionResult.SUCCESS;
                    } else {
                        Block.popResource(level, pos, new ItemStack(target.getBlock()));
                        result = InteractionResult.SUCCESS;
                    }
                }
            }
        }
        if (result == null) {
            result = super.useOn(ctx);
        }
        return result;
    }

    private boolean removeIfValid(Block block, Level world, BlockPos pos) {
        boolean result = false;
        if (block instanceof BasicElectricFence || block instanceof ElectricFenceGate || block instanceof ElectricalCabinet) {
            world.removeBlock(pos, false);
            result = true;
        }
        return result;
    }
}
