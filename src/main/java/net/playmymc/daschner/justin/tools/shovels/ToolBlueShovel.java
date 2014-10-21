package net.playmymc.daschner.justin.tools.shovels;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.playmymc.daschner.justin.reference.reference;

public class ToolBlueShovel extends ItemSpade 
{

	public ToolBlueShovel(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("blueSpade");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
