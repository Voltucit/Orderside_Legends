package com.example.examplemod.util;

import com.example.examplemod.armor.Armor;
import com.example.examplemod.examplemod;
import com.example.examplemod.food.FireGoldenApple;
import com.example.examplemod.food.SeaGoldenApple;
import com.example.examplemod.food.supermeat;


import com.example.examplemod.sound.Soundint;
import com.example.examplemod.tools.ModItemTier;
import com.example.examplemod.tools.fakedick;


import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.example.examplemod.items.ItemBase;



public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS, examplemod.MOD_ID);
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static void initRegistries() {
        Soundint.registerSounds();
    }
    //物品
    public static final RegistryObject<Item>KOBE=ITEMS.register("kobe", com.example.examplemod.items.KOBE::new);
    public static final RegistryObject<Item> CALL_DICK=ITEMS.register("calldick",ItemBase::new);
    public static final RegistryObject<Item> BALL=ITEMS.register("ball",ItemBase::new);
    public static final RegistryObject<Item>COKE=ITEMS.register("coke", com.example.examplemod.items.COKE::new);
    //工具
    public static final RegistryObject<Item>FEILEISHEN=ITEMS.register("feileishen",com.example.examplemod.tools.feileishen::new);
    public static final RegistryObject<SwordItem>CALLDICK_SWORD=ITEMS.register("calldick_sword",
            ()->new SwordItem(ModItemTier.CALLDICK,6,-2.0F,new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<AxeItem> CALLDICK_AXE=ITEMS.register("calldick_axe",
            ()->new AxeItem(ModItemTier.CALLDICK,14,-3.2F,new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> CALLDICK_PICKAXE=ITEMS.register("calldick_pickaxe",
            ()->new PickaxeItem(ModItemTier.CALLDICK,-3,-1.5F,new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> CALLDICK_HOE=ITEMS.register("calldick_hoe",
            ()->new HoeItem(ModItemTier.CALLDICK,-3,-2.0F,new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> CALLDICK_SHOVEL=ITEMS.register("calldick_shouvel",
            ()->new ShovelItem(ModItemTier.CALLDICK,-3,-2.0F,new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> JUEMING=ITEMS.register("jueming",
            ()->new SwordItem(ModItemTier.JUEMING,0,999995,new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    //武器
    public static final  RegistryObject<fakedick>FAKEDICK=ITEMS.register("fakedick",fakedick::new);
    public static final RegistryObject<SwordItem> XIEWAN=ITEMS.register("xiewan",
            ()->new SwordItem(ModItemTier.XIEWAN,3,-2.0F,new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    //食物
    public static final RegistryObject<Item>SEAGOLDENAPPLE=ITEMS.register("seagoldenapple", SeaGoldenApple::new);
    public static final RegistryObject<Item> SUPERMEAT=ITEMS.register("supermeat", supermeat::new);
    public static final RegistryObject<Item>FIREGODENAPPLE=ITEMS.register("firegoldenapple", FireGoldenApple::new);
    //装备
    public static final RegistryObject<ArmorItem>CALLDICK_HEAD=ITEMS.register("calldick_head",
            ()->new ArmorItem(Armor.CALLDICK,EquipmentSlotType.HEAD,new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem>CALLDICK_CHEST=ITEMS.register("calldick_chest",
            ()->new ArmorItem(Armor.CALLDICK,EquipmentSlotType.CHEST,new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem>CALLDICK_LEGS=ITEMS.register("calldick_legs",
            ()->new ArmorItem(Armor.CALLDICK,EquipmentSlotType.LEGS,new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem>CALLDICK_FEET=ITEMS.register("calldick_feet",
            ()->new ArmorItem(Armor.CALLDICK,EquipmentSlotType.FEET,new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    //唱片
    public static final RegistryObject<MusicDiscItem>LOWLIFE=ITEMS.register("lowlife",()->new MusicDiscItem(3900,Soundint.LOWLIFE,new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<MusicDiscItem>ONMYOWN=ITEMS.register("onmyown",()->new MusicDiscItem(3900,Soundint.ONMYOWN,new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1)));


}
