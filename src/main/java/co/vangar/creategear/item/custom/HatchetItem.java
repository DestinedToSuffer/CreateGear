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
    private int count;
    private boolean canContinue;
    public HatchetItem(Tier tier, float v, float v1, Properties properties) {
        super(tier, v, v1, properties);
        this.count = 0;
        this.canContinue = false;
    }

    @Override
    public boolean mineBlock(ItemStack itemStack, Level level, BlockState blockState, BlockPos blockPos, LivingEntity livingEntity) {
        if(livingEntity instanceof Player){
            Player player = (Player) livingEntity;
            ItemStack stack = player.getItemInHand(InteractionHand.MAIN_HAND);

            BlockPos pos = blockPos;
            BlockState state = level.getBlockState(pos);
            Block block = state.getBlock();

            if (block.canHarvestBlock(state, level, pos, player)) {
                breakTree(level, blockPos, blockState, player, InteractionHand.MAIN_HAND);
                this.count = 1;
            }
        }
        return super.mineBlock(itemStack, level, blockState, blockPos, livingEntity);
    }

    private void breakTree(Level world, BlockPos startPos, BlockState startState, Player player, InteractionHand hand) {
        // Check if the block is a log
        if (startState.getMaterial() == Material.WOOD || startState.getMaterial() == Material.LEAVES) {
            if (startState.getMaterial() == Material.WOOD) {
                if (player.getMainHandItem().getDamageValue() < player.getMainHandItem().getMaxDamage() - 1) {
                    // Break the block
                    startState.getBlock().playerDestroy(world, player, startPos, startState, world.getBlockEntity(startPos), player.getItemInHand(InteractionHand.MAIN_HAND));
                    world.setBlock(startPos, Blocks.AIR.defaultBlockState(), 3);
                    // Damage the item
                    player.getMainHandItem().hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(InteractionHand.MAIN_HAND));
                    this.canContinue = true;
                }
            } else {
                this.canContinue = true;
            }

            if(canContinue && count <= 160){
                count++;
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
}