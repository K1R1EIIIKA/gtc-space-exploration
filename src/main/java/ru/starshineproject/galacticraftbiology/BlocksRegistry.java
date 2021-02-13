package ru.starshineproject.galacticraftbiology;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import ru.starshineproject.galacticraftbiology.api.BlocksGB;
import ru.starshineproject.galacticraftbiology.api.ItemsGB;
import ru.starshineproject.galacticraftbiology.block.BlockMoonHive;
import ru.starshineproject.galacticraftbiology.item.MoonBeeComb;
import ru.starshineproject.galacticraftbiology.item.MoonHoneyDrop;
import ru.starshineproject.galacticraftbiology.item.PlateSolar;

public class BlocksRegistry {

    public static Block MOON_HIVE = new BlockMoonHive("moon_hive");

    public static void register() {
        setRegister(MOON_HIVE);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(MOON_HIVE);
    }

    private static void setRegister(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

    public static void initBlocks(IForgeRegistry e) {
        e.register(BlocksGB.moon_hive = new BlockMoonHive());

    }
}
