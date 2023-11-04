package com.mathieu.daemonium.common.World;

import java.util.Random;

import com.mathieu.daemonium.common.block.ModBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenerate implements IWorldGenerator {  
	
	 
	    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	        if (world.provider.dimensionId == 0) { // Vérifiez que vous générez dans le monde normal
	        	generateOverWorld(world, chunkX * 16, chunkZ * 16,random);
	        }
	    }
	 

	
	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVein, int maxVein ) {
		
	}

	private void generateNether(World world, int i, int j, Random random) {
		// TODO Auto-generated method stub
		
	}
	private void generateOverWorld(World world, int x, int z, Random random) {
		for (int i = 0; i < 16; i++) {
            int xPos = x + random.nextInt(16);
            int yPos = random.nextInt(25); // Génération entre les couches 0 et 24 (ajoutez +1 si vous voulez inclure la couche 25)
            int zPos = z + random.nextInt(16);

            new WorldGenMinable(ModBlocks.daemoniumOre, 6).generate(world, random, xPos, yPos, zPos);
		
	}
	}
	private void generateEnd(World world, int i, int j, Random random) {
		// TODO Auto-generated method stub
		
	}

}
