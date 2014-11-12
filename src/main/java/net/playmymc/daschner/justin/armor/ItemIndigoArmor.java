package net.playmymc.daschner.justin.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.playmymc.daschner.justin.morph;
import net.playmymc.daschner.justin.reference.reference;

public class ItemIndigoArmor extends ItemArmor {

	public ItemIndigoArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);	
		setUnlocalizedName(name);
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == morph.indigoHelmet)
		{
			return reference.MODID + ":models/armor/indigoarmor1.png";
		}
		else if(stack.getItem() == morph.indigoChestplate)
		{
			return reference.MODID + ":models/armor/indigoarmor1.png";
		}
		else if(stack.getItem() == morph.indigoLeggings)
		{
			return reference.MODID + ":models/armor/indigoarmor2.png";
		}
		else if(stack.getItem() == morph.indigoBoots)
		{
			return reference.MODID + ":models/armor/indigoarmor1.png";
		}
		else
		{
			System.out.println("Invalid Item ItemArmor Texture!");
			return null;
		}
	}
	
}

