package com.mathieu.daemonium.common.World;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldRegister {

	public static void regitry() {
		registerWorldGen(new WorldGenerate(),0);
	}
	
	public static void registerWorldGen (IWorldGenerator igenerator, int probability) {
		GameRegistry.registerWorldGenerator(igenerator, probability);
	}
	
	}
