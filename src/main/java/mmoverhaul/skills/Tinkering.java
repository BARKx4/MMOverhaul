package mmoverhaul.skills;

import mmoverhaul.interfaces.Skill;

public class Tinkering implements Skill
{
	String displayName = "Tinkering";
	
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
