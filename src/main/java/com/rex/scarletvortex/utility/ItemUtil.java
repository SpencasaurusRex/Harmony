package com.rex.scarletvortex.utility;

import com.rex.scarletvortex.item.ElectronicCircuit;
import com.rex.scarletvortex.item.ItemSV;
import com.rex.scarletvortex.reference.Reference;
import net.minecraft.item.Item;
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
    }
}
