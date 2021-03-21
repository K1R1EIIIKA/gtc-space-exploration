package ru.starshineproject.gtcspaceexploration;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.starshineproject.gtcspaceexploration.api.BlocksGB;
import ru.starshineproject.gtcspaceexploration.block.BlockAlienColdFusionGenerator;

import java.util.Objects;

public class BlocksRegistry {

    public static void initBlock(){

        BlocksGB.alien_cold_fusion_generator = new BlockAlienColdFusionGenerator();

        GTCSpaceExploration.BLOCKS.forEach(BlocksRegistry::setRegister);
    }

    private static void setRegister(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ResourceLocation reg = Objects.requireNonNull(block.getRegistryName());
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(reg));
    }

    @SideOnly(Side.CLIENT)
    public static void setRender() {
        GTCSpaceExploration.BLOCKS.forEach((block)->{
            ResourceLocation reg = Objects.requireNonNull(block.getRegistryName());
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(reg, "inventory"));
        });
    }
}
