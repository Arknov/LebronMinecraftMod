package net.appls.lebronmod.item;

import net.appls.lebronmod.LebronMOD;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LebronMOD.MOD_ID);
    public static final RegistryObject<Item> LEBRON = ITEMS.register("lebron", () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> BRONNY = ITEMS.register("bronny", () -> new Item((new Item.Properties())));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
