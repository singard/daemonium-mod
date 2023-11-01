package com.mathieu.daemonium.common;

import net.minecraft.init.Blocks;

import com.mathieu.daemonium.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Daemonium.MODID, version = Daemonium.VERSION)
public class Daemonium {
	
	public static final String MODID = "daemonium";
	public static final String VERSION = "0.1";
	
	@Instance(MODID)
	public static Daemonium instance;
	
	@SidedProxy(clientSide = "com.mathieu.daemonium.proxy.ClientProxy", serverSide = "com.mathieu.daemonium.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// some example code
		proxy.registerRender();
		System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){

	}
}
