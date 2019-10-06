package mmoverhaul.skills;

import mmoverhaul.interfaces.Skill;

public class Archery implements Skill
{
	String displayName = "Mining";
	
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
