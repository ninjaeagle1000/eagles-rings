/*package com.ninjaeagle1000.eaglesRings.registry;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.util.registry.Registry;

public class EaglesRingsEntityAttributes {

    public static final EntityAttribute PLAYER_JUMP_HEIGHT = register("player.jump_height", new ClampedEntityAttribute("attribute.name.player.jump_height", 1.0D, 0.0D, 1024.0D));

    public EaglesRingsEntityAttributes() {
    }

    private static EntityAttribute register(String id, EntityAttribute attribute) {
        return (EntityAttribute)Registry.register(Registry.ATTRIBUTE, id, attribute);
    }
}
*/