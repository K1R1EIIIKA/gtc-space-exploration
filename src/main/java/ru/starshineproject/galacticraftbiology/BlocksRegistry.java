package ru.starshineproject.galacticraftbiology;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.starshineproject.galacticraftbiology.block.BlockMoonHive;

public class BlocksRegistry {

    public static Block MOON_HIVE = new BlockMoonHive("moon_hive");

    public static void register()
    {
        setRegister(MOON_HIVE);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender()
    {
        setRender(MOON_HIVE);
    }

    private static void setRegister(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block)
    {

    }

}
