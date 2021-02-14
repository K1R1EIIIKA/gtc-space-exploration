package ru.starshineproject.galacticraftbiology.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import ru.starshineproject.galacticraftbiology.GalacticraftBiology;

public class BlockMoonHive extends BlockBase {

    public BlockMoonHive() {
        super("moon_hive", Material.IRON);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
