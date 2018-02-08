public class Argonian extends Beast
{
	//   Instance Variables   //

	
	//   Constructors   //
	public Argonian()
	{
		this.race = "Argonian";
	}
	
	
	//   Accessor Methods   //
	
	
	//   Mutator Methods   //
	public void setCharacterType(String characterType)
	{
		if (characterType.equalsIgnoreCase("Argonian Warrior"))
		{
			this.characterType = "Argonian Warrior";
			
			this.hair = "None";
			this.facialHair = "None";
			this.hairColour = "None";			
			this.eyeColour = "Green";
			this.warpaint = "None";
			this.horns = "Chin";
			this.armour = "Ebon-Steel Armour";
			this.weapon = "Ebon-Steel Sword";
			
			characterTypeNum = "0";
		}
		else if (characterType.equalsIgnoreCase("Assassin"))
		{
			this.characterType = "Assassin";
			
			this.hair = "None";
			this.facialHair = "None";
			this.hairColour = "None";			
			this.eyeColour = "Black";
			this.warpaint = "None";
			this.horns = "None";
			this.armour = "Nightingale Armour";
			this.weapon = "Daedric Dagger";
			
			characterTypeNum = "1";
		}
		else if (characterType.equalsIgnoreCase("Marsh Mage"))
		{
			this.characterType = "Marsh Mage";
			
			this.hair = "None";
			this.facialHair = "None";
			this.hairColour = "None";			
			this.eyeColour = "Green";
			this.warpaint = "None";
			this.horns = "Chin";
			this.armour = "Bone-Scaled Robes";
			this.weapon = "Jagged Staff";
			
			characterTypeNum = "2";
		}
		else if (characterType.equalsIgnoreCase("Scaled Knight"))
		{
			this.characterType = "Scaled Knight";
			
			this.hair = "None";
			this.facialHair = "None";
			this.hairColour = "None";			
			this.eyeColour = "Blue";
			this.warpaint = "None";
			this.horns = "Goat-Horns and Chin";
			this.armour = "Dragon Scale Armour";
			this.weapon = "Dragon Tooth Spear";
			
			characterTypeNum = "3";
		}
		else if (characterType.equalsIgnoreCase("Water-Lurker"))
		{
			this.characterType = "Water-Lurker";
			
			this.hair = "Feathers";
			this.facialHair = "Green";
			this.hairColour = "Green";
			this.eyeColour = "Blue";
			this.warpaint = "None";
			this.horns = "Goat Horns, Chin, Brow";
			this.armour = "Ragged Trousers";
			this.weapon = "Claws";
			
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
