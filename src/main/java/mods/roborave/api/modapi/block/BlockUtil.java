package mods.roborave.api.modapi.block;

import cpw.mods.fml.common.registry.GameRegistry;
import mods.common.util.MCLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockUtil extends Block 
{
	public static Block isBlockCreated;

	public static BlockUtil i;
	public BlockUtil(Material p_i45394_1_) 
	{
		super(p_i45394_1_);
	}

	public static Block isBlockCreated() {
	if(isBlockCreated == null)
	{
		MCLog.info("BlockClass was created", new Object[0]);
	}
		return isBlockCreated;
	}

	public BlockUtil AddMethods(String NAME, String textureName1)
	{
		setBlockName(NAME);
		setBlockTextureName(textureName1);
		GameRegistry.registerBlock(this, NAME);
		return this;
	}
}
