package com.babcsany.minecraft.templecraft.init;

import com.babcsany.minecraft.templecraft.TempleCraft;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TempleCraft.MOD_ID);

    public static final RegistryObject<Item> TEMPLE_RECOMMEND = ITEMS.register("temple_recommend", () -> new Item(
            (new Item.Properties())
    ));
}
