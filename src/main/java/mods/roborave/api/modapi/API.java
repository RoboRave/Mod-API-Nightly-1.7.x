package mods.roborave.api.modapi;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import mods.roborave.api.modapi.block.BlockAPI;
import mods.roborave.api.modapi.block.BlockUtil;
import mods.roborave.api.modapi.item.ItemAPI;
import mods.roborave.api.modapi.item.ItemUtil;
import mods.roborave.api.modapi.test.BlockTest;
import mods.roborave.api.modapi.test.ItemTest;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
@Mod(modid = API.MODID,name=API.NAME,version=API.VERSION)
public class API extends DummyModContainer {

	public static final String MODID="API";
	public static final String NAME="Mod-API:Client-API";
	public static final String VERSION="0.1.1";
	
	private ItemUtil itemtest;
	private BlockUtil blocktest;
	
	 @EventHandler
	 public void init(FMLInitializationEvent event)
	 {
	  ItemAPI.createItem(itemtest, CreativeTabs.tabMaterials);
	  ItemAPI.addPeremeters("Block_TEST", "API:Test", "API", ItemTest.class);
	  
	  BlockAPI.createBlock(blocktest, CreativeTabs.tabBlock, Material.rock);
	  BlockAPI.addPeremeters("BlockTest", "API:Test", BlockTest.class, CreativeTabs.tabBlock);
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
