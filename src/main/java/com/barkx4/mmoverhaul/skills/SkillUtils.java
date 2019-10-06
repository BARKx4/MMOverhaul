package com.barkx4.mmoverhaul.skills;

import java.util.Random;

import com.barkx4.mmoverhaul.Main;
import com.barkx4.mmoverhaul.enums.SkillChallengeResult;
import com.barkx4.mmoverhaul.interfaces.Skill;
import com.barkx4.mmoverhaul.interfaces.SkillChallenge;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.text.LiteralText;

public class SkillUtils 
{
	public static SkillChallengeResult challenge(PlayerEntity player, Skill skill, SkillChallenge challenge)
	{		
		float fSkill = get(player, skill);
		
		if (fSkill < challenge.min())
		{
			//Player skill is less than minimum skill needed. Fail automatically.
			
			return SkillChallengeResult.FAIL;
		}
		else if (fSkill > challenge.max())
		{
			// Player skill is higher than skill gain max. Automatic exceptional.
			return SkillChallengeResult.EXCEPTIONAL;
		}
		else
		{
			Random rand = new Random();
			int iPlayerRoll = (int)(fSkill * 5) + rand.nextInt((int)(fSkill * 5));
			
			SkillChallengeResult scrResult = SkillChallengeResult.FAIL;
			float fSkillGain = 0.0f;
			int iResultModifier = 0;
			
			if (iPlayerRoll >= challenge.exceptional())
			{
				iResultModifier = 100;
				scrResult = SkillChallengeResult.EXCEPTIONAL;
			}
			else if (iPlayerRoll >= challenge.standard())
			{
				scrResult = SkillChallengeResult.STANDARD;
			}
			else if (iPlayerRoll >= challenge.poor())
			{
				iResultModifier = -100;
				scrResult = SkillChallengeResult.POOR;
			}
			else
			{
				iResultModifier = -200;
				scrResult = SkillChallengeResult.FAIL;
			}

			// If our player's skill is less than the max challenge difficulty,
			// attempt to raise skill level.
			if (fSkill < challenge.max())
			{
				// First check to gain skill versus the item crafted, decreasing chance as your
				// skill nears the challenge max.
				if ((rand.nextInt(1000) + iResultModifier) > ((fSkill / challenge.max()) * 100))
				{
					// Then check to gain skill again using player skill total vs skill cap, 
					// decreasing chance as the player reaches 1000
					if (rand.nextInt(1000) > (fSkill * 10))
					{
						if (fSkill < 33.0)
						{
							fSkillGain = rand.nextInt(5) / 10.0f;
						}
						else
						{
							fSkillGain = rand.nextInt(3) / 10.0f;
						}
					}
				}
				
				set(player, skill, fSkill + fSkillGain);
			}
			
			return scrResult;
		}
	}
	
	public static void set(PlayerEntity player, Skill skill, float value)
	{
		CompoundTag nbtSkills = Main.SKILLS.get(player).get();
		
		float fOldValue = nbtSkills.getFloat(skill.getName());
		float fChange = value - fOldValue;
		
		String sChange;
		
		if (fChange > 0.0f) sChange = "[+" + String.format("%.1f", fChange) + "]";
		else sChange = "[" + String.format("%.1f", fChange) + "]";
		
		nbtSkills.putFloat(skill.getName(), value);
		Main.SKILLS.get(player).set(nbtSkills);
		
		player.sendMessage(new LiteralText("Your skill in " + skill.getDisplayName() + " has changed. It is now " + String.format("%.1f", value) + " " + sChange + "."));
	}
	
	public static float get(PlayerEntity player, Skill skill)
	{
		CompoundTag nbtSkills = Main.SKILLS.get(player).get();
		if (nbtSkills.isEmpty())
		{
			nbtSkills.putFloat(skill.getName(), 0.0f);
			Main.SKILLS.get(player).set(nbtSkills);
			player.sendMessage(new LiteralText("You've learned a new skill: " + skill.getDisplayName() + "!"));
			
			return 0.0f;
		}
		else if (!nbtSkills.containsKey(skill.getName()))
		{
			nbtSkills.putFloat(skill.getName(), 0.0f);
			Main.SKILLS.get(player).set(nbtSkills);
			player.sendMessage(new LiteralText("You've learned a new skill: " + skill.getDisplayName() + "!"));
			
			return 0.0f;
		}
		else
		{
			return nbtSkills.getFloat(skill.getName());
		}
	}
}
