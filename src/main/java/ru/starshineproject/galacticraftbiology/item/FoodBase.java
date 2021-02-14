package ru.starshineproject.galacticraftbiology.item;

import net.minecraft.item.ItemFood;
import ru.starshineproject.galacticraftbiology.GalacticraftBiology;

public class FoodBase extends ItemFood {
    public FoodBase(String id, int amount, float saturation, boolean isWolfFood) {

        super(amount, saturation, isWolfFood);

        this.setRegistryName(GalacticraftBiology.MODID, id);
        this.setTranslationKey(GalacticraftBiology.MODID + "." + id);
        this.setCreativeTab(GalacticraftBiology.tabGBMain);


        GalacticraftBiology.ITEMS.add(this);
    }
}
