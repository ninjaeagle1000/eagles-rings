package com.ninjaeagle1000.eaglesRings.items;

import com.google.common.collect.Multimap;
import com.ninjaeagle1000.eaglesRings.EaglesRings;
//import com.ninjaeagle1000.eaglesRings.registry.EaglesRingsEntityAttributes;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class Ring extends TrinketItem {
    public Ring(Settings settings) {
        super(settings);
    }

    private boolean fireRes = false;
    private boolean conduitPower = false;
    private boolean wings = false;
    private boolean blastProof = false;
    private boolean highJump = false;
    private boolean speed = false;

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);

        if (fireRes) {

        }
        if (conduitPower) {

        }
        if (wings) {

        }
        if (blastProof) {

        }
        if (highJump) {
            //modifiers.put(EaglesRingsEntityAttributes.PLAYER_JUMP_HEIGHT, new EntityAttributeModifier(uuid, EaglesRings.MOD_ID + ":high_jump", 1, EntityAttributeModifier.Operation.ADDITION));
        }
        if (speed) {
            modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uuid, EaglesRings.MOD_ID + ":movement_speed", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        }

        return modifiers;
    }

}
