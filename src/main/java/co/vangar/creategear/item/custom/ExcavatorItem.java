package co.vangar.creategear.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class ExcavatorItem extends ShovelItem {
    public ExcavatorItem(Tier tier, int i, float v, Properties properties) {
        super(tier, i, v, properties);
    }

    public static Direction getPlayerFacingSide(BlockPos blockPos, Player player) {
        double playerX = player.getX();
        double playerY = player.getY() + player.getEyeHeight();
        double playerZ = player.getZ();

        double blockX = blockPos.getX() + 0.5;
        double blockY = blockPos.getY() + 0.5;
        double blockZ = blockPos.getZ() + 0.5;

        double deltaX = playerX - blockX;
        double deltaY = playerY - blockY;
        double deltaZ = playerZ - blockZ;

        double maxDelta = Math.max(Math.abs(deltaX), Math.max(Math.abs(deltaY), Math.abs(deltaZ)));

        if (maxDelta == Math.abs(deltaX)) {
            return deltaX > 0 ? Direction.WEST : Direction.EAST;
        } else if (maxDelta == Math.abs(deltaY)) {
            return deltaY > 0 ? Direction.DOWN : Direction.UP;
        } else {
            return deltaZ > 0 ? Direction.NORTH : Direction.SOUTH;
        }
    }


    @Override
    public boolean mineBlock(ItemStack itemStack, Level level, BlockState blockState, BlockPos blockPos, LivingEntity livingEntity) {
        if(livingEntity instanceof Player){
            Player player = (Player) livingEntity;
            ItemStack stack = player.getItemInHand(InteractionHand.MAIN_HAND);

            BlockPos pos = blockPos;
            BlockState state = level.getBlockState(pos);
            Block block = state.getBlock();

            Direction dir = getPlayerFacingSide(blockPos, player);

            int x = 0;
            int y = 0;
            int z = 0;

            if(dir == Direction.UP || dir == Direction.DOWN){
                x = 1;
                z = 1;
            } else if(dir == Direction.NORTH || dir ==  Direction.SOUTH){
                x = 1;
                y = 1;
            } else if(dir == Direction.EAST || dir == Direction.WEST){
                y = 1;
                z = 1;
            }

            if (state.getMaterial() != Material.STONE) {
                if (block.canHarvestBlock(state, level, pos, player)) {
                    for (BlockPos targetPos : BlockPos.betweenClosed(pos.offset(-x, -y, -z), pos.offset(x, y, z))) {
                        if (block.canHarvestBlock(state, level, targetPos, player)) {
                            BlockState targetState = level.getBlockState(targetPos);
                            if(targetState.getMaterial() != Material.STONE){
                                block.playerDestroy(level, player, targetPos, targetState, level.getBlockEntity(targetPos), stack);
                                level.setBlock(targetPos, Blocks.AIR.defaultBlockState(), 3);
                                player.getMainHandItem().hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(InteractionHand.MAIN_HAND));
                            }
                        }
                    }
                }
            }
        }
        return super.mineBlock(itemStack, level, blockState, blockPos, livingEntity);
    }
}
