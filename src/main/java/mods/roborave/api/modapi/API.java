package mods.roborave.api.modapi;

import mods.roborave.api.modapi.block.BlockAPI;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
@Mod(modid = API.MODID,name=API.NAME,version=API.VERSION)
public class API extends DummyModContainer {

	public static final String MODID="API";
	public static final String NAME="Mod-API:Client-API";
	public static final String VERSION="0.1.0";
	
	private Block BlockTest;
	 @EventHandler
	 public void init(FMLInitializationEvent event)
	 {
	    	BlockAPI.createBlock(BlockTest, Material.cloth, BlockTest);
	    	BlockAPI.addPeremeters("Test", "TEst:TEst", BlockT.class);
	 }
	@Override
	public String getModId() 
	{
		return MODID;
	}

	@Override
	public String getName() 
	{
		return NAME;
	}

	@Override
	public String getVersion() 
	{
		return VERSION;
	}

}
