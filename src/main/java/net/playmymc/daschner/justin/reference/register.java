package net.playmymc.daschner.justin.reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class register 
{
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, reference.MODID + "_" + block.getUnlocalizedName().substring(5));
	}
}
