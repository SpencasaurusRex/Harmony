package com.rex.scarletvortex.configuration;

import com.rex.scarletvortex.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue;

    public ConfigurationHandler(File configFile)
    {
        configuration = new Configuration(configFile);
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    public void loadConfiguration()
    {
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
