package com.ninjaeagle1000.eaglesRings.registry;

import com.ninjaeagle1000.eaglesRings.EaglesRings;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class EaglesRingsGroup {
    public static final ItemGroup EAGLES_RINGS_GROUP = FabricItemGroupBuilder.create(
                    new Identifier(EaglesRings.MOD_ID, "general"))
            .icon(() -> new ItemStack(EaglesRingsItems.GOLD_RING))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(EaglesRingsItems.IRON_RING));
                stacks.add(new ItemStack(EaglesRingsItems.GOLD_RING));
            })
            .build();
}
