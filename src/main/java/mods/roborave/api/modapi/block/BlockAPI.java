package mods.roborave.api.modapi.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAPI {

	public static BlockAPI Create;
	/**
	 * 
	 * @param block
	 * @param CreativeTab 
	 * @param material 
	 * @return
	 */
	public static BlockAPI createBlock(BlockUtil block, CreativeTabs CreativeTab, Material material)
	{
		block= new BlockUtil(material);
		return Create;
	}
	/**
	 * 
	 * @param name
	 * @param textureName
	 * @param block
	 * @param creativetab 
	 * @return
	 */
	public static BlockAPI addPeremeters(String name, String textureName, Class<?extends BlockUtil> block, CreativeTabs creativetab)
	{
		try {
			block.newInstance().AddMethods(name, textureName, creativetab);
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

