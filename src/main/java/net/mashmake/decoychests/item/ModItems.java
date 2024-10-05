package net.mashmake.decoychests.item;

import net.mashmake.decoychests.DecoyChests;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DecoyChests.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        DecoyChests.LOGGER.info("Registering items for " + DecoyChests.MOD_ID);
    }
}
