package ru.starshineproject.gtcspaceexploration.item;

import net.minecraft.item.Item;
import ru.starshineproject.gtcspaceexploration.GTCSpaceExploration;

public class ItemBase extends Item {

    public ItemBase(String id) {
        this.setRegistryName(GTCSpaceExploration.MODID, id);
        this.setTranslationKey(GTCSpaceExploration.MODID + "." + id);
        this.setCreativeTab(GTCSpaceExploration.tabGBMain);

        GTCSpaceExploration.ITEMS.add(this);
    }
}
