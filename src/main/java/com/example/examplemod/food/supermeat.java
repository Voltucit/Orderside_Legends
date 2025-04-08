package com.example.examplemod.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class supermeat extends Item{
    private static final Food food = (new Food.Builder())
            .nutrition(8)
            .saturationMod(10)
            .effect(()->new EffectInstance(Effects.MOVEMENT_SPEED,1200,0),1)
            .effect(()->new EffectInstance(Effects.REGENERATION,300,0),1)
            .effect(()->new EffectInstance(Effects.DAMAGE_RESISTANCE,1200,0),1)
            .effect(new EffectInstance(Effects.DAMAGE_BOOST,2400,1),1)
            .build();

    public supermeat() {
        super(new Properties().food(food).tab(ItemGroup.TAB_FOOD));
    }

}
