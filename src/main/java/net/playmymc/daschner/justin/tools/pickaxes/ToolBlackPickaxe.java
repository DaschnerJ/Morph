package net.playmymc.daschner.justin.tools.pickaxes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.playmymc.daschner.justin.reference.reference;

public class ToolBlackPickaxe extends ItemPickaxe 
{

	public ToolBlackPickaxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("blackPickaxe");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}