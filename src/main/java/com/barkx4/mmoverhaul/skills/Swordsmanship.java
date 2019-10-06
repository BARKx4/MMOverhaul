package com.barkx4.mmoverhaul.skills;

import com.barkx4.mmoverhaul.interfaces.Skill;

public class Swordsmanship implements Skill
{
	String displayName = "Swordsmanship";
	
	@Override
	public String getName() 
	{
		return this.getClass().toString();
	}

	@Override
	public String getDisplayName() 
	{
		return displayName;
	}
}
