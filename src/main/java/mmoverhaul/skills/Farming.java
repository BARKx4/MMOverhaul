package mmoverhaul.skills;

import mmoverhaul.interfaces.Skill;

public class Farming implements Skill
{
	String displayName = "Farming";
	
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
