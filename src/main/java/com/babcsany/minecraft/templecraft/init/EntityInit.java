package com.babcsany.minecraft.templecraft.init;

import com.babcsany.minecraft.templecraft.TempleCraft;
import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, TempleCraft.MOD_ID);
}
