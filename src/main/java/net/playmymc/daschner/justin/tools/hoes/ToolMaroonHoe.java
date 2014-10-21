package net.playmymc.daschner.justin.tools.hoes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.playmymc.daschner.justin.reference.reference;

public class ToolMaroonHoe extends ItemHoe 
{

	public ToolMaroonHoe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("maroonHoe");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
