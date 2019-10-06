package mmoverhaul.skills;

import mmoverhaul.interfaces.Skill;

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
