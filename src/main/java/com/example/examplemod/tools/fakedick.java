package com.example.examplemod.tools;


import com.electronwill.nightconfig.core.io.ParsingMode;
import com.example.examplemod.sound.Soundint;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import org.apache.logging.log4j.ThreadContext;


public class fakedick extends SwordItem {

    public fakedick() {

        super(ModItemTier.FAKEDICK, 0, -2.0F, new Properties().tab(ItemGroup.TAB_COMBAT));
    }

    @Override
    public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        p_77659_2_.addEffect(new EffectInstance(Effects.DAMAGE_BOOST,1200,0));
        p_77659_1_.playSound(null, p_77659_2_.getX(), p_77659_2_.getY(), p_77659_2_.getZ(), Soundint.ZHANDOU, SoundCategory.NEUTRAL, 1.0F, 1.0F);
        return super.use(p_77659_1_, p_77659_2_, p_77659_3_);
    }


    @Override
    public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
        if(entity instanceof MonsterEntity)
        {
            ((MonsterEntity) entity).addEffect(new EffectInstance(Effects.POISON,200,0));
        }
        if (entity instanceof PlayerEntity){
            player.addEffect(new EffectInstance(Effects.BLINDNESS,600,0));
        }
        player.heal(2);
        return super.onLeftClickEntity(stack, player, entity);
    }

}
