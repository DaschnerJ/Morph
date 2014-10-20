package net.playmymc.daschner.justin;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.playmymc.daschner.justin.blocks.BlockGraliteOre;
import net.playmymc.daschner.justin.blocks.BlockLucemLeaves;
import net.playmymc.daschner.justin.blocks.BlockLucemLog;
import net.playmymc.daschner.justin.blocks.BlockTestOre;
import net.playmymc.daschner.justin.items.ItemBlueMorph;
import net.playmymc.daschner.justin.items.ItemGraliteMorph;
import net.playmymc.daschner.justin.items.ItemLeafBlocks;
import net.playmymc.daschner.justin.items.ItemLogBlocks;
import net.playmymc.daschner.justin.items.ItemRedMorph;
import net.playmymc.daschner.justin.items.ItemTestIngot;
import net.playmymc.daschner.justin.items.ItemYellowMorph;
import net.playmymc.daschner.justin.reference.reference;
import net.playmymc.daschner.justin.reference.register;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = reference.MODID, version = reference.VERSION)
public class morph 
{
	//Block Variables
	public static Block testOre;
	public static Block graliteOre;
	
	//Item Variables
	public static Item testIngot;
	
	public static Item graliteMorph;
	public static Item yellowMorph;
	public static Item blueMorph;
	public static Item redMorph;
	
	//Tree Variables
	public static Block blockLog;
	public static Block blockLeaf;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Register Blocks
		testOre = new BlockTestOre();
		graliteOre = new BlockGraliteOre();
		
		register.registerBlock(testOre);
		register.registerBlock(graliteOre);
		
		//Register Items	
		testIngot = new ItemTestIngot();
		
		graliteMorph = new ItemGraliteMorph();
		yellowMorph = new ItemYellowMorph();
		blueMorph = new ItemBlueMorph();
		redMorph = new ItemRedMorph();
		
		register.registerItem(testIngot);
		
		register.registerItem(graliteMorph);
		register.registerItem(yellowMorph);
		register.registerItem(blueMorph);
		register.registerItem(redMorph);
		
		//Trees
		blockLog = new BlockLucemLog().setBlockName("Log").setCreativeTab(CreativeTabs.tabBlock);
		blockLeaf = new BlockLucemLeaves().setBlockName("Leaf").setCreativeTab(CreativeTabs.tabBlock);
		
		GameRegistry.registerBlock(blockLog, ItemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLeaf, ItemLeafBlocks.class, blockLeaf.getUnlocalizedName().substring(5));

		
		//Register Crafting Recipes
		register.registerRecipes();
	}
	
	
}
