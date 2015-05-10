package mods.roborave.api.modapi.item.armor;

import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorAPI{

	public static ArmorMaterial Test;
	public void createHelmat(ArmorMaterial e){
		
		new ItemHelmat(e, 0, null, null);
	}
}
