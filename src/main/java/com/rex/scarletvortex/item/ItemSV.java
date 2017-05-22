package com.rex.scarletvortex.item;

import com.rex.scarletvortex.ScarletVortex;
import com.rex.scarletvortex.reference.Reference;
import com.rex.scarletvortex.utility.ItemUtil;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class ItemSV extends Item
{
    private String name;

    public ItemSV(String name)
    {
        this.name = name;
        ItemUtil.registerItem(this, name);
        ModelResourceLocation mrl = new ModelResourceLocation(getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(this, 0, mrl);
    }

    public String getName()
    {
        return name;
    }
}
