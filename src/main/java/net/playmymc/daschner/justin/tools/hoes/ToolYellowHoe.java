package net.playmymc.daschner.justin.tools.hoes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.playmymc.daschner.justin.reference.reference;

public class ToolYellowHoe extends ItemHoe 
{
	public ToolYellowHoe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("yellowHoe");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
