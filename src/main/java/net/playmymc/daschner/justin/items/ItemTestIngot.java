package net.playmymc.daschner.justin.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.playmymc.daschner.justin.reference.reference;
//test item
public class ItemTestIngot extends Item 
{
	public ItemTestIngot()
	{
		super();
		setUnlocalizedName("testIngot");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
