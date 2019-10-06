package com.barkx4.mmoverhaul;

import com.barkx4.mmoverhaul.components.BaseSkillComponent;
import com.barkx4.mmoverhaul.init.ModBlocks;
import com.barkx4.mmoverhaul.init.ModItems;
import com.barkx4.mmoverhaul.interfaces.SkillComponent;

import nerdhub.cardinal.components.api.ComponentRegistry;
import nerdhub.cardinal.components.api.ComponentType;
import nerdhub.cardinal.components.api.event.EntityComponentCallback;
import nerdhub.cardinal.components.api.util.EntityComponents;
import nerdhub.cardinal.components.api.util.RespawnCopyStrategy;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer 
{

	public static final ComponentType<SkillComponent> SKILLS = 
	        ComponentRegistry.INSTANCE.registerIfAbsent(new Identifier("mmoverhaul:skills"), SkillComponent.class);
	
	@Override
    public void onInitialize()
    {       
    	ModItems.init();
    	ModBlocks.init();
    	
    	// Add the component to every instance of PlayerEntity()
    	EntityComponentCallback.event(PlayerEntity.class).register((player, components) -> components.put(SKILLS, new BaseSkillComponent()));
    	// Ensure the component's data is copied when the player respawns
    	EntityComponents.setRespawnCopyStrategy(SKILLS, RespawnCopyStrategy.ALWAYS_COPY);
    }
}