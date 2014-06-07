package mods.roborave.modapi;

import java.io.File;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.eventbus.EventBus;

import mods.roborave.modapi.lib.Strings;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.MetadataCollection;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.versioning.ArtifactVersion;
import cpw.mods.fml.common.versioning.VersionRange;

@Mod(modid = ModAPI.MODID, version = ModAPI.VERSION,name="Mod-API-Nly("+Strings.getHash+")")
public class ModAPI extends DummyModContainer
{
    public static final String MODID = "Mod-API-Nightly";
    public static final String VERSION = Strings.buildType+"-0.0.1-"+ Strings.getHash + Strings.getBuild + Strings.getTimeStamp;
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
   
    
    
	@Override
	public String getModId() 
	{
		return null;
	}
	
	@Override
	public String getName() 
	{
		return null;
	}
	
	@Override
	public String getVersion() 
	{
		return VERSION;
	}
}
