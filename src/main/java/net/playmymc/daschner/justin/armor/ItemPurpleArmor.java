package net.playmymc.daschner.justin.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.playmymc.daschner.justin.morph;
import net.playmymc.daschner.justin.reference.reference;

public class ItemPurpleArmor extends ItemArmor {

	public ItemPurpleArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);	
		setUnlocalizedName(name);
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == morph.purpleHelmet)
		{
			return reference.MODID + ":models/armor/purplearmor1.png";
		}
		else if(stack.getItem() == morph.purpleChestplate)
		{
			return reference.MODID + ":models/armor/purplearmor1.png";
		}
		else if(stack.getItem() == morph.purpleLeggings)
		{
			return reference.MODID + ":models/armor/purplearmor2.png";
		}
		else if(stack.getItem() == morph.purpleBoots)
		{
			return reference.MODID + ":models/armor/purplearmor1.png";
		}
		else
		{
			System.out.println("Invalid Item ItemArmor Texture!");
			return null;
		}
	}
	
}

