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
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, 0, false, false));
        }
        if (!player.level().isClientSide && isHoldingBall(player)) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0, false, false));
        }
        if (!player.level().isClientSide && isWearingCav(player)) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.HEAL, 100, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 0, false, false));
        }
        if (!player.level().isClientSide && isWearingBand(player)) {
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 100, 0, false, false));

            player.addEffect(new MobEffectInstance(MobEffects.GLOWING, 100, 0, false, false));
        }
        if (!player.level().isClientSide && isWearingShorts(player)) {
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.HEAL, 100, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 0, false, false));
        }
    }

    private static boolean isWearingLebronArmor(Player player) {
        for (ItemStack armorPiece : player.getInventory().armor) {
            if (armorPiece.getItem() instanceof ArmorItem armor) {
                // Get the registry name of the armor
                String itemName = armorPiece.getItem().builtInRegistryHolder().key().location().getPath();

                // Check if it's the Lebron Jersey
                if (itemName.equals("lebron_jersey") || itemName.equals("lebron_shoes")) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isWearingCav(Player player) {
        for (ItemStack armorPiece : player.getInventory().armor) {
            if (armorPiece.getItem() instanceof ArmorItem armor) {
                // Get the registry name of the armor
                String itemName = armorPiece.getItem().builtInRegistryHolder().key().location().getPath();

                // Check if it's the Lebron Jersey
                if (itemName.equals("cavs")) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isWearingBand(Player player) {
        for (ItemStack armorPiece : player.getInventory().armor) {
            if (armorPiece.getItem() instanceof ArmorItem armor) {
                // Get the registry name of the armor
                String itemName = armorPiece.getItem().builtInRegistryHolder().key().location().getPath();

                // Check if it's the Lebron Jersey
                if (itemName.equals("headband")) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isWearingShorts(Player player) {
        for (ItemStack armorPiece : player.getInventory().armor) {
            if (armorPiece.getItem() instanceof ArmorItem armor) {
                // Get the registry name of the armor
                String itemName = armorPiece.getItem().builtInRegistryHolder().key().location().getPath();

                // Check if it's the Lebron Jersey
                if (itemName.equals("lebron_shorts")) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isHoldingBall(Player player) {
        ItemStack heldItem = player.getMainHandItem();
        return heldItem.getItem().builtInRegistryHolder().key().location().getPath().equals("basketball");
    }
}
