package net.playmymc.daschner.justin.tools.axes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.playmymc.daschner.justin.reference.reference;

public class ToolIndigoAxe extends ItemAxe 
{

	public ToolIndigoAxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("indigoAxe");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
