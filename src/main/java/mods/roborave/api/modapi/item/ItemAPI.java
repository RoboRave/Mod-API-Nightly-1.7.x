package mods.roborave.api.modapi.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemAPI {

	public static ItemUtil Item1;
	public static ItemAPI Create;
	/**
	 * 
	 * @param item
	 * @param Material
	 * @param CreativeTab 
	 * @return
	 */
	public static ItemAPI createItem(ItemUtil item, CreativeTabs CreativeTab)
	{
		Item1=item;
		item= new ItemUtil(CreativeTab);
		return Create;
	}
	/**
	 * 
	 * @param ItemName name of item
	 * @param TextureName name of texture to Item
	 * @param ModID is the Modid of your mod
	 * @param item 
	 * @return ItemAPI
	 */
	public static ItemAPI addPeremeters(String ItemName, String TextureName, String ModID, Class<?extends ItemUtil> item)
	{
		try {
			item.newInstance().AddMethods(ItemName, TextureName, ModID);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Create;
	}
}

