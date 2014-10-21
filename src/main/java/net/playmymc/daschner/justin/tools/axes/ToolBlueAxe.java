package net.playmymc.daschner.justin.tools.axes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.playmymc.daschner.justin.reference.reference;

public class ToolBlueAxe extends ItemAxe 
{

	public ToolBlueAxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("blueAxe");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
