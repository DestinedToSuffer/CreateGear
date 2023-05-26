package co.vangar.creategear.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class ScytheItem extends HoeItem {
    public ScytheItem(Tier tier, int i, float v, Properties properties) {
        super(tier, i, v, properties);
    }

    private boolean tillable(Level level, BlockPos pos){
        if(level.getBlockState(pos).getMaterial() == Material.DIRT || level.getBlockState(pos).getMaterial() == Material.GRASS) {
            if(level.getBlockState(pos.offset(0,1,0)).getMaterial() == Material.AIR){
                if(level.getBlockState(pos) != Blocks.FARMLAND.defaultBlockState()){
                    return true;
                }
            }
        } return false;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();

        if(tillable(world, pos)){
            for (BlockPos targetPos : BlockPos.betweenClosed(pos.offset(-1, 0, -1), pos.offset(1, 0, 1))) {
                if (tillable(world, targetPos)) {
                    BlockState tilledState = Blocks.FARMLAND.defaultBlockState();
                    world.setBlock(targetPos, tilledState, 3);
                    player.getMainHandItem().hurtAndBreak(1, player,
                            (p) -> p.broadcastBreakEvent(InteractionHand.MAIN_HAND));

                }
            } return InteractionResult.SUCCESS;
        } return super.useOn(context);
    }
}