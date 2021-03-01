package ru.starshineproject.gtcspaceexploration.item;

import net.minecraft.item.ItemFood;
import ru.starshineproject.gtcspaceexploration.GTCSpaceExploration;

public class FoodBase extends ItemFood {
    public FoodBase(String id, int amount, float saturation, boolean isWolfFood) {

        super(amount, saturation, isWolfFood);

        this.setRegistryName(GTCSpaceExploration.MODID, id);
        this.setTranslationKey(GTCSpaceExploration.MODID + "." + id);
        this.setCreativeTab(GTCSpaceExploration.tabGBMain);


        GTCSpaceExploration.ITEMS.add(this);
    }
}
