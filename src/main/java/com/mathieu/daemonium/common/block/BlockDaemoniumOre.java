package com.mathieu.daemonium.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDaemoniumOre extends Block {
	
	public BlockDaemoniumOre() {
        super(Material.rock);
        
        setHardness(3.0F); // R�glez la duret� du minerai
        setResistance(5.0F); // R�glez la r�sistance du minerai
        setHarvestLevel("pickaxe", 2); // R�glez le niveau d'outil n�cessaire (2 pour Diamond Pickaxe)
        setBlockName("DaemoniumOre");
        setCreativeTab(CreativeTabs.tabBlock); // Ajoutez le bloc � un onglet cr�atif
        setBlockTextureName("daemonium:daemonium_ore");
        
        
    }

}
