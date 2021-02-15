package ru.starshineproject.galacticraftbiology.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class MoonHoneyBread extends FoodBase {
    public MoonHoneyBread() {
        super("moon_honey_bread", 6, 0.6F, false);
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 3600, 2));
    }
}


