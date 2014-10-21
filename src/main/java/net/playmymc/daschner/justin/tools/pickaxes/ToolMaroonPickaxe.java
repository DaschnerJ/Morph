package net.playmymc.daschner.justin.tools.pickaxes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.playmymc.daschner.justin.reference.reference;

public class ToolMaroonPickaxe extends ItemPickaxe 
{

	public ToolMaroonPickaxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("maroonPickaxe");
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
