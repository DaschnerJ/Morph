package net.playmymc.daschner.justin.tools.axes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.playmymc.daschner.justin.reference.reference;

public class ToolWhiteAxe extends ItemAxe 
{

	public ToolWhiteAxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("whiteAxe");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
