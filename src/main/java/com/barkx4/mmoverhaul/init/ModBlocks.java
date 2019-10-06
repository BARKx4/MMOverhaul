package com.barkx4.mmoverhaul.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import com.barkx4.mmoverhaul.*;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Main.MOD_ID)
public class ModBlocks 
{
	public static final Block dull_copper_ore = null;
	public static final Block copper_ore = null;
	public static final Block bronze_ore = null;
	public static final Block agapite_ore = null;
	public static final Block verite_ore = null;
	public static final Block umbracite_ore = null;
	public static final Block valorite_ore = null;
	
	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) 
	{
        event.getRegistry().registerAll(
            new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(Main.MOD_ID, "dull_copper_ore"),
            new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(Main.MOD_ID, "copper_ore"),
            new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(Main.MOD_ID, "bronze_ore"),
            new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(Main.MOD_ID, "agapite_ore"),
            new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(Main.MOD_ID, "verite_ore"),
            new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(Main.MOD_ID, "umbracite_ore"),
            new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(Main.MOD_ID, "valorite_ore")
        );
	}
}
