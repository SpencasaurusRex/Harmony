package com.rex.scarletvortex.configuration;

import com.rex.scarletvortex.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;

public class GuiConfiguration extends GuiConfig
{
    public GuiConfiguration(GuiScreen parentScreen)
    {
        super(parentScreen,
                getConfigElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()).toString());
    }

    private static List<IConfigElement> getConfigElements()
    {
        List<IConfigElement> categoryElements = new ArrayList<IConfigElement>();

//        for (ConfigurationCategory category : ConfigurationCategory.values())
//        {
//            ConfigurationHandler.configuration.setCategoryComment(category.name, category.comment);
//            categoryElements.add(new ConfigElement(ConfigurationHandler.configuration.getCategory(category.name)));
//        }

        return categoryElements;
    }
}
