package mmoverhaul.skills;

import mmoverhaul.interfaces.Skill;

public class Weaponsmithing implements Skill
{
	String displayName = "Weaponsmithing";
	
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
