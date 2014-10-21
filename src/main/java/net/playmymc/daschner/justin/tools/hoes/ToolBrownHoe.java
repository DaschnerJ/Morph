package net.playmymc.daschner.justin.tools.hoes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.playmymc.daschner.justin.reference.reference;

public class ToolBrownHoe extends ItemHoe 
{

	public ToolBrownHoe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("brownHoe");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
