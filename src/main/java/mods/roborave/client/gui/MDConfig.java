 package mods.roborave.client.gui;

import mods.common.util.config.ConfigManager;
import mods.common.util.config.ConfigProperty;
import mods.common.util.config.gui.GuiConfig;
import mods.roborave.common.modapi.ModAPI;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.Configuration;

public class MDConfig extends GuiConfig
{
	public MDConfig(GuiScreen parent) throws NoSuchMethodException, SecurityException
    {
        super(parent, (new ConfigProperty(ConfigManager.config.getCategory(Configuration.CATEGORY_GENERAL))).getConfigPropertiesList(true),
                true, ModAPI.MODID, true, GuiConfig.getAbridgedConfigPath(ConfigManager.config.toString()));
    }
}