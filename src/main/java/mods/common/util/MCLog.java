package mods.common.util;

import mods.roborave.common.modapi.ModAPI;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum MCLog
{
    INSTANCE;
    
    private Logger logger;
    
    public Logger getLogger()
    {
        if (logger == null)
            init();
        
        return logger;
    }
    
    private void init()
    {
        if (logger != null)
            return;
        
        logger = LogManager.getLogger(ModAPI.MODID);
    }
    
    public static void info(String format, Object... args)
    {
        INSTANCE.log(Level.INFO, format, args);
    }
    
    public static void log(Level level, Throwable exception, String format, Object... args)
    {
        INSTANCE.getLogger().log(level, String.format(format, args), exception);
    }
    
    public static void severe(String format, Object... args)
    {
        INSTANCE.log(Level.ERROR, format, args);
    }
    
    public static void warning(String format, Object... args)
    {
        INSTANCE.log(Level.WARN, format, args);
    }
    
    private void log(Level level, String format, Object... data)
    {
        getLogger().log(level, String.format(format, data));
    }
}