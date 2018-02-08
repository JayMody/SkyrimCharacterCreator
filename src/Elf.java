public class Elf extends Character
{
	//   Instance Variables   //

	
	//   Constructors   //
	public Elf()
	{
		
	}
	
	
	//   Accessor Methods   //
	
	
	//   Mutator Methods   //
	public void setCharacterType(String characterType)
	{
		if (characterType.equalsIgnoreCase("Battle Mage"))
		{
			this.characterType = "Battle Mage";
			
			this.hair = "Long";
			this.facialHair = "Van Dyke";
			this.hairColour = "Red";			
			this.eyeColour = "Red";
			this.warpaint = "No";
			this.armour = "Spellbinder Armour";
			this.weapon = "Battle Staves";
			
			characterTypeNum = "0";
		}
		else if (characterType.equalsIgnoreCase("Druid"))
		{
			this.characterType = "Druid";
			
			this.hair = "High Pony-Tail";
			this.facialHair = "Long Goatee-Moustache";
			this.hairColour = "White";			
			this.eyeColour = "Blank White";
			this.warpaint = "None";
			this.armour = "Mage's Robes";
			this.weapon = "Druid Staff";
			
			characterTypeNum = "1";
		}
		else if (characterType.equalsIgnoreCase("Ranger"))
		{
			this.characterType = "Ranger";
			
			this.hair = "Mohwawk";
			this.facialHair = "Van Dyke";
			this.hairColour = "Black";			
			this.eyeColour = "Brown";
			this.warpaint = "None";
			this.armour = "Bosmer Armour";
			this.weapon = "Bosmerian Bow";
			
			characterTypeNum = "2";
		}
		else if (characterType.equalsIgnoreCase("Swords-Spell"))
		{
			this.characterType = "Swords-Spell";
			
			this.hair = "Meduim";
			this.facialHair = "Abe Linclon";
			this.hairColour = "Dark Blond";			
			this.eyeColour = "Blue";
			this.warpaint = "None";
			this.armour = "Altmerian Steel";
			this.weapon = "WhiteSteel Blade";
			
			characterTypeNum = "3";
		}
		else if (characterType.equalsIgnoreCase("Necromancer"))
		{
			this.characterType = "Necromancer";
			
			this.hair = "Short";
			this.facialHair = "Clean Shaven";
			this.hairColour = "Black";			
			this.eyeColour = "Black";
			this.warpaint = "Red Skull";
			this.armour = "Necromancer's Robes";
			this.weapon = "Sacrificial Dagger";
			
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
