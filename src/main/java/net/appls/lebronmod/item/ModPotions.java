package net.appls.lebronmod.item;


import net.appls.lebronmod.LebronMOD;
import net.appls.lebronmod.item.AthleticismEffect;
import net.appls.lebronmod.item.ModEffects;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, LebronMOD.MOD_ID);

    public static final RegistryObject<Potion> ATHLETIC = POTIONS.register("ath",
            () -> new Potion(new MobEffectInstance(ModEffects.ATHLETICS.getHolder().get(), 200, 0)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}