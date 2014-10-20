package net.playmymc.daschner.justin.reference;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.playmymc.daschner.justin.morph;
import cpw.mods.fml.common.registry.GameRegistry;

public class register 
{
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, reference.MODID + "_" + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, reference.MODID + "_" + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(morph.yellowMorph, 3), new Object[]
				{
				    	Blocks.dirt, new ItemStack(morph.graliteMorph, 3)
				});
		GameRegistry.addShapelessRecipe(new ItemStack(morph.blueMorph, 3), new Object[]
				{
				    	Blocks.stone, new ItemStack(morph.graliteMorph, 3)
				});
	}
}
