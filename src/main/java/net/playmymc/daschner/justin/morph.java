package net.playmymc.daschner.justin;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.playmymc.daschner.justin.blocks.BlockTestOre;
import net.playmymc.daschner.justin.items.ItemTestIngot;
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
	
	//Item Variables
	public static Item testIngot;
	
	//GUI Variables
	public static Block sacrificeTable;

	public static morph instance;
	
	public static final int guiIDSacrificeTable = 1;
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Register Blocks
		testOre = new BlockTestOre();
		
		register.registerBlock(testOre);
		
		register.registerBlock(sacrificeTable);
		
		//Register Items
		
		testIngot = new ItemTestIngot();
		
		register.registerItem(testIngot);
	}
	
	
}
