package com.mathieu.daemonium.common.item;

import com.mathieu.daemonium.common.block.BlockDaemoniumOre;
import com.mathieu.daemonium.common.block.ModBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
//	public static Item daemoniumOreItem; 
	public static Item daemoniumIngot; 

	public static void init() {
//	    daemoniumOreItem = new Item();
		daemoniumIngot = new ItemDaemoniumIngot();
	    
	    GameRegistry.registerItem(daemoniumIngot, "daemoniumIngot");
//	    GameRegistry.registerItem(new ItemDaemoniumOre(new BlockDaemoniumOre()), daemoniumOreItem.getUnlocalizedName().substring(5));
	    
	}

}