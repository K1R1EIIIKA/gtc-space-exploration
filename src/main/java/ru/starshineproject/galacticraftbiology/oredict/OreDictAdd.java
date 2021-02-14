package ru.starshineproject.galacticraftbiology.oredict;

import forestry.apiculture.items.EnumHoneyComb;
import forestry.apiculture.items.ItemHoneyComb;
import net.minecraftforge.oredict.OreDictionary;
import ru.starshineproject.galacticraftbiology.api.ItemsGB;

public class OreDictAdd {
    public void initOreDict(){
        OreDictionary.registerOre("beeComb", ItemsGB.moon_bee_comb);
        OreDictionary.registerOre("dropHoney", ItemsGB.moon_honey_drop);
    }
}
