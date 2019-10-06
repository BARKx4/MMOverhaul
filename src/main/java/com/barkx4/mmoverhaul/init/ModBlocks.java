package com.barkx4.mmoverhaul.init;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks 
{
	public static final OreBlock DULL_COPPER_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).hardness(2).build());
    public static final OreBlock COPPER_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).hardness(2).build());
    public static final OreBlock BRONZE_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).hardness(2).build());
    public static final OreBlock AGAPITE_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).hardness(2).build());
    public static final OreBlock VERITE_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).hardness(2).build());
    public static final OreBlock UMBRACITE_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).hardness(2).build());
    public static final OreBlock VALORITE_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).hardness(2).build());
    
    public static void init()
    {
    	Registry.register(Registry.BLOCK, new Identifier("mmoverhaul", "dull_copper_ore"), DULL_COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier("mmoverhaul", "copper_ore"), COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier("mmoverhaul", "bronze_ore"), BRONZE_ORE);
        Registry.register(Registry.BLOCK, new Identifier("mmoverhaul", "agapite_ore"), AGAPITE_ORE);
        Registry.register(Registry.BLOCK, new Identifier("mmoverhaul", "verite_ore"), VERITE_ORE);
        Registry.register(Registry.BLOCK, new Identifier("mmoverhaul", "umbracite_ore"), UMBRACITE_ORE);
        Registry.register(Registry.BLOCK, new Identifier("mmoverhaul", "valorite_ore"), VALORITE_ORE);
        
        Registry.register(
    		Registry.ITEM, new Identifier("mmoverhaul", "dull_copper_ore"), 
    		new BlockItem(DULL_COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64))
    	);
        Registry.register(
    		Registry.ITEM, new Identifier("mmoverhaul", "copper_ore"), 
    		new BlockItem(COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64))
    	);
        Registry.register(
    		Registry.ITEM, new Identifier("mmoverhaul", "bronze_ore"), 
    		new BlockItem(BRONZE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64))
    	);
        Registry.register(
    		Registry.ITEM, new Identifier("mmoverhaul", "agapite_ore"), 
    		new BlockItem(AGAPITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64))
    	);
        Registry.register(
    		Registry.ITEM, new Identifier("mmoverhaul", "verite_ore"), 
    		new BlockItem(VERITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64))
    	);
        Registry.register(
    		Registry.ITEM, new Identifier("mmoverhaul", "umbracite_ore"), 
    		new BlockItem(UMBRACITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64))
    	);
        Registry.register(
    		Registry.ITEM, new Identifier("mmoverhaul", "valorite_ore"), 
    		new BlockItem(VALORITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64))
    	);
    }
}
