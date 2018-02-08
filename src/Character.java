import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Character
{
	//   Character Instance Variables   //
	protected String name;
	protected String race;
	protected String gender;
	protected String placeOfBirth;
	protected int age;
	protected int height;
	protected int weight;
	
	protected String characterType;
	protected BufferedImage characterImage;
	
	protected String hair;
	protected String facialHair;
	protected String hairColour;
	protected String skinColour;
	protected String eyeColour;
	protected String warpaint;
	protected String armour;
	protected String weapon;
	
	protected String genderNum;
	protected String raceNum;
	protected String characterTypeNum;
	protected String imageNumber;
	
	
	
	//   Constructor Variable   //
	public Character()
	{
		
	}
	
	
	
	//   Accessor Variables   //
	public String getName()
	{
		return name;
	}
	public String getRace()
	{
		return race;
	}
	public String getGender()
	{
		return gender;
	}
	public String getPlaceOfBirth()
	{
		return placeOfBirth;
	}
	public int getAge()
	{
		return age;
	}
	public int getHeight()
	{
		return height;
	}
	public int getWeight()
	{
		return weight;
	}
	public String getCharacterType()
	{
		return characterType;
	}
	public String getPhotoReference()
	{
		return race;
	}
	public String getHair()
	{
		return hair;
	}
	public String getFacialHair()
	{
		return facialHair;
	}
	public String getHairColour()
	{
		return hairColour;
	}
	public String getSkinColour()
	{
		return skinColour;
	}
	public String getEyeColour()
	{
		return eyeColour;
	}
	public String getWarpaint()
	{
		return warpaint;
	}
	public String getHorns() //DUMMY
	{
		return "";
	}
	public String getArmour()
	{
		return armour;
	}
	public String getWeapon()
	{
		return weapon;
	}
	public BufferedImage getCharacterImage()
	{
		return characterImage;
	}
	public String getImageNumber()
	{
		return imageNumber;
	}
	
	
	//   Mutators   //
	public void setName(String name)
	{
		this.name = name;
	}
	public void setRace(String race)
	{
		if (race.equalsIgnoreCase("Altmer"))
		{
			this.race = "Altmer";
			this.skinColour = "Yellow";
			raceNum = "0";
		}
		else if (race.equalsIgnoreCase("Argonian"))
		{
			this.race = "Argonian";
			this.skinColour = "Green";
			raceNum = "1";
		}
		else if (race.equalsIgnoreCase("Bosmer"))
		{
			this.race = "Bosmer";
			this.skinColour = "Tan";
			raceNum = "2";
		}
		else if (race.equalsIgnoreCase("Breton"))
		{
			this.race = "Breton";
			this.skinColour = "Ivory";
			raceNum = "3";
		}
		else if (race.equalsIgnoreCase("Dunmer"))
		{
			this.race = "Dunmer";
			this.skinColour = "Purple";
			raceNum = "4";
		}
		else if (race.equalsIgnoreCase("Imperial"))
		{
			this.race = "Imperial";
			this.skinColour = "Fair";
			raceNum = "5";
		}
		else if (race.equalsIgnoreCase("Khajit"))
		{
			this.race = "Khajit";
			this.skinColour = "Pink";
			raceNum = "6";
		}
		else if (race.equalsIgnoreCase("Nord"))
		{
			this.race = "Nord";
			this.skinColour = "Pale";
			raceNum = "7";
		}
		else if (race.equalsIgnoreCase("Orsimer"))
		{
			this.race = "Orsimer";
			this.skinColour = "Light Green";
			raceNum = "8";
		}
		else if (race.equalsIgnoreCase("Redguard"))
		{
			this.race = "Redguard";
			this.skinColour = "Brown";
			raceNum = "9";
		}
		else
		{
			this.race = "N/A";
			this.skinColour = "N/A";
			raceNum = null;
		}
	}
	public void setGender(String gender)
	{
		if (gender.equalsIgnoreCase("Male"))
		{
			this.gender = "Male";
			genderNum = "0";
		}
		else if (gender.equalsIgnoreCase("Female"))
		{
			this.gender = "Female";
			genderNum = "1";
		}
		else
		{
			this.gender = "N/A";
			genderNum = null;
		}
	}
	public void setPlaceOfBirth(String placeOfBirth)
	{
		this.placeOfBirth = placeOfBirth;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	// This method is overidden
	public void setCharacterType(String characterType)
	{
		this.characterType = characterType;
	}
	public void setHair(String hair)
	{
		this.hair = hair;
	}
	public void setFacialHair(String facialHair)
	{
		this.facialHair = facialHair;
	}
	public void setHairColour(String hairColour)
	{
		this.hairColour = hairColour;
	}
	public void setSkinColour(String skinColour)
	{
		this.skinColour = skinColour;
	}
	public void setWarPaint(String warpaint)
	{
		this.warpaint = warpaint;
	}
	public void setArmour(String armour)
	{
		this.armour = armour;
	}
	public void setWeapon(String weapon)
	{
		this.weapon = weapon;
	}
	public void setEyeColour(String eyeColour)
	{
		this.eyeColour = eyeColour;
	}
	public void setImageNumber()
	{
		imageNumber = "res/" + raceNum + genderNum + characterTypeNum + ".jpg";
	}
	
	
	
	//   OVERLOAD   //
	public void setCharacterImage()
	{
		imageNumber = "res/" + raceNum + genderNum + characterTypeNum + ".jpg";
		
		try
		{
			characterImage = ImageIO.read(new File(imageNumber));
		}
		catch (Exception e)
		{
			
		}
	}
	
	public void setCharacterImage(String imageNumber)
	{
		try
		{
			characterImage = ImageIO.read(new File(imageNumber));
		}
		catch (Exception e)
		{
			
		}
	}
}
