package net.playmymc.daschner.justin.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.playmymc.daschner.justin.reference.reference;

public class ItemPurpleMorph extends Item {
	
	public ItemPurpleMorph()
	{
		super();
		setUnlocalizedName("purpleMorph");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
