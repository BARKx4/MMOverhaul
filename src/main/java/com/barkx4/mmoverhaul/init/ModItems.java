package com.barkx4.mmoverhaul.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems 
{
	// an instance of our new item
    public static final Item GOLD_COINS = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(64));
    public static final Item DULL_COPPER_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(64));
    public static final Item COPPER_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(64));
    public static final Item BRONZE_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(64));
    public static final Item AGAPITE_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(64));
    public static final Item VERITE_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(64));
    public static final Item UMBRACITE_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(64));
    public static final Item VALORITE_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(64));
    
    public static void init()
    {
	    Registry.register(Registry.ITEM, new Identifier("mmoverhaul", "gold_coins"), GOLD_COINS);
	    Registry.register(Registry.ITEM, new Identifier("mmoverhaul", "dull_copper_ingot"), DULL_COPPER_INGOT);
	    Registry.register(Registry.ITEM, new Identifier("mmoverhaul", "copper_ingot"), COPPER_INGOT);
	    Registry.register(Registry.ITEM, new Identifier("mmoverhaul", "bronze_ingot"), BRONZE_INGOT);
	    Registry.register(Registry.ITEM, new Identifier("mmoverhaul", "agapite_ingot"), AGAPITE_INGOT);
	    Registry.register(Registry.ITEM, new Identifier("mmoverhaul", "verite_ingot"), VERITE_INGOT);
	    Registry.register(Registry.ITEM, new Identifier("mmoverhaul", "umbracite_ingot"), UMBRACITE_INGOT);
	    Registry.register(Registry.ITEM, new Identifier("mmoverhaul", "valorite_ingot"), VALORITE_INGOT);
    }
}
