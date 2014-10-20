package net.playmymc.daschner.justin;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.playmymc.daschner.justin.blocks.BlockGraliteOre;
import net.playmymc.daschner.justin.blocks.BlockTestOre;
import net.playmymc.daschner.justin.items.ItemBlueMorph;
import net.playmymc.daschner.justin.items.ItemGraliteMorph;
import net.playmymc.daschner.justin.items.ItemRedMorph;
import net.playmymc.daschner.justin.items.ItemTestIngot;
import net.playmymc.daschner.justin.items.ItemYellowMorph;
import net.playmymc.daschner.justin.reference.reference;
import net.playmymc.daschner.justin.reference.register;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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
	}
	
	
}
