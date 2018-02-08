public class Khajit extends Beast
{
	//   Instance Variables   //

	
	//   Constructors   //
	public Khajit()
	{
		this.race = "Khajit";
		horns = "None";
	}
	
	
	//   Accessor Methods   //
	
	
	//   Mutator Methods   //
	public void setCharacterType(String characterType)
	{
		if (characterType.equalsIgnoreCase("Assassin"))
		{
			this.characterType = "Assassin";
			
			this.hair = "Khajit Fur";
			this.facialHair = "None";
			this.hairColour = "Blue";			
			this.eyeColour = "Black";
			this.warpaint = "None";
			this.horns = "None";
			this.armour = "Nightingale Armour";
			this.weapon = "Daedric Dagger";
			
			characterTypeNum = "0";
		}
		else if (characterType.equalsIgnoreCase("Desert Dweller"))
		{
			this.characterType = "Desert Dweller";
			
			this.hair = "Khajit Fur";
			this.facialHair = "None";
			this.hairColour = "Dusty Brown";			
			this.eyeColour = "Yellow";
			this.warpaint = "None";
			this.horns = "None";
			this.armour = "Redgaurd Rags";
			this.weapon = "Ceremonial Dagger";
			
			characterTypeNum = "1";
		}
		else if (characterType.equalsIgnoreCase("Feline Fighter"))
		{
			this.characterType = "Feline Fighter";
			
			this.hair = "Khajit Fur";
			this.facialHair = "None";
			this.hairColour = "White";			
			this.eyeColour = "Black";
			this.warpaint = "None";
			this.horns = "None";
			this.armour = "Steel Armour";
			this.weapon = "Steel Axe";
			
			characterTypeNum = "2";
		}
		else if (characterType.equalsIgnoreCase("Jungle Bowman"))
		{
			this.characterType = "Jungle Bowman";
			
			this.hair = "Khajit Fur";
			this.facialHair = "Mutton Chops";
			this.hairColour = "White";			
			this.eyeColour = "Orange";
			this.warpaint = "None";
			this.horns = "None";
			this.armour = "Ranger Leathers";
			this.weapon = "Colvian Bow";
			
			characterTypeNum = "3";
		}
		else if (characterType.equalsIgnoreCase("Merchant"))
		{
			this.characterType = "Merchant";
			
			this.hair = "Khajit Fur";
			this.facialHair = "Chinese Mustache";
			this.hairColour = "Orange";			
			this.eyeColour = "Brown";
			this.warpaint = "None";
			this.horns = "None";
			this.armour = "Merchant's Clothing";
			this.weapon = "None";
			
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
