package net.playmymc.daschner.justin.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.playmymc.daschner.justin.reference.reference;

public class ItemYellowMorph extends Item 
{
	public ItemYellowMorph()
	{
		super();
		setUnlocalizedName("yellowMorph");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
