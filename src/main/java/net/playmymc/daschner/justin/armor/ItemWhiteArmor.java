package net.playmymc.daschner.justin.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.playmymc.daschner.justin.morph;
import net.playmymc.daschner.justin.reference.reference;

public class ItemWhiteArmor extends ItemArmor {

	public ItemWhiteArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);	
		setUnlocalizedName(name);
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == morph.whiteHelmet)
		{
			return reference.MODID + ":models/armor/whitearmor1.png";
		}
		else if(stack.getItem() == morph.whiteChestplate)
		{
			return reference.MODID + ":models/armor/whitearmor1.png";
		}
		else if(stack.getItem() == morph.whiteLeggings)
		{
			return reference.MODID + ":models/armor/whitearmor2.png";
		}
		else if(stack.getItem() == morph.whiteBoots)
		{
			return reference.MODID + ":models/armor/whitearmor1.png";
		}
		else
		{
			System.out.println("Invalid Item ItemArmor Texture!");
			return null;
		}
	}
	
}
