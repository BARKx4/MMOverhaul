package com.barkx4.mmoverhaul.components;

import com.barkx4.mmoverhaul.interfaces.SkillComponent;

import net.minecraft.nbt.CompoundTag;

public class BaseSkillComponent implements SkillComponent
{
	private CompoundTag value = new CompoundTag();
	
	@Override
	public void set(CompoundTag skills) 
	{
		value = skills;
	}

	@Override
	public CompoundTag get() 
	{
		return value;
	}

	@Override public void fromTag(CompoundTag tag) { this.value = tag.getCompound("skills"); }
    @Override public CompoundTag toTag(CompoundTag tag) { tag.put("skills", this.value); return tag; }
}