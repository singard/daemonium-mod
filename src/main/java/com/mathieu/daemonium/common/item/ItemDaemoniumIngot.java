package com.mathieu.daemonium.common.item;

import com.mathieu.daemonium.common.Daemonium;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class ItemDaemoniumIngot extends Item {

	public ItemDaemoniumIngot() {
		super();
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabDecorations);
		setUnlocalizedName("daemoniumIngot");
		setTextureName(Daemonium.MODID+":daemoniumIngot");

	}
}
