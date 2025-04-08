package com.example.examplemod.sound;

import com.example.examplemod.examplemod;
import com.example.examplemod.items.KOBE;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class Soundint {



    public static SoundEvent COKE1;
    public static SoundEvent KOBE1;
    public static SoundEvent KOBE2;
    public static SoundEvent KOBE3;
    public static SoundEvent ZHANDOU;
    public static SoundEvent F1;
    public static SoundEvent F2;
    public static SoundEvent F3;
    public static SoundEvent F4;
    public static SoundEvent LOWLIFE;
    public static SoundEvent ONMYOWN;

    public static void registerSounds(){
        COKE1=registerSound("sounds.item.coke1");
        KOBE1=registerSound("sounds.item.kobe1");
        KOBE2=registerSound("sounds.item.kobe2");
        KOBE3=registerSound("sounds.item.kobe3");
        ZHANDOU=registerSound("sounds.item.zhandou");
        F1=registerSound("sounds.item.f1");
        F2=registerSound("sounds.item.f2");
        F3=registerSound("sounds.item.f3");
        F4=registerSound("sounds.item.f4");
        LOWLIFE=registerSound("sounds.item.lowlife");
        ONMYOWN=registerSound("sounds.item.omo");


    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(examplemod.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
