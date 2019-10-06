package mmoverhaul.skills;

import mmoverhaul.interfaces.Skill;

public class Armorsmithing implements Skill
{
	String displayName = "Armorsmithing";
	
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
