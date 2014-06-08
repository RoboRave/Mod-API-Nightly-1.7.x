package mods.roborave.api.modapi.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAPI {

	public static Block block1;
	/**
	 * 
	 * @param block
	 * @param Material
	 * @param BlockClass
	 * @return
	 */
	public static Block createBlock(Block block, Material Material, Block BlockClass)
	{
		block1=block;
		block= new BlockUtil(Material);
		return BlockUtil.isBlockCreated();
	}
	/**
	 * 
	 * @param name
	 * @param textureName
	 * @param block
	 * @return
	 */
	public static Block addPeremeters(String name, String textureName, Class<?extends BlockUtil> block)
	{
		try {
			return block.newInstance().AddMethods(name, textureName);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return block1;
	}
}

