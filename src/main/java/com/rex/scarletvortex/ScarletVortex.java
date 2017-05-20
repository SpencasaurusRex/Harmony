package com.rex.scarletvortex;

import com.rex.scarletvortex.configuration.ConfigurationHandler;
import com.rex.scarletvortex.proxy.IProxy;
import com.rex.scarletvortex.utility.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.rex.scarletvortex.reference.Reference.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = VERSION, guiFactory = GUI_FACTORY_CLASS, canBeDeactivated = true)
public class ScarletVortex
{
    @Mod.Instance(value = MOD_ID)
    public static ScarletVortex instance;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        new ConfigurationHandler(event.getSuggestedConfigurationFile());
        LogHelper.info("PreInitialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInitialization Complete");
    }
}