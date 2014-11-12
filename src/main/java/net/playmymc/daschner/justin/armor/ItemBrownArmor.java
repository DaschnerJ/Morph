package net.playmymc.daschner.justin.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.playmymc.daschner.justin.morph;
import net.playmymc.daschner.justin.reference.reference;

public class ItemBrownArmor extends ItemArmor {

	public ItemBrownArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);	
		setUnlocalizedName(name);
		setTextureName(reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == morph.brownHelmet)
		{
			return reference.MODID + ":models/armor/brownarmor1.png";
		}
		else if(stack.getItem() == morph.brownChestplate)
		{
			return reference.MODID + ":models/armor/brownarmor1.png";
		}
		else if(stack.getItem() == morph.brownLeggings)
		{
			return reference.MODID + ":models/armor/brownarmor2.png";
		}
		else if(stack.getItem() == morph.brownBoots)
		{
			return reference.MODID + ":models/armor/brownarmor1.png";
		}
		else
		{
			System.out.println("Invalid Item ItemArmor Texture!");
			return null;
		}
	}
	
}

