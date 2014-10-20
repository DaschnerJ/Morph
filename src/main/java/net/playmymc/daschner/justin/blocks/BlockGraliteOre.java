package net.playmymc.daschner.justin.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.playmymc.daschner.justin.reference.reference;

public class BlockGraliteOre extends Block
{	
	public BlockGraliteOre()
	{
		//block attributes
		super(Material.rock);
		setBlockName("graliteOre");
		setBlockTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypePiston);
		setHardness(3.0F);
		setResistance(5.0F);
		setLightLevel(0.1F);
		
	}
}
