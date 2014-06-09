package mods.roborave.api.modapi.block;

import mods.common.util.MCLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockUtil extends Block 
{
	public static Block isBlockCreated;

	public static BlockUtil i;

	private static Material Material1;
	
	public BlockUtil(Material blockMaterial1) 
	{
		super(blockMaterial1);
	}

	public static Block isBlockCreated() {
	if(isBlockCreated == null)
	{
		MCLog.info("BlockClass was created", new Object[0]);
	}
		return isBlockCreated;
	}
	/**
	 * 
	 * @param NAME
	 * @param TextureName
	 * @param material 
	 * @param CreativeTab 
	 * @return
	 */
	public BlockUtil AddMethods(String NAME, String TextureName,  CreativeTabs CreativeTab)
	{
		setBlockName(NAME);
		setBlockTextureName(TextureName);
		setCreativeTab(CreativeTab);
		GameRegistry.registerBlock(this, NAME);
		return this;
	}
}
