package net.playmymc.daschner.justin;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.playmymc.daschner.justin.blocks.BlockGraliteOre;
import net.playmymc.daschner.justin.blocks.BlockLucemLeaves;
import net.playmymc.daschner.justin.blocks.BlockLucemLog;
import net.playmymc.daschner.justin.blocks.BlockSolusOre;
import net.playmymc.daschner.justin.blocks.BlockTestOre;
import net.playmymc.daschner.justin.items.ItemBlackMorph;
import net.playmymc.daschner.justin.items.ItemBlueMorph;
import net.playmymc.daschner.justin.items.ItemBrownMorph;
import net.playmymc.daschner.justin.items.ItemGraliteMorph;
import net.playmymc.daschner.justin.items.ItemLeafBlocks;
import net.playmymc.daschner.justin.items.ItemLogBlocks;
import net.playmymc.daschner.justin.items.ItemGreenMorph;
import net.playmymc.daschner.justin.items.ItemIndigoMorph;
import net.playmymc.daschner.justin.items.ItemMaroonMorph;
import net.playmymc.daschner.justin.items.ItemOrangeMorph;
import net.playmymc.daschner.justin.items.ItemPurpleMorph;
import net.playmymc.daschner.justin.items.ItemRedMorph;
import net.playmymc.daschner.justin.items.ItemSolusDust;
import net.playmymc.daschner.justin.items.ItemSolusMetalicOrb;
import net.playmymc.daschner.justin.items.ItemTealMorph;
import net.playmymc.daschner.justin.items.ItemTestIngot;
import net.playmymc.daschner.justin.items.ItemWhiteMorph;
import net.playmymc.daschner.justin.items.ItemYellowMorph;
import net.playmymc.daschner.justin.reference.reference;
import net.playmymc.daschner.justin.reference.register;
import net.playmymc.daschner.justin.worldgen.MorphWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = reference.MODID, version = reference.VERSION)
public class morph 
{
	//World Gen Variable
	public static MorphWorldGen eventWorldGen = new MorphWorldGen();
	
	//Block Variables
	public static Block testOre;
	
	public static Block graliteOre;
	public static Block solusOre;
	
	//Item Variables
	public static Item testIngot;
	
	public static Item graliteMorph;
	public static Item solusDust;
	
	public static Item solusMetalicOrb;
	
	public static Item yellowMorph;
	public static Item blueMorph;
	public static Item redMorph;
	
	//Tree Variables
	public static Block blockLog;
	public static Block blockLeaf;
	public static Item greenMorph;
	public static Item purpleMorph;
	public static Item orangeMorph;
	
	public static Item tealMorph;
	public static Item indigoMorph;
	public static Item maroonMorph;
	
	public static Item whiteMorph;
	public static Item blackMorph;
	public static Item brownMorph;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Register Blocks
		testOre = new BlockTestOre();
		
		graliteOre = new BlockGraliteOre();
		solusOre = new BlockSolusOre();
		
		register.registerBlock(testOre);
		
		register.registerBlock(graliteOre);
		register.registerBlock(solusOre);
		
		//Register Items	
		testIngot = new ItemTestIngot();
		
		graliteMorph = new ItemGraliteMorph();
		
		solusDust = new ItemSolusDust();
		solusMetalicOrb = new ItemSolusMetalicOrb();
		
		yellowMorph = new ItemYellowMorph();
		blueMorph = new ItemBlueMorph();
		redMorph = new ItemRedMorph();
		
		greenMorph = new ItemGreenMorph();
		purpleMorph = new ItemPurpleMorph();
		orangeMorph = new ItemOrangeMorph();
		
		tealMorph = new ItemTealMorph();
		indigoMorph = new ItemIndigoMorph();
		maroonMorph = new ItemMaroonMorph();
		
		whiteMorph = new ItemWhiteMorph();
		blackMorph = new ItemBlackMorph();
		brownMorph = new ItemBrownMorph();
		
		register.registerItem(testIngot);
		
		register.registerItem(graliteMorph);
		
		register.registerItem(solusDust);
		register.registerItem(solusMetalicOrb);
		
		register.registerItem(yellowMorph);
		register.registerItem(blueMorph);
		register.registerItem(redMorph);
		
		register.registerItem(greenMorph);
		register.registerItem(purpleMorph);
		register.registerItem(orangeMorph);
		//Trees
		blockLog = new BlockLucemLog().setBlockName("Log").setCreativeTab(CreativeTabs.tabBlock);
		blockLeaf = new BlockLucemLeaves().setBlockName("Leaf").setCreativeTab(CreativeTabs.tabBlock);
		
		register.registerItem(tealMorph);
		register.registerItem(indigoMorph);
		register.registerItem(maroonMorph);
		
		register.registerItem(whiteMorph);
		register.registerItem(blackMorph);
		register.registerItem(brownMorph);
		
		GameRegistry.registerBlock(blockLog, ItemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLeaf, ItemLeafBlocks.class, blockLeaf.getUnlocalizedName().substring(5));

		
		//Register Crafting Recipes
		register.registerRecipes();
		
		//Register World Generator
		register.registerWorldGen();
	}
	
	
}
