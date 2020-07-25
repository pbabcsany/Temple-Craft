package com.babcsany.minecraft.templecraft.block;

import com.babcsany.minecraft.templecraft.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class TempleDoorBlock extends DoorBlock {
    public TempleDoorBlock() {
        super(Block.Properties.create(Material.WOOD, MaterialColor.GOLD)
                .setLightLevel(value -> 15)
                .hardnessAndResistance(-1.0F, 3600000.0F)
                .noDrops()
                .variableOpacity()
        );
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockRayTraceResult raytraceResult) {
        if (player.getHeldItemMainhand().isItemEqual(new ItemStack(() -> ItemInit.TEMPLE_RECOMMEND.get())) && !player.isCreative()) {
            return super.onBlockActivated(state, world, blockPos, player, hand, raytraceResult);
        } else {
            return ActionResultType.PASS;
        }
    }

/*
    @Override
    public boolean removedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity player, boolean willHarvest, IFluidState fluid) {
        if (player.isCreative()) {
            return false;
        } else {
            return super.removedByPlayer(state, world, pos, player, willHarvest, fluid);
        }
    }
*/
}
