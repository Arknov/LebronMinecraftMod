package net.appls.lebronmod.item;

import net.appls.lebronmod.LebronMOD;
import net.appls.lebronmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LebronMOD.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BALL_ITEMS_TAB = CREATIVE_MODE_TABS.register("ball_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LEBRON.get()))
                    .title(Component.translatable("creativetab.lebronmod.bron_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LEBRON.get());
                        output.accept(ModItems.BRONNY.get());
                        output.accept(ModItems.LEBRON_JERSEY.get());

                    }).build());
    public static final RegistryObject<CreativeModeTab> BALL_BLOCKS_TAB = CREATIVE_MODE_TABS.register("ball_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LeBlock.get()))
                    .withTabsAfter(BALL_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.lebronmod.bron_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.LeBlock.get());

                    }).build());
    public static final RegistryObject<CreativeModeTab> BALL_CLOTHING_TAB = CREATIVE_MODE_TABS.register("ball_clothing_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LEBRON_JERSEY.get()))
                    .withTabsAfter(BALL_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.lebronmod.bron_clothing"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LEBRON_JERSEY.get());

                    }).build());





    public static  void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}