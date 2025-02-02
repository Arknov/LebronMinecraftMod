package net.appls.lebronmod.item;

import net.appls.lebronmod.LebronMOD;
import net.appls.lebronmod.sound.ModSounds;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LebronMOD.MOD_ID);
    public static final RegistryObject<PotionItem> ATH_Potion = ITEMS.register("ath_potion", () -> new PotionItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LEBRON = ITEMS.register("lebron", () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> BALL = ITEMS.register("basketball", () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> SUNSHINE = ITEMS.register("sunshine", () -> new Item((new Item.Properties().jukeboxPlayable(ModSounds.SUNSHINE_KEY).stacksTo(1))));
    public static final RegistryObject<Item> LEBRON_BAND = ITEMS.register("headband", () -> new ArmorItem(ModArmorMaterials.LEBRON_MOD_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));

    public static final RegistryObject<Item> BRONNY = ITEMS.register("bronny", () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> CAVS = ITEMS.register("cavs", () -> new ArmorItem(ModArmorMaterials.LEBRON2_MOD_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));

    public static final RegistryObject<Item> LEBRON_SHOES = ITEMS.register("lebron_shoes", () -> new ArmorItem(ModArmorMaterials.LEBRON_MOD_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));
    public static final RegistryObject<Item> LEBRON_SHORTS = ITEMS.register("lebron_shorts", () -> new ArmorItem(ModArmorMaterials.LEBRON_MOD_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));

    public static final RegistryObject<Item> LEBRON_JERSEY = ITEMS.register("lebron_jersey", () -> new ArmorItem(ModArmorMaterials.LEBRON_MOD_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
