package net.aquapaka.furnituremod;

import net.aquapaka.furnituremod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AquapakaFurnitureMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "AquapakaFurniture";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

//	public static final Item CHAIR = new Item(new FabricItemSettings());

	public static final Block WOODEN_CHAIR = new Block(FabricBlockSettings.create().strength(4.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
//		Registry.register(Registries.ITEM, new Identifier(MOD_ID.toLowerCase(), "chair"), CHAIR);
//		ModItems.registerModItems();
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID.toLowerCase(), "wooden_chair"), WOODEN_CHAIR);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID.toLowerCase(), "wooden_chair"), new BlockItem(WOODEN_CHAIR, new FabricItemSettings()));

	}

}