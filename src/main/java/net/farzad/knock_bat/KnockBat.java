package net.farzad.knock_bat;

import net.fabricmc.api.ModInitializer;

import net.farzad.knock_bat.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KnockBat implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "knock_bat";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}