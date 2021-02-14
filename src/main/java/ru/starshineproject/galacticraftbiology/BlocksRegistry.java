package ru.starshineproject.galacticraftbiology;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

public class BlocksRegistry {

    public static void initBlock(){
        BlocksGB.moon_hive = new BlockMoonHive();

        GalacticraftBiology.BLOCKS.forEach(BlocksRegistry::setRegister);
    }

    private static void setRegister(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ResourceLocation reg = Objects.requireNonNull(block.getRegistryName());
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(reg));
    }

    @SideOnly(Side.CLIENT)
    public static void setRender() {
        GalacticraftBiology.BLOCKS.forEach((block)->{
            ResourceLocation reg = Objects.requireNonNull(block.getRegistryName());
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(reg, "inventory"));
        });
    }
}
