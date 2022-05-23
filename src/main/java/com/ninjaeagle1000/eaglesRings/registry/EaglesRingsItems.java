package com.ninjaeagle1000.eaglesRings.registry;

import com.ninjaeagle1000.eaglesRings.EaglesRings;
import com.ninjaeagle1000.eaglesRings.items.Ring;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class EaglesRingsItems {

    public static final Ring IRON_RING = new Ring(new Item.Settings().maxCount(1).rarity(Rarity.RARE).group(EaglesRingsGroup.EAGLES_RINGS_GROUP));
    public static final Ring GOLD_RING = new Ring(new Item.Settings().maxCount(1).rarity(Rarity.RARE).group(EaglesRingsGroup.EAGLES_RINGS_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(EaglesRings.MOD_ID, "iron_ring"), IRON_RING);
        Registry.register(Registry.ITEM, new Identifier(EaglesRings.MOD_ID, "gold_ring"), GOLD_RING);
    }
}
