package co.vangar.creategear.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class HatchetItem extends AxeItem {
    public HatchetItem(Tier tier, float v, float v1, Properties properties) {
        super(tier, v, v1, properties);
    }

    @Override
    public boolean mineBlock(ItemStack itemStack, Level level, BlockState blockState, BlockPos blockPos, LivingEntity livingEntity) {
        if(livingEntity instanceof Player){
            Player player = (Player) livingEntity;
            ItemStack stack = player.getItemInHand(InteractionHand.MAIN_HAND);

            BlockPos pos = blockPos;
            BlockState state = level.getBlockState(pos);
            Block block = state.getBlock();
            if (state.getMaterial() == Material.WOOD || state.getMaterial() == Material.LEAVES) {
                if (block.canHarvestBlock(state, level, pos, player)) {
                    breakTree(level, blockPos, blockState, player, InteractionHand.MAIN_HAND);
                }
            }
        }
        return super.mineBlock(itemStack, level, blockState, blockPos, livingEntity);
    }

    private void breakTree(Level world, BlockPos startPos, BlockState startState, Player player, InteractionHand hand) {
        // Check if the block is a log or leaf block
        if (startState.getMaterial() == Material.WOOD || startState.getMaterial() == Material.LEAVES) {
            // Break the block
            startState.getBlock().playerDestroy(world, player, startPos, startState, world.getBlockEntity(startPos), player.getItemInHand(InteractionHand.MAIN_HAND));
            world.setBlock(startPos, Blocks.AIR.defaultBlockState(), 3);
            if(startState.getMaterial() == Material.WOOD){
                // Damage the item
                player.getMainHandItem().hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(InteractionHand.MAIN_HAND));
            }

            // Recursively break connected logs and leaves
            for (Direction direction : Direction.values()) {
                BlockPos nextPos = startPos.offset(direction.getNormal());
                BlockState nextState = world.getBlockState(nextPos);

                if (startState.getMaterial() == Material.WOOD || startState.getMaterial() == Material.LEAVES) {
                    breakTree(world, nextPos, nextState, player, hand);
                }
            }
        }
    }

}
