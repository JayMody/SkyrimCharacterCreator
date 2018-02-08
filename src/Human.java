public class Human extends Character
{
	//   Instance Variables   //

	
	//   Constructors   //
	public Human()
	{
		
	}
	
	
	//   Accessor Methods   //
	
	
	//   Mutator Methods   //   OVERRIDE   //
	public void setCharacterType(String characterType)
	{
		if (characterType.equalsIgnoreCase("Archer"))
		{
			this.characterType = "Archer";
			
			this.hair = "Mohawk";
			this.facialHair = "Long Goatee-Moustache";
			this.hairColour = "Brown";
			this.eyeColour = "Brown";
			this.armour = "Hardened Leather";
			this.weapon = "Wooden Bow";
			this.warpaint = "No";
			
			characterTypeNum = "0";
		}
		else if (characterType.equalsIgnoreCase("Theif"))
		{
			this.characterType = "Theif";
			
			this.hair = "Short";
			this.facialHair = "Clean Shaven";
			this.hairColour = "Black";			
			this.eyeColour = "Black";
			this.warpaint = "Red Assassin";
			this.armour = "Theives Guild";
			this.weapon = "Iron Dagger";
			
			characterTypeNum = "1";
		}
		else if (characterType.equalsIgnoreCase("Mage"))
		{
			this.characterType = "Mage";
			
			this.hair = "Bald";
			this.facialHair = "Trident Sparrow";
			this.hairColour = "Gray";			
			this.eyeColour = "Gray";
			this.warpaint = "None";
			this.armour = "Mage's Robes";
			this.weapon = "Magical Staff";
			
			characterTypeNum = "2";
		}
		else if (characterType.equalsIgnoreCase("Paladin"))
		{
			this.characterType = "Paladin";
			
			this.hair = "Medium";
			this.facialHair = "Around the mouth";
			this.hairColour = "Red";			
			this.eyeColour = "Black";
			this.warpaint = "None";
			this.armour = "Paladin Knight Armour";
			this.weapon = "Dawnbreaker";
			
			characterTypeNum = "3";
		}
		else if (characterType.equalsIgnoreCase("Warrior"))
		{
			this.characterType = "Warrior";
			
			this.hair = "Long";
			this.facialHair = "Full Beard";
			this.hairColour = "Blond";			
			this.eyeColour = "Blue";
			this.warpaint = "None";
			this.armour = "Nordic SteelPlated Armour";
			this.weapon = "Nordic Warhammer";
			
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
			
			characterTypeNum = null;
		}
	}
}
