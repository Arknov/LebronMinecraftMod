package com.appls.playerevolutions.items;

import com.appls.playerevolutions.PlayerEvolutions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(PlayerEvolutions.TAB));
    }
}