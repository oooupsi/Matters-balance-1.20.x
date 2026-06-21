package net.oooupsi.mattersbalance.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.oooupsi.mattersbalance.MattersBalance;
import net.oooupsi.mattersbalance.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MattersBalance.MOD_ID);

    public static final Supplier<CreativeModeTab> MATTERS_BALANCE_TAB = CREATIVE_MODE_TAB.register("matters_balance_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANTI.get()))
                    .title(Component.translatable("creativetab.matters_balance.anti"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ANTI);
                        output.accept(ModBlocks.ANTI_ORE);
                        output.accept(ModBlocks.DEEP_ANTI_ORE);
                    }).build());


    public static void register(IEventBus enventBus) {
        CREATIVE_MODE_TAB.register(enventBus);
    }
}