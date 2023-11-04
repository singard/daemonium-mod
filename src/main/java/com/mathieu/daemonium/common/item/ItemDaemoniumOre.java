package com.mathieu.daemonium.common.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class ItemDaemoniumOre extends ItemBlock {

    public ItemDaemoniumOre(Block block) {
        super(block);
        setMaxStackSize(64);
        setUnlocalizedName("daemoniumOre");
        setNoRepair();
        ResourceLocation itemTexture = new ResourceLocation("daemonium:textures/item/daemoniumOre.png");
        setTextureName(itemTexture.toString());
    }
}
