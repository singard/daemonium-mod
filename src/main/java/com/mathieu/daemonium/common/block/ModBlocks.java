package com.mathieu.daemonium.common.block;

import com.mathieu.daemonium.common.item.ItemDaemoniumOre;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

	public static Block daemoniumOre;

	public static void init() {
		daemoniumOre = new BlockDaemoniumOre();
		GameRegistry.registerBlock(new BlockDaemoniumOre(), ItemDaemoniumOre.class,daemoniumOre.getUnlocalizedName().substring(5));
	}


}
