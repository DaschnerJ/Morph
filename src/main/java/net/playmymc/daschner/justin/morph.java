package net.playmymc.daschner.justin;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.playmymc.daschner.justin.armor.ItemBlackArmor;
import net.playmymc.daschner.justin.armor.ItemBlueArmor;
import net.playmymc.daschner.justin.armor.ItemBrownArmor;
import net.playmymc.daschner.justin.armor.ItemGreenArmor;
import net.playmymc.daschner.justin.armor.ItemIndigoArmor;
import net.playmymc.daschner.justin.armor.ItemMaroonArmor;
import net.playmymc.daschner.justin.armor.ItemOrangeArmor;
import net.playmymc.daschner.justin.armor.ItemPurpleArmor;
import net.playmymc.daschner.justin.armor.ItemRedArmor;
import net.playmymc.daschner.justin.armor.ItemTealArmor;
import net.playmymc.daschner.justin.armor.ItemWhiteArmor;
import net.playmymc.daschner.justin.armor.ItemYellowArmor;
import net.playmymc.daschner.justin.blocks.BlockGraliteOre;
import net.playmymc.daschner.justin.blocks.BlockLadiusOre;
import net.playmymc.daschner.justin.blocks.BlockLucemLeaves;
import net.playmymc.daschner.justin.blocks.BlockLucemLog;
import net.playmymc.daschner.justin.blocks.BlockSolusOre;
import net.playmymc.daschner.justin.blocks.BlockTestOre;
import net.playmymc.daschner.justin.items.ItemBlackMorph;
import net.playmymc.daschner.justin.items.ItemBlueMorph;
import net.playmymc.daschner.justin.items.ItemBrownMorph;
import net.playmymc.daschner.justin.items.ItemGraliteMorph;
import net.playmymc.daschner.justin.items.ItemGreenMorph;
import net.playmymc.daschner.justin.items.ItemIndigoMorph;
import net.playmymc.daschner.justin.items.ItemLeafBlocks;
import net.playmymc.daschner.justin.items.ItemLogBlocks;
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
import net.playmymc.daschner.justin.tools.axes.ToolBlackAxe;
import net.playmymc.daschner.justin.tools.axes.ToolBlueAxe;
import net.playmymc.daschner.justin.tools.axes.ToolBrownAxe;
import net.playmymc.daschner.justin.tools.axes.ToolGreenAxe;
import net.playmymc.daschner.justin.tools.axes.ToolIndigoAxe;
import net.playmymc.daschner.justin.tools.axes.ToolMaroonAxe;
import net.playmymc.daschner.justin.tools.axes.ToolOrangeAxe;
import net.playmymc.daschner.justin.tools.axes.ToolPurpleAxe;
import net.playmymc.daschner.justin.tools.axes.ToolRedAxe;
import net.playmymc.daschner.justin.tools.axes.ToolTealAxe;
import net.playmymc.daschner.justin.tools.axes.ToolWhiteAxe;
import net.playmymc.daschner.justin.tools.axes.ToolYellowAxe;
import net.playmymc.daschner.justin.tools.hoes.ToolBlackHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolBlueHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolBrownHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolGreenHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolIndigoHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolMaroonHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolOrangeHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolPurpleHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolRedHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolTealHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolWhiteHoe;
import net.playmymc.daschner.justin.tools.hoes.ToolYellowHoe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolBlackPickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolBluePickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolBrownPickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolGreenPickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolIndigoPickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolMaroonPickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolOrangePickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolPurplePickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolRedPickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolTealPickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolWhitePickaxe;
import net.playmymc.daschner.justin.tools.pickaxes.ToolYellowPickaxe;
import net.playmymc.daschner.justin.tools.shovels.ToolBlackShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolBlueShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolBrownShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolGreenShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolIndigoShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolMaroonShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolOrangeShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolPurpleShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolRedShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolTealShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolWhiteShovel;
import net.playmymc.daschner.justin.tools.shovels.ToolYellowShovel;
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
	public static Block ladiusOre;
	
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
	
	//Tools
	//Pickaxes
	public static Item yellowPickaxe;
	public static Item bluePickaxe;
	public static Item redPickaxe;
	
	public static Item greenPickaxe;
	public static Item purplePickaxe;
	public static Item orangePickaxe;
	
	public static Item tealPickaxe;
	public static Item indigoPickaxe;
	public static Item maroonPickaxe;
	
	public static Item whitePickaxe;
	public static Item blackPickaxe;
	public static Item brownPickaxe;
	
	//Shovels
	public static Item yellowShovel;
	public static Item blueShovel;
	public static Item redShovel;
	
	public static Item greenShovel;
	public static Item purpleShovel;
	public static Item orangeShovel;
	
	public static Item tealShovel;
	public static Item indigoShovel;
	public static Item maroonShovel;
	
	public static Item whiteShovel;
	public static Item blackShovel;
	public static Item brownShovel;
	
	//Axe
	public static Item yellowAxe;
	public static Item blueAxe;
	public static Item redAxe;
		
	public static Item greenAxe;
	public static Item purpleAxe;
	public static Item orangeAxe;
		
	public static Item tealAxe;
	public static Item indigoAxe;
	public static Item maroonAxe;
		
	public static Item whiteAxe;
	public static Item blackAxe;
	public static Item brownAxe;
	
	//Hoe
	public static Item yellowHoe;
	public static Item blueHoe;
	public static Item redHoe;
		
	public static Item greenHoe;
	public static Item purpleHoe;
	public static Item orangeHoe;
		
	public static Item tealHoe;
	public static Item indigoHoe;
	public static Item maroonHoe;
		
	public static Item whiteHoe;
	public static Item blackHoe;
	public static Item brownHoe;
	
	//Armor
	public static Item yellowHelmet;
	public static Item yellowChestplate;
	public static Item yellowLeggings;
	public static Item yellowBoots;
	
	public static Item blueHelmet;
	public static Item blueChestplate;
	public static Item blueLeggings;
	public static Item blueBoots;
	
	public static Item redHelmet;
	public static Item redChestplate;
	public static Item redLeggings;
	public static Item redBoots;
	
	public static Item greenHelmet;
	public static Item greenChestplate;
	public static Item greenLeggings;
	public static Item greenBoots;
	
	public static Item purpleHelmet;
	public static Item purpleChestplate;
	public static Item purpleLeggings;
	public static Item purpleBoots;
	
	public static Item orangeHelmet;
	public static Item orangeChestplate;
	public static Item orangeLeggings;
	public static Item orangeBoots;
	
	public static Item tealHelmet;
	public static Item tealChestplate;
	public static Item tealLeggings;
	public static Item tealBoots;
	
	public static Item indigoHelmet;
	public static Item indigoChestplate;
	public static Item indigoLeggings;
	public static Item indigoBoots;
	
	public static Item maroonHelmet;
	public static Item maroonChestplate;
	public static Item maroonLeggings;
	public static Item maroonBoots;
	
	public static Item whiteHelmet;
	public static Item whiteChestplate;
	public static Item whiteLeggings;
	public static Item whiteBoots;
	
	public static Item blackHelmet;
	public static Item blackChestplate;
	public static Item blackLeggings;
	public static Item blackBoots;
	
	public static Item brownHelmet;
	public static Item brownChestplate;
	public static Item brownLeggings;
	public static Item brownBoots;
	
	//Material
	static ToolMaterial yellowMaterial = EnumHelper.addToolMaterial("yellowMorphMaterial", 4, 100, 7, 0.0F, 10);
	static ToolMaterial blueMaterial = EnumHelper.addToolMaterial("blueMorphMaterial", 4, 100, 7, 0.0F, 10);
	static ToolMaterial redMaterial = EnumHelper.addToolMaterial("redMorphMaterial", 4, 100, 7, 0.0F, 10);
	
	static ToolMaterial greenMaterial = EnumHelper.addToolMaterial("greenMorphMaterial", 4, 100, 7, 0.0F, 10);
	static ToolMaterial purpleMaterial = EnumHelper.addToolMaterial("purpleMorphMaterial", 4, 100, 7, 0.0F, 10);
	static ToolMaterial orangeMaterial = EnumHelper.addToolMaterial("orangeMorphMaterial", 4, 100, 7, 0.0F, 10);
	
	static ToolMaterial tealMaterial = EnumHelper.addToolMaterial("tealMorphMaterial", 4, 100, 7, 0.0F, 10);
	static ToolMaterial indigoMaterial = EnumHelper.addToolMaterial("indigoMorphMaterial", 4, 100, 7, 0.0F, 10);
	static ToolMaterial maroonMaterial = EnumHelper.addToolMaterial("maroonMorphMaterial", 4, 100, 7, 0.0F, 10);
	
	static ToolMaterial whiteMaterial = EnumHelper.addToolMaterial("whiteMorphMaterial", 4, 100, 7, 0.0F, 10);
	static ToolMaterial blackMaterial = EnumHelper.addToolMaterial("blackMorphMaterial", 4, 100, 7, 0.0F, 10);
	static ToolMaterial brownMaterial = EnumHelper.addToolMaterial("brownMorphMaterial", 4, 100, 7, 0.0F, 10);
	
	static ArmorMaterial yellowArmorMaterial = EnumHelper.addArmorMaterial("yellowArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	static ArmorMaterial blueArmorMaterial = EnumHelper.addArmorMaterial("blueArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	static ArmorMaterial redArmorMaterial = EnumHelper.addArmorMaterial("redArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	
	static ArmorMaterial greenArmorMaterial = EnumHelper.addArmorMaterial("greenArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	static ArmorMaterial purpleArmorMaterial = EnumHelper.addArmorMaterial("purpleArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	static ArmorMaterial orangeArmorMaterial = EnumHelper.addArmorMaterial("orangeArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	
	static ArmorMaterial tealArmorMaterial = EnumHelper.addArmorMaterial("tealArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	static ArmorMaterial indigoArmorMaterial = EnumHelper.addArmorMaterial("indigoArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	static ArmorMaterial maroonArmorMaterial = EnumHelper.addArmorMaterial("maroonArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	
	static ArmorMaterial whiteArmorMaterial = EnumHelper.addArmorMaterial("whiteArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	static ArmorMaterial blackArmorMaterial = EnumHelper.addArmorMaterial("blackArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	static ArmorMaterial brownArmorMaterial = EnumHelper.addArmorMaterial("brownArmorMaterial", 20, new int[]{2, 6, 5, 2}, 10);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Register Blocks
		testOre = new BlockTestOre();
		
		graliteOre = new BlockGraliteOre();
		solusOre = new BlockSolusOre();
		ladiusOre = new BlockLadiusOre();
		
		register.registerBlock(testOre);
		
		register.registerBlock(graliteOre);
		register.registerBlock(solusOre);
		register.registerBlock(ladiusOre);
		
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
		
		register.registerItem(tealMorph);
		register.registerItem(indigoMorph);
		register.registerItem(maroonMorph);
		
		register.registerItem(whiteMorph);
		register.registerItem(blackMorph);
		register.registerItem(brownMorph);
		
		//Tools
		//Pickaxe
		yellowPickaxe = new ToolYellowPickaxe(yellowMaterial);
		bluePickaxe = new ToolBluePickaxe(blueMaterial);
		redPickaxe = new ToolRedPickaxe(redMaterial);
		
		greenPickaxe = new ToolGreenPickaxe(greenMaterial);
		purplePickaxe = new ToolPurplePickaxe(purpleMaterial);
		orangePickaxe = new ToolOrangePickaxe(orangeMaterial);
		
		tealPickaxe = new ToolTealPickaxe(tealMaterial);
		indigoPickaxe = new ToolIndigoPickaxe(indigoMaterial);
		maroonPickaxe = new ToolMaroonPickaxe(maroonMaterial);
		
		whitePickaxe = new ToolWhitePickaxe(whiteMaterial);
		blackPickaxe = new ToolBlackPickaxe(blackMaterial);
		brownPickaxe = new ToolBrownPickaxe(brownMaterial);
		
		register.registerItem(yellowPickaxe);
		register.registerItem(bluePickaxe);
		register.registerItem(redPickaxe);
		
		register.registerItem(greenPickaxe);
		register.registerItem(purplePickaxe);
		register.registerItem(orangePickaxe);
		
		register.registerItem(tealPickaxe);
		register.registerItem(indigoPickaxe);
		register.registerItem(maroonPickaxe);
		
		register.registerItem(whitePickaxe);
		register.registerItem(blackPickaxe);
		register.registerItem(brownPickaxe);
		
		//Shovel
		yellowShovel = new ToolYellowShovel(yellowMaterial);
		blueShovel = new ToolBlueShovel(blueMaterial);
		redShovel = new ToolRedShovel(redMaterial);
				
		greenShovel = new ToolGreenShovel(greenMaterial);
		purpleShovel = new ToolPurpleShovel(purpleMaterial);
		orangeShovel = new ToolOrangeShovel(orangeMaterial);
				
		tealShovel = new ToolTealShovel(tealMaterial);
		indigoShovel = new ToolIndigoShovel(indigoMaterial);
		maroonShovel = new ToolMaroonShovel(maroonMaterial);
				
		whiteShovel = new ToolWhiteShovel(whiteMaterial);
		blackShovel = new ToolBlackShovel(blackMaterial);
		brownShovel = new ToolBrownShovel(brownMaterial);
				
		register.registerItem(yellowShovel);
		register.registerItem(blueShovel);
		register.registerItem(redShovel);
				
		register.registerItem(greenShovel);
		register.registerItem(purpleShovel);
		register.registerItem(orangeShovel);
				
		register.registerItem(tealShovel);
		register.registerItem(indigoShovel);
		register.registerItem(maroonShovel);
				
		register.registerItem(whiteShovel);
		register.registerItem(blackShovel);
		register.registerItem(brownShovel);	
		
		//Axe
		yellowAxe = new ToolYellowAxe(yellowMaterial);
		blueAxe = new ToolBlueAxe(blueMaterial);
		redAxe = new ToolRedAxe(redMaterial);
						
		greenAxe = new ToolGreenAxe(greenMaterial);
		purpleAxe = new ToolPurpleAxe(purpleMaterial);
		orangeAxe = new ToolOrangeAxe(orangeMaterial);
						
		tealAxe = new ToolTealAxe(tealMaterial);
		indigoAxe = new ToolIndigoAxe(indigoMaterial);
		maroonAxe = new ToolMaroonAxe(maroonMaterial);
						
		whiteAxe = new ToolWhiteAxe(whiteMaterial);
		blackAxe = new ToolBlackAxe(blackMaterial);
		brownAxe = new ToolBrownAxe(brownMaterial);
						
		register.registerItem(yellowAxe);
		register.registerItem(blueAxe);
		register.registerItem(redAxe);
						
		register.registerItem(greenAxe);
		register.registerItem(purpleAxe);
		register.registerItem(orangeAxe);
						
		register.registerItem(tealAxe);
		register.registerItem(indigoAxe);
		register.registerItem(maroonAxe);
						
		register.registerItem(whiteAxe);
		register.registerItem(blackAxe);
		register.registerItem(brownAxe);
		
		//Hoe
		yellowHoe = new ToolYellowHoe(yellowMaterial);
		blueHoe = new ToolBlueHoe(blueMaterial);
		redHoe = new ToolRedHoe(redMaterial);
								
		greenHoe = new ToolGreenHoe(greenMaterial);
		purpleHoe = new ToolPurpleHoe(purpleMaterial);
		orangeHoe = new ToolOrangeHoe(orangeMaterial);
								
		tealHoe = new ToolTealHoe(tealMaterial);
		indigoHoe = new ToolIndigoHoe(indigoMaterial);
		maroonHoe = new ToolMaroonHoe(maroonMaterial);
								
		whiteHoe = new ToolWhiteHoe(whiteMaterial);
		blackHoe = new ToolBlackHoe(blackMaterial);
		brownHoe = new ToolBrownHoe(brownMaterial);
								
		register.registerItem(yellowHoe);
		register.registerItem(blueHoe);
		register.registerItem(redHoe);
								
		register.registerItem(greenHoe);
		register.registerItem(purpleHoe);
		register.registerItem(orangeHoe);
								
		register.registerItem(tealHoe);
		register.registerItem(indigoHoe);
		register.registerItem(maroonHoe);
								
		register.registerItem(whiteHoe);
		register.registerItem(blackHoe);
		register.registerItem(brownHoe);
		
		//Armor
		yellowHelmet = new ItemYellowArmor(yellowArmorMaterial, 0, "yellowHelmet");
		yellowChestplate = new ItemYellowArmor(yellowArmorMaterial, 1, "yellowChestplate");
		yellowLeggings = new ItemYellowArmor(yellowArmorMaterial, 2, "yellowLeggings");
		yellowBoots = new ItemYellowArmor(yellowArmorMaterial, 3, "yellowBoots");
		
		blueHelmet = new ItemBlueArmor(blueArmorMaterial, 0, "blueHelmet");
		blueChestplate = new ItemBlueArmor(blueArmorMaterial, 1, "blueChestplate");
		blueLeggings = new ItemBlueArmor(blueArmorMaterial, 2, "blueLeggings");
		blueBoots = new ItemBlueArmor(blueArmorMaterial, 3, "blueBoots");
		
		redHelmet = new ItemRedArmor(redArmorMaterial, 0, "redHelmet");
		redChestplate = new ItemRedArmor(redArmorMaterial, 1, "redChestplate");
		redLeggings = new ItemRedArmor(redArmorMaterial, 2, "redLeggings");
		redBoots = new ItemRedArmor(redArmorMaterial, 3, "redBoots");
		
		greenHelmet = new ItemGreenArmor(greenArmorMaterial, 0, "greenHelmet");
		greenChestplate = new ItemGreenArmor(greenArmorMaterial, 1, "greenChestplate");
		greenLeggings = new ItemGreenArmor(greenArmorMaterial, 2, "greenLeggings");
		greenBoots = new ItemGreenArmor(greenArmorMaterial, 3, "greenBoots");
		
		purpleHelmet = new ItemPurpleArmor(purpleArmorMaterial, 0, "purpleHelmet");
		purpleChestplate = new ItemPurpleArmor(purpleArmorMaterial, 1, "purpleChestplate");
		purpleLeggings = new ItemPurpleArmor(purpleArmorMaterial, 2, "purpleLeggings");
		purpleBoots = new ItemPurpleArmor(purpleArmorMaterial, 3, "purpleBoots");
		
		orangeHelmet = new ItemOrangeArmor(orangeArmorMaterial, 0, "orangeHelmet");
		orangeChestplate = new ItemOrangeArmor(orangeArmorMaterial, 1, "orangeChestplate");
		orangeLeggings = new ItemOrangeArmor(orangeArmorMaterial, 2, "orangeLeggings");
		orangeBoots = new ItemOrangeArmor(orangeArmorMaterial, 3, "orangeBoots");
		
		tealHelmet = new ItemTealArmor(tealArmorMaterial, 0, "tealHelmet");
		tealChestplate = new ItemTealArmor(tealArmorMaterial, 1, "tealChestplate");
		tealLeggings = new ItemTealArmor(tealArmorMaterial, 2, "tealLeggings");
		tealBoots = new ItemTealArmor(tealArmorMaterial, 3, "tealBoots");
		
		indigoHelmet = new ItemIndigoArmor(indigoArmorMaterial, 0, "indigoHelmet");
		indigoChestplate = new ItemIndigoArmor(indigoArmorMaterial, 1, "indigoChestplate");
		indigoLeggings = new ItemIndigoArmor(indigoArmorMaterial, 2, "indigoLeggings");
		indigoBoots = new ItemIndigoArmor(indigoArmorMaterial, 3, "indigoBoots");
		
		maroonHelmet = new ItemMaroonArmor(maroonArmorMaterial, 0, "maroonHelmet");
		maroonChestplate = new ItemMaroonArmor(maroonArmorMaterial, 1, "maroonChestplate");
		maroonLeggings = new ItemMaroonArmor(maroonArmorMaterial, 2, "maroonLeggings");
		maroonBoots = new ItemMaroonArmor(maroonArmorMaterial, 3, "maroonBoots");
		
		whiteHelmet = new ItemWhiteArmor(whiteArmorMaterial, 0, "whiteHelmet");
		whiteChestplate = new ItemWhiteArmor(whiteArmorMaterial, 1, "whiteChestplate");
		whiteLeggings = new ItemWhiteArmor(whiteArmorMaterial, 2, "whiteLeggings");
		whiteBoots = new ItemWhiteArmor(whiteArmorMaterial, 3, "whiteBoots");
		
		blackHelmet = new ItemBlackArmor(blackArmorMaterial, 0, "blackHelmet");
		blackChestplate = new ItemBlackArmor(blackArmorMaterial, 1, "blackChestplate");
		blackLeggings = new ItemBlackArmor(blackArmorMaterial, 2, "blackLeggings");
		blackBoots = new ItemBlackArmor(blackArmorMaterial, 3, "blackBoots");
		
		brownHelmet = new ItemBrownArmor(brownArmorMaterial, 0, "brownHelmet");
		brownChestplate = new ItemBrownArmor(brownArmorMaterial, 1, "brownChestplate");
		brownLeggings = new ItemBrownArmor(brownArmorMaterial, 2, "brownLeggings");
		brownBoots = new ItemBrownArmor(brownArmorMaterial, 3, "brownBoots");
		
		register.registerItem(yellowHelmet);
		register.registerItem(yellowChestplate);
		register.registerItem(yellowLeggings);
		register.registerItem(yellowBoots);
		
		register.registerItem(blueHelmet);
		register.registerItem(blueChestplate);
		register.registerItem(blueLeggings);
		register.registerItem(blueBoots);
		
		register.registerItem(redHelmet);
		register.registerItem(redChestplate);
		register.registerItem(redLeggings);
		register.registerItem(redBoots);
		
		register.registerItem(greenHelmet);
		register.registerItem(greenChestplate);
		register.registerItem(greenLeggings);
		register.registerItem(greenBoots);
		
		register.registerItem(purpleHelmet);
		register.registerItem(purpleChestplate);
		register.registerItem(purpleLeggings);
		register.registerItem(purpleBoots);
		
		register.registerItem(orangeHelmet);
		register.registerItem(orangeChestplate);
		register.registerItem(orangeLeggings);
		register.registerItem(orangeBoots);	
		
		register.registerItem(tealHelmet);
		register.registerItem(tealChestplate);
		register.registerItem(tealLeggings);
		register.registerItem(tealBoots);
		
		register.registerItem(indigoHelmet);
		register.registerItem(indigoChestplate);
		register.registerItem(indigoLeggings);
		register.registerItem(indigoBoots);
		
		register.registerItem(maroonHelmet);
		register.registerItem(maroonChestplate);
		register.registerItem(maroonLeggings);
		register.registerItem(maroonBoots);
		
		register.registerItem(whiteHelmet);
		register.registerItem(whiteChestplate);
		register.registerItem(whiteLeggings);
		register.registerItem(whiteBoots);
		
		register.registerItem(blackHelmet);
		register.registerItem(blackChestplate);
		register.registerItem(blackLeggings);
		register.registerItem(blackBoots);
		
		register.registerItem(brownHelmet);
		register.registerItem(brownChestplate);
		register.registerItem(brownLeggings);
		register.registerItem(brownBoots);	
		
		//Trees
		blockLog = new BlockLucemLog().setBlockName("Log").setCreativeTab(CreativeTabs.tabBlock);
		blockLeaf = new BlockLucemLeaves().setBlockName("Leaf").setCreativeTab(CreativeTabs.tabBlock);
				
		GameRegistry.registerBlock(blockLog, ItemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLeaf, ItemLeafBlocks.class, blockLeaf.getUnlocalizedName().substring(5));

		
		//Register Crafting Recipes
		register.registerRecipes();
		
		//Register World Generator
		register.registerWorldGen();
		
		//Register Smelting Recipes
		register.registerSmeltingRecipes();
	}
	
	
}
