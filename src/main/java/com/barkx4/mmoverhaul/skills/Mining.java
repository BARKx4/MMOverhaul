package com.barkx4.mmoverhaul.skills;

import com.barkx4.mmoverhaul.interfaces.Skill;
import com.barkx4.mmoverhaul.interfaces.SkillChallenge;

public class Mining implements Skill
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
	
	public static class SmeltIron implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 0;
		}

		@Override
		public int max() // +100
		{
			return 300;
		}
		
		@Override
		public int poor() // +100
		{
			return 50;
		}

		@Override
		public int standard() //+100
		{
			return 100;
		}

		@Override
		public int exceptional() //+100
		{
			return 200;
		}
	}
	
	public static class SmeltDullCopper implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 100;
		}

		@Override
		public int max() // +100
		{
			return 400;
		}
		
		@Override
		public int poor() // +100
		{
			return 150;
		}

		@Override
		public int standard() //+100
		{
			return 200;
		}

		@Override
		public int exceptional() //+100
		{
			return 300;
		}
	}
	
	public static class SmeltCopper implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 200;
		}

		@Override
		public int max() // +100
		{
			return 500;
		}
		
		@Override
		public int poor() // +100
		{
			return 250;
		}

		@Override
		public int standard() //+100
		{
			return 300;
		}

		@Override
		public int exceptional() //+100
		{
			return 400;
		}
	}
	
	public static class SmeltBronze implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 300;
		}

		@Override
		public int max() // +100
		{
			return 600;
		}
		
		@Override
		public int poor() // +100
		{
			return 350;
		}

		@Override
		public int standard() //+100
		{
			return 400;
		}

		@Override
		public int exceptional() //+100
		{
			return 500;
		}
	}
	
	public static class SmeltGold implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 400;
		}

		@Override
		public int max() // +100
		{
			return 700;
		}
		
		@Override
		public int poor() // +100
		{
			return 450;
		}

		@Override
		public int standard() //+100
		{
			return 500;
		}

		@Override
		public int exceptional() //+100
		{
			return 600;
		}
	}
	
	public static class SmeltAgapite implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 500;
		}

		@Override
		public int max() // +100
		{
			return 800;
		}
		
		@Override
		public int poor() // +100
		{
			return 550;
		}

		@Override
		public int standard() //+100
		{
			return 600;
		}

		@Override
		public int exceptional() //+100
		{
			return 700;
		}
	}
	
	public static class SmeltVerite implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 600;
		}

		@Override
		public int max() // +100
		{
			return 900;
		}
		
		@Override
		public int poor() // +100
		{
			return 650;
		}

		@Override
		public int standard() //+100
		{
			return 700;
		}

		@Override
		public int exceptional() //+100
		{
			return 800;
		}
	}
	
	public static class SmeltUmbracite implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 700;
		}

		@Override
		public int max() // +100
		{
			return 1000;
		}
		
		@Override
		public int poor() // +100
		{
			return 750;
		}

		@Override
		public int standard() //+100
		{
			return 800;
		}

		@Override
		public int exceptional() //+100
		{
			return 900;
		}
	}
	
	public static class SmeltValorite implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 800;
		}

		@Override
		public int max() // +100
		{
			return 1100;
		}
		
		@Override
		public int poor() // +100
		{
			return 850;
		}

		@Override
		public int standard() //+100
		{
			return 900;
		}

		@Override
		public int exceptional() //+100
		{
			return 1000;
		}
	}
	
	public static class MineLapis implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 450;
		}

		@Override
		public int max() // +100
		{
			return 750;
		}
		
		@Override
		public int poor() // +100
		{
			return 500;
		}

		@Override
		public int standard() //+100
		{
			return 550;
		}

		@Override
		public int exceptional() //+100
		{
			return 650;
		}
	}
	
	public static class MineEmerald implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 650;
		}

		@Override
		public int max() // +100
		{
			return 950;
		}
		
		@Override
		public int poor() // +100
		{
			return 700;
		}

		@Override
		public int standard() //+100
		{
			return 750;
		}

		@Override
		public int exceptional() //+100
		{
			return 850;
		}
	}
	
	public static class MineDiamond implements SkillChallenge
	{

		@Override
		public int min() // +100
		{
			return 800;
		}

		@Override
		public int max() // +100
		{
			return 1200;
		}
		
		@Override
		public int poor() // +100
		{
			return 900;
		}

		@Override
		public int standard() //+100
		{
			return 950;
		}

		@Override
		public int exceptional() //+100
		{
			return 1100;
		}
	}
}
