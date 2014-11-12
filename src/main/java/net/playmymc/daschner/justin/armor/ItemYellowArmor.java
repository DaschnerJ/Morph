package net.playmymc.daschner.justin.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.playmymc.daschner.justin.morph;
import net.playmymc.daschner.justin.reference.reference;

public class ItemYellowArmor extends ItemArmor {

	public ItemYellowArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);	
		setUnlocalizedName(name);
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == morph.yellowHelmet)
		{
			return reference.MODID + ":models/armor/yellowarmor1.png";
		}
		else if(stack.getItem() == morph.yellowChestplate)
		{
			return reference.MODID + ":models/armor/yellowarmor1.png";
		}
		else if(stack.getItem() == morph.yellowLeggings)
		{
			return reference.MODID + ":models/armor/yellowarmor2.png";
		}
		else if(stack.getItem() == morph.yellowBoots)
		{
			return reference.MODID + ":models/armor/yellowarmor1.png";
		}
		else
		{
			System.out.println("Invalid Item ItemArmor Texture!");
			return null;
		}
	}
	
}
