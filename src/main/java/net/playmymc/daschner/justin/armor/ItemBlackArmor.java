package net.playmymc.daschner.justin.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.playmymc.daschner.justin.morph;
import net.playmymc.daschner.justin.reference.reference;

public class ItemBlackArmor extends ItemArmor {

	public ItemBlackArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);	
		setUnlocalizedName(name);
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == morph.blackHelmet)
		{
			return reference.MODID + ":models/armor/blackarmor1.png";
		}
		else if(stack.getItem() == morph.blackChestplate)
		{
			return reference.MODID + ":models/armor/blackarmor1.png";
		}
		else if(stack.getItem() == morph.blackLeggings)
		{
			return reference.MODID + ":models/armor/blackarmor2.png";
		}
		else if(stack.getItem() == morph.blackBoots)
		{
			return reference.MODID + ":models/armor/blackarmor1.png";
		}
		else
		{
			System.out.println("Invalid Item ItemArmor Texture!");
			return null;
		}
	}
	
}

