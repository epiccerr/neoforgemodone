package net.epic.neoforgeone.item;

import net.epic.neoforgeone.NeoforgeOne;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NeoforgeOne.MOD_ID);

    public static final DeferredItem<Item> FLOUR = ITEMS.register("flour" , () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_FLOUR = ITEMS.register("raw_flour" , () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
