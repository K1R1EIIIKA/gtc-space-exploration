package ru.starshineproject.gtcspaceexploration.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.starshineproject.gtcspaceexploration.GTCSpaceExploration;

public class BlockBase extends Block {

    public BlockBase(String id, Material material, float light, float hardness){
        super(material);

        this.setRegistryName(GTCSpaceExploration.MODID, id);
        this.setTranslationKey(GTCSpaceExploration.MODID + "." + id);
        this.setCreativeTab(GTCSpaceExploration.tabGBMain);
        this.setLightLevel(light);
        this.setHardness(hardness);
//        this.setHarvestLevel(instrument, level);

        GTCSpaceExploration.BLOCKS.add(this);
    }
}
