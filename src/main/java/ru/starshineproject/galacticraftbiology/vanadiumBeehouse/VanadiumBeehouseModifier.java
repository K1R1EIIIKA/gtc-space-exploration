package ru.starshineproject.galacticraftbiology.vanadiumBeehouse;

import forestry.api.apiculture.DefaultBeeModifier;
import forestry.api.apiculture.IBeeGenome;

import javax.annotation.Nullable;

public class VanadiumBeehouseModifier extends DefaultBeeModifier {
    @Override
    public float getProductionModifier(IBeeGenome genome, float currentModifier) {
        return 0.5f;
    }

    @Override
    public float getMutationModifier(IBeeGenome genome, IBeeGenome mate, float currentModifier) {
        return 0.2f;
    }

    @Override
    public float getLifespanModifier(IBeeGenome genome, @Nullable IBeeGenome mate, float currentModifier) {
        return 3.5f;
    }

    @Override
    public float getFloweringModifier(IBeeGenome genome, float currentModifier) {
        return 3.5f;
    }

    @Override
    public float getGeneticDecay(IBeeGenome genome, float currentModifier) {
        return 0.0f;
    }
}
