package mods.roborave.api.modapi.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemUtil extends Item {

	public ItemUtil(CreativeTabs par1CreativeTabs){
		this.setCreativeTab(par1CreativeTabs);
	}
	public ItemUtil AddMethods(String NAME, String textureName1, String ModID)
	{
		setUnlocalizedName(NAME);
		setTextureName(textureName1);
		GameRegistry.registerItem(this, NAME, ModID);
		return this;
	}
}
