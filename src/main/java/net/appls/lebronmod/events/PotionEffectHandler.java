package net.appls.lebronmod.events;

import net.appls.lebronmod.item.ModEffects;
import net.appls.lebronmod.item.ModItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "lebronmod")
public class PotionEffectHandler {

    @SubscribeEvent
    public static void onItemConsumed(LivingEntityUseItemEvent.Finish event) {
        // Check if the entity is a player and the consumed item is the athletic potion
        if (event.getEntity() instanceof Player player) {
            ItemStack itemStack = event.getItem();

            // Check if the item consumed is the ATH_Potion
            if (itemStack.getItem() == ModItems.ATH_Potion.get()) {
                // Apply the "ath" effect to the player
                player.addEffect(new MobEffectInstance(ModEffects.ATHLETICS.getHolder().get(), 1000, 0)); // 6000 ticks = 5 minutes
            }
        }
    }
}