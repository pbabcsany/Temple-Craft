package com.babcsany.minecraft.templecraft.init;

import com.babcsany.minecraft.templecraft.TempleCraft;
import com.babcsany.minecraft.templecraft.block.TempleDoorBlock;
import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

import java.util.concurrent.Phaser;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TempleCraft.MOD_ID);

    public static final RegistryObject<Block> TEMPLE_DOOR = BLOCKS.register("temple_door", TempleDoorBlock::new);
    public static final RegistryObject<Block> TEMPLE_FOUNDATION = BLOCKS.register("temple_foundation", () -> new Block(
            Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA)
                    .hardnessAndResistance(-1.0F, 4000000.F)
                    .setLightLevel(value -> 15)
    ));
    public static final RegistryObject<Block> ANGEL_MORONI = BLOCKS.register("angel-moroni", () -> new Block(
            Block.Properties.create(Material.ROCK, MaterialColor.GOLD)
                    .hardnessAndResistance(-1.0F, 4000000.0F)
    ));
}
