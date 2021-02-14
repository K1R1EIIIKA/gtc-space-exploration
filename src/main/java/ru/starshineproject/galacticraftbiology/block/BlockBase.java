package ru.starshineproject.galacticraftbiology.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.starshineproject.galacticraftbiology.GalacticraftBiology;

public class BlockBase extends Block {

    public BlockBase(String id, Material material) {
        super(material);

        this.setRegistryName(GalacticraftBiology.MODID, id);
        this.setTranslationKey(GalacticraftBiology.MODID + "." + id);
        this.setCreativeTab(GalacticraftBiology.tabGBMain);

        GalacticraftBiology.BLOCKS.add(this);
    }
}
