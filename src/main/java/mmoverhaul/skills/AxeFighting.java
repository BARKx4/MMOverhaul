package mmoverhaul.skills;

import mmoverhaul.interfaces.Skill;

public class AxeFighting implements Skill
{
	String displayName = "Axe Fighting";
	
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
