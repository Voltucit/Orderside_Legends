package com.example.examplemod.tools;
import com.example.examplemod.sound.Soundint;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.Random;
import java.util.UUID;


public class feileishen extends Item {
    private static BlockPos storedCoords = null;


    public feileishen(){super(new Properties().tab(ItemGroup.TAB_TOOLS));}


    @Override
    public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
        if (entity instanceof PlayerEntity){
            storedCoords = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
            player.sendMessage(new TranslationTextComponent("use.feileishen2"), player.getUUID());
        }
        if (entity instanceof MonsterEntity){
            storedCoords = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
            player.sendMessage(new TranslationTextComponent("use.feileishen2"), player.getUUID());
        }
        if (entity instanceof AnimalEntity){
            storedCoords = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
            player.sendMessage(new TranslationTextComponent("use.feileishen2"), player.getUUID());
        }
        return super.onLeftClickEntity(stack, player, entity);
    }

    @Override
    public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        if (p_77659_2_.isCrouching()){
            storedCoords = new BlockPos(p_77659_2_.getX(), p_77659_2_.getY(), p_77659_2_.getZ());
            p_77659_2_.sendMessage(new TranslationTextComponent("use.feileishen1"), p_77659_2_.getUUID());
            return new ActionResult<>(ActionResultType.SUCCESS, p_77659_2_.getItemInHand(p_77659_3_));
        }

        else if (storedCoords != null){
            p_77659_2_.teleportTo(storedCoords.getX(), storedCoords.getY(), storedCoords.getZ());
            p_77659_2_.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED,200,1));
            Random a=new Random();
            int b=a.nextInt(4)+1;
            if (b==1){
                p_77659_1_.playSound(null,p_77659_2_.getX(),p_77659_2_.getY(),p_77659_2_.getZ(), Soundint.F1, SoundCategory.NEUTRAL,1.0F,1.0F);
            }
            if (b==2){
                p_77659_1_.playSound(null,p_77659_2_.getX(),p_77659_2_.getY(),p_77659_2_.getZ(), Soundint.F2, SoundCategory.NEUTRAL,1.0F,1.0F);
            }
            if (b==3){
                p_77659_1_.playSound(null,p_77659_2_.getX(),p_77659_2_.getY(),p_77659_2_.getZ(), Soundint.F3, SoundCategory.NEUTRAL,1.0F,1.0F);
            }
            if (b==4){
                p_77659_1_.playSound(null,p_77659_2_.getX(),p_77659_2_.getY(),p_77659_2_.getZ(), Soundint.F4, SoundCategory.NEUTRAL,1.0F,1.0F);
            }else {
                    p_77659_2_.sendMessage(new TranslationTextComponent("use.feileishen3"), p_77659_2_.getUUID());
            }

            return ActionResult.success(p_77659_2_.getItemInHand(p_77659_3_));
    }

        return super.use(p_77659_1_, p_77659_2_, p_77659_3_);
    }

}

