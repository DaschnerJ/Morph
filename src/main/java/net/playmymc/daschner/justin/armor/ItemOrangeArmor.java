package net.playmymc.daschner.justin.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.playmymc.daschner.justin.morph;
import net.playmymc.daschner.justin.reference.reference;

public class ItemOrangeArmor extends ItemArmor {

	public ItemOrangeArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);	
		setUnlocalizedName(name);
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == morph.orangeHelmet)
		{
			return reference.MODID + ":models/armor/orangearmor1.png";
		}
		else if(stack.getItem() == morph.orangeChestplate)
		{
			return reference.MODID + ":models/armor/orangearmor1.png";
		}
		else if(stack.getItem() == morph.orangeLeggings)
		{
			return reference.MODID + ":models/armor/orangearmor2.png";
		}
		else if(stack.getItem() == morph.orangeBoots)
		{
			return reference.MODID + ":models/armor/orangearmor1.png";
		}
		else
		{
			System.out.println("Invalid Item ItemArmor Texture!");
			return null;
		}
	}
	
}
