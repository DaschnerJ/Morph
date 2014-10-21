package net.playmymc.daschner.justin.tools.shovels;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.playmymc.daschner.justin.reference.reference;

public class ToolMaroonShovel extends ItemSpade 
{

	public ToolMaroonShovel(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("maroonSpade");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
