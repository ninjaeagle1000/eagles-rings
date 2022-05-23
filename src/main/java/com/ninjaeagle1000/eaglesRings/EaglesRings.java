package com.ninjaeagle1000.eaglesRings;

import com.ninjaeagle1000.eaglesRings.registry.EaglesRingsItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EaglesRings implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Eagle's Rings");

	public static final String MOD_ID = "eaglesrings";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Sauron has forged the rings!");

		EaglesRingsItems.registerItems();
	}
}
