package spencasaurusrex.harmony.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBase extends Block
{
  public BlockBase(String name, Material material, boolean makeItemBlock) 
  {
    super(Properties.create(material));
    setRegistryName(name);
    
    if (makeItemBlock)
    {
      Item.Properties props = new Item.Properties();
      props.maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS).setNoRepair();
      
      BlockItem item = new BlockItem(this, props);
      item.setRegistryName(name);
      GameRegistry.findRegistry(Item.class).register(item);
    }
  }

  public BlockBase(String name, Material material)
  {
    this(name, material, true);
  }
}