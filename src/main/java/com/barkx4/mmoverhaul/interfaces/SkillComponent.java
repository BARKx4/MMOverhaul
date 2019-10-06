package com.barkx4.mmoverhaul.interfaces;

import nerdhub.cardinal.components.api.component.Component;
import net.minecraft.nbt.CompoundTag;

public interface SkillComponent extends Component
{
	void set(CompoundTag skills);
	CompoundTag get();
}
