package ru.starshineproject.galacticraftbiology.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class MoonWartStew extends FoodBase {
    public MoonWartStew() {
        super("moon_wart_stew", 20, 1F, false);
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 200, 0));
    }
}

