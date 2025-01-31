package net.appls.lebronmod.item;

import net.appls.lebronmod.item.ModArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ModArmorEffects {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        if (!player.level().isClientSide && isWearingLebronArmor(player)) {
            player.addEffect(new MobEffectInstance(MobEffects.HEAL, 100, 0, false, false));
        }
    }

    private static boolean isWearingLebronArmor(Player player) {
        for (ItemStack armorPiece : player.getInventory().armor) {
            if (armorPiece.getItem() instanceof ArmorItem armor) {
                // Get the registry name of the armor
                String itemName = armorPiece.getItem().builtInRegistryHolder().key().location().getPath();

                // Check if it's the Lebron Jersey
                if (itemName.equals("lebron_jersey")) {
                    return true;
                }
            }
        }
        return false;
    }
}
