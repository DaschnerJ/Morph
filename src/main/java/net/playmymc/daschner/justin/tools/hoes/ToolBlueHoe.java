package net.playmymc.daschner.justin.tools.hoes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.playmymc.daschner.justin.reference.reference;

public class ToolBlueHoe extends ItemHoe 
{

	public ToolBlueHoe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("blueHoe");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
