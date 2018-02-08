public class Orc extends Beast
{
	//   Instance Variables   //

	
	//   Constructors   //
	public Orc()
	{
		this.race = "Orsimer";
	}
	
	
	//   Accessor Methods   //
	
	
	//   Mutator Methods   //
	public void setCharacterType(String characterType)
	{
		if (characterType.equalsIgnoreCase("Bandit"))
		{
			this.characterType = "Bandit";
			
			this.hair = "Pony Tail";
			this.facialHair = "5 O CLock Shadow";
			this.hairColour = "Black";			
			this.eyeColour = "Brown";
			this.warpaint = "Bandit's Mark";
			this.horns = "None";
			this.armour = "Iron Armour";
			this.weapon = "Iron Sword";
			
			characterTypeNum = "0";
		}
		else if (characterType.equalsIgnoreCase("Stronghold Defender"))
		{
			this.characterType = "Stronghold Defender";
			
			this.hair = "Medium Dreads";
			this.facialHair = "Chin Stripe";
			this.hairColour = "Black";			
			this.eyeColour = "Blank White and Blue";
			this.warpaint = "Purple Scar";
			this.horns = "Brows";
			this.armour = "Orcish Armour";
			this.weapon = "Orcish Mace";
			
			
			characterTypeNum = "1";
		}
		else if (characterType.equalsIgnoreCase("Stronghold Ranger"))
		{
			this.characterType = "Stronghold Ranger";
			
			this.hair = "Short";
			this.facialHair = "None";
			this.hairColour = "Black";			
			this.eyeColour = "Blue";
			this.warpaint = "None";
			this.horns = "None";
			this.armour = "Orcish Armour";
			this.weapon = "Orcish Crossbow";
			
			characterTypeNum = "2";
		}
		else if (characterType.equalsIgnoreCase("Stronghold Warrior"))
		{
			this.characterType = "Stronghold Warrior";
			
			this.hair = "Bald";
			this.facialHair = "Goatee";
			this.hairColour = "Black";			
			this.eyeColour = "Black";
			this.warpaint = "None";
			this.horns = "None";
			this.armour = "Orcish Armour";
			this.weapon = "Orcish War Axe";
			
			characterTypeNum = "3";
		}
		else if (characterType.equalsIgnoreCase("Warchief"))
		{
			this.characterType = "Warchief";
			
			this.hair = "Pony Tail";
			this.facialHair = "Full Beard";
			this.hairColour = "Black";			
			this.eyeColour = "Black White";
			this.warpaint = "Warchief Paint";
			this.horns = "Brows";
			this.armour = "Warchief's Armour";
			this.weapon = "Orchalium Strong Axe";
			
			characterTypeNum = "4";
		}
		else
		{
			this.characterType = "N/A";
			
			this.hair = "N/A";
			this.facialHair = "N/A";
			this.hairColour = "N/A";
			this.eyeColour = "N/A";
			this.warpaint = "N/A";
			this.horns = "N/A";
			
			characterTypeNum = null;
		}
	}
}
