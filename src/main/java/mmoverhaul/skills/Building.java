package mmoverhaul.skills;

import mmoverhaul.interfaces.Skill;

public class Building implements Skill
{
	String displayName = "Building";
	
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
