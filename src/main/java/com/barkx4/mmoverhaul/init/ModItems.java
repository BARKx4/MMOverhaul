package com.barkx4.mmoverhaul.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import com.barkx4.mmoverhaul.*;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Main.MOD_ID)
public class ModItems 
{
	// Misc Items
	public final static Item gold_coins = null;
	
	// Ingots
	public final static Item dull_copper_ingot = null;
	public final static Item copper_ingot = null;
	public final static Item bronze_ingot = null;
	public final static Item agapite_ingot = null;
	public final static Item verite_ingot = null;
	public final static Item umbracite_ingot = null;
	public final static Item valorite_ingot = null;

	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) 
	{
        //In here you pass in all item instances you want to register.
        //Make sure you always set the registry name.
        event.getRegistry().registerAll(
            new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName(Main.MOD_ID, "gold_coins"),
            new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName(Main.MOD_ID, "dull_copper_ingot"),
            new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName(Main.MOD_ID, "copper_ingot"),
            new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName(Main.MOD_ID, "bronze_ingot"),
            new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName(Main.MOD_ID, "agapite_ingot"),
            new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName(Main.MOD_ID, "verite_ingot"),
            new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName(Main.MOD_ID, "umbracite_ingot"),
            new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName(Main.MOD_ID, "valorite_ingot")
            new ItemBlock( altar_stone, new Item.Properties() ).setRegistryName( "examplemod", altar_stone.getRegistryName().toString() ) );
        );
    }
}
