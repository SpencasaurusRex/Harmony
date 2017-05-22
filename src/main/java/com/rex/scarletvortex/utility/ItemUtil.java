package com.rex.scarletvortex.utility;

import com.rex.scarletvortex.item.ElectronicCircuit;
import com.rex.scarletvortex.item.ItemSV;
import com.rex.scarletvortex.reference.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemUtil
{
    public static ItemSV electronicCircuit;

    static
    {
        electronicCircuit = new ElectronicCircuit();
    }

    public static void init()
    {

    }

    public static void registerItem(Item item, String name)
    {
        item.setUnlocalizedName(Reference.MOD_ID + "." + name);
        item.setRegistryName(Reference.MOD_ID, name);
        GameRegistry.register(item);
        ModelResourceLocation mrl = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
    }
}
