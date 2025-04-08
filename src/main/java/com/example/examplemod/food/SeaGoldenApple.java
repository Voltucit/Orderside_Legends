package com.example.examplemod.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SeaGoldenApple extends Item {
    private static final Food food=(new Food.Builder())
            .nutrition(6)
            .saturationMod(1)
            .effect(new EffectInstance(Effects.ABSORPTION,2400,0),1)
            .effect(new EffectInstance(Effects.REGENERATION,100,2),1)
            .effect(new EffectInstance(Effects.NIGHT_VISION,6000,0),1)
            .effect(new EffectInstance(Effects.WATER_BREATHING,12000,0),1)
            .effect(new EffectInstance(Effects.DAMAGE_RESISTANCE,2400,0),1)
            .build();
    public SeaGoldenApple(){super(new Properties().food(food).tab(ItemGroup.TAB_FOOD));}
}
