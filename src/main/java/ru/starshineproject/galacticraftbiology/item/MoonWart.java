package ru.starshineproject.galacticraftbiology.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MoonWart extends FoodBase {

    public MoonWart() {

        super("moon_wart", 2, 0.2F, false);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 100, 0));
    }
}