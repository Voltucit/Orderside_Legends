package com.example.examplemod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().tab(ItemGroup.TAB_MATERIALS));
    }
}
