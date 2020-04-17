package com.babcsany.minecraft.templecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class TempleDoorBlock extends DoorBlock {
    public TempleDoorBlock() {
        super(Block.Properties.create(Material.WOOD, MaterialColor.GOLD)
                .lightValue(15)
                .hardnessAndResistance(-1.0F, 3600000.0F)
                .noDrops()
                .variableOpacity()
        );
    }

    @Override
    public @NotNull ActionResultType func_225533_a_(@NotNull BlockState state, @NotNull World world, @NotNull BlockPos blockPos, @NotNull PlayerEntity player, @NotNull Hand hand, @NotNull BlockRayTraceResult raytraceResult) {
        if (player.getHeldItemMainhand().isEmpty() && !player.isCreative()) {
            return super.func_225533_a_(state, world, blockPos, player, hand, raytraceResult);
        } else {
            return ActionResultType.PASS;
        }
    }

}
