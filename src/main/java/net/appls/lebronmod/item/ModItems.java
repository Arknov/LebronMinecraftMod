package net.appls.lebronmod.item;

import net.appls.lebronmod.LebronMOD;
import net.minecraft.world.item.ArmorItem;
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
    public static final RegistryObject<Item> LEBRON_JERSEY = ITEMS.register("lebron_jersey", () -> new ArmorItem(ModArmorMaterials.LEBRON_MOD_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
