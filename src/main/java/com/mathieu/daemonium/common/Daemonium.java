package com.mathieu.daemonium.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.mathieu.daemonium.common.World.WorldGenerate;
import com.mathieu.daemonium.common.block.ModBlocks;
import com.mathieu.daemonium.common.item.ModItems;
import com.mathieu.daemonium.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Daemonium.MODID, version = Daemonium.VERSION)
public class Daemonium {

	public static final String MODID = "daemonium";
	public static final String VERSION = "0.1";

	@Instance(MODID)
	public static Daemonium instance;

	@SidedProxy(clientSide = "com.mathieu.daemonium.proxy.ClientProxy", serverSide = "com.mathieu.daemonium.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
//		ModBlocks.init(); 
		ModItems.init();

//		GameRegistry.registerWorldGenerator(new WorldGenerate(), 0);

//		CreativeTabs tabDaemonium = new CreativeTabs("tabDaemonium") {
//			@Override
//			public Item getTabIconItem() {
//				return Item.getItemFromBlock(ModBlocks.daemoniumOre);
//			}
//		};

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerBlock();
		System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
