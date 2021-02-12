package ru.starshineproject.galacticraftbiology.item;

import net.minecraft.item.Item;
import ru.starshineproject.galacticraftbiology.GalacticraftBiology;

public class ItemBase extends Item {

    public ItemBase(String id) {
        this.setRegistryName(GalacticraftBiology.MODID, id);
        this.setTranslationKey(GalacticraftBiology.MODID + "." + id);
        GalacticraftBiology.ITEMS.put(id, this);
    }
}
