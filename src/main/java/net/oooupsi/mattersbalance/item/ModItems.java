package net.oooupsi.mattersbalance.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.oooupsi.mattersbalance.MattersBalance;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MattersBalance.MOD_ID);

    public static final DeferredItem<Item> ANTI = ITEMS.register("antishard",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
