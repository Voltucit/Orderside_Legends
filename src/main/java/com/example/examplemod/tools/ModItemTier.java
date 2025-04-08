package com.example.examplemod.tools;

import com.example.examplemod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fluids.capability.ItemFluidContainer;

import java.util.function.Supplier;


public enum ModItemTier implements IItemTier {



    CALLDICK(7,9999,30.0F,5.0F,33,
            ()->{return Ingredient.of(RegistryHandler.CALLDICK_SWORD.get());}),
    JUEMING(10,1,999999.0F,999998.0F,0,
                    ()->{return Ingredient.of(RegistryHandler.JUEMING.get());}),
    XIEWAN(3,500,10.0F,1.0F,15,
            ()->{return Ingredient.of(RegistryHandler.XIEWAN.get());}),
    FAKEDICK(7, 1200,30F,5.0F , 10,
            ()->{return Ingredient.of(RegistryHandler.FAKEDICK.get());});





    private final int harvestLevil;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;
    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.attackDamage=attackDamage;
        this.harvestLevil=harvestLevel;
        this.efficiency=efficiency;
        this.maxUses=maxUses;
        this.enchantability=enchantability;

        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevil;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
