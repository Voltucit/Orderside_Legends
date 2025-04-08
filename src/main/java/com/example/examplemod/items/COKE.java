package com.example.examplemod.items;

import com.example.examplemod.sound.Soundint;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;

import java.util.Random;


public class COKE extends Item {
    public COKE(){super(new Properties().tab(ItemGroup.TAB_MATERIALS));}

    @Override
    public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {

          p_77659_1_.playSound(null, p_77659_2_.getX(), p_77659_2_.getY(), p_77659_2_.getZ(), Soundint.COKE1, SoundCategory.NEUTRAL, 1.0F, 1.0F);



        return super.use(p_77659_1_, p_77659_2_, p_77659_3_);

    }

}

