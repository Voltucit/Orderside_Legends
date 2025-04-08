package com.example.examplemod.armor;

import com.example.examplemod.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;



public enum Armor implements IArmorMaterial {
    CALLDICK("calldick",200,new int[]{100,100,100,100},50, SoundEvents.ARMOR_STAND_HIT,18.0F,
            ()->{return Ingredient.of(RegistryHandler.CALL_DICK.get());},1)



    ;
    private static final int[]MAX_DAMAGE_ARRAY=new int[]{1200,1800,1400,1200};
    private final String name;
    private final int maxDAMAGEFactor;
    private final int[]arrmorDAMAGEAmoutArray;
    private final int fumonengli;
    private final SoundEvent shengying;
    private final float toughness;
    private final float kangxingjitui;
    private final Supplier<Ingredient>repairMaterial;
        Armor(String name, int maxDAMAGEFactor, int[]arrmorDAMAGEAmoutArray, int fumonengli, SoundEvent shengying, float toughness, Supplier<Ingredient>repaierMaterial, float kangxingjitui) {
            this.name=name;
            this.maxDAMAGEFactor=maxDAMAGEFactor;
            this.arrmorDAMAGEAmoutArray=arrmorDAMAGEAmoutArray;
            this.fumonengli=fumonengli;
            this.shengying=shengying;
            this.toughness=toughness;
            this.kangxingjitui=kangxingjitui;
            this.repairMaterial=repaierMaterial;
        }


    @Override
    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return MAX_DAMAGE_ARRAY[p_200896_1_.getIndex()]*this.maxDAMAGEFactor;

    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.arrmorDAMAGEAmoutArray[p_200902_1_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.fumonengli;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.shengying;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairMaterial;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.kangxingjitui;
    }
}
