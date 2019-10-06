package mmoverhaul.skills;

import mmoverhaul.interfaces.Skill;

public class Cooking implements Skill
{
	String displayName = "Cooking";
	
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
