package ru.starshineproject.galacticraftbiology.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.starshineproject.galacticraftbiology.GalacticraftBiology;

public class BlockBase extends Block {

    public BlockBase(String id, Material material, float light, float hardness, String instrument, int level){
        super(material);

        this.setRegistryName(GalacticraftBiology.MODID, id);
        this.setTranslationKey(GalacticraftBiology.MODID + "." + id);
        this.setCreativeTab(GalacticraftBiology.tabGBMain);
        this.setLightLevel(light);
        this.setHardness(hardness);
        this.setHarvestLevel(instrument, level);

        GalacticraftBiology.BLOCKS.add(this);
    }
}
