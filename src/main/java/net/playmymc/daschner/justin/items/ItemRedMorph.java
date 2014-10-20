package net.playmymc.daschner.justin.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.playmymc.daschner.justin.reference.reference;

public class ItemRedMorph extends Item 
{
	public ItemRedMorph()
	{
		super();
		setUnlocalizedName("redMorph");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
