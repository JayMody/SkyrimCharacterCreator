// Jay Mody
// ISC 4U0
// Mr Jone
// Monday, October 9th, 2017

/* Description:
 * 
 * This program is an Elder Scrolls V: Skyrim character creator.
 * The program allows you to create characters with different characteristics, races, types, and more.
 * You can create new characters, or you can edit, view, and delete existing ones.
 * At the end of you session, you can choose to either save your changes to your characters, or scrap any changes you have made.
 */


/* Inheritance:
 * Parent Class - Character.java
 * Child of Character - Human.java, Elf.java, Beast.java
 * Child of Beast - Argonian.java, Khajit.java, Orc.java
 *
 * 
 * Overload:
 * Character.java lines 281-305
 * 
 * Overide:
 * Human.java lines 17-101 overrides Character.java at lines 236-240
 * 
 * Array of Records:
 * Main.java line 69
 * 
 * Creation and Usage of Objects:
 * The newCharacter method in Main.java lines 0-0 demonstrates the use of all the classes, (Beast and Character is not used directly because they are parent classes)
 * An object that is a subclass of Characters.java is instantiated and stored in the the array of record. The object type of the new character is determined by the race the user chooses for their character
 * 
 * Differences between the Objects:
 * The human class is different because it allows for unique character types that only apply to the human races
 * The elf class is different because it allows for unique character types that only apply to the elf races
 * The beast class gives any classes that inherit a new variable, String horns
 * The argonian class is different because it allows for unique character types that only apply to the argonian race
 * The khajit class is different because it allows for unique character types that only apply to the khajit race
 * The orc class is different because it allows for unique character types that only apply to the orc races
 */


import java.awt.*;
import javax.swing.*;
import java.io.*;

import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.border.EtchedBorder;


public class Main
{
	private static FileReader fr;
	private static FileWriter fw;

	private static BufferedReader in;
	private static BufferedWriter out;
	
	private static File textFile = new File("res/characters.txt");

	private static ArrayList<Character> characters = new ArrayList<Character>();
	private static Character tempCharacter;

	private static ImageIcon characterIcon = new ImageIcon();

	private static int editNum;
	private static int indexNum;

	private static JFrame frameMain;
	private static JPanel panelMenu;
	private static JPanel panelAdd;
	private static JPanel panelView;
	private static JButton btnNew;
	private static JButton btnEdit;
	private static JButton btnDelete;
	private static JButton btnView;
	private static JComboBox<String> comboBox;
	private static JLabel menuImage;
	private static JLabel lblSkyrimCharacterCreator;
	private static JLabel lblCharacterImage;
	private static JButton btnCacnel;
	private static JButton btnDone;
	private static JTextField fieldName;
	private static JLabel lblNewLabel_2;
	private static JLabel lblAge;
	private static JLabel lblHeightcm;
	private static JLabel lblWeightkg;
	private static ButtonGroup genderButtons;
	private static JRadioButton rdbtnMale;
	private static JRadioButton rdbtnFemale;
	private static JList<String> listRace;
	private static JLabel lblRace;
	private static JLabel lblCreateYourCharacter;
	private static JList<String> listPlaceOfBirth;
	private static JLabel lblPlaceOfBirth;
	private static JList<String> listCharacterType;
	private static JLabel lblCharacterType;
	private static JLabel lblHairT;
	private static JLabel lblFacialHairT;
	private static JLabel lblHairColourT;
	private static JLabel lblSkinColourT;
	private static JLabel lblEyeColourT;
	private static JLabel lblWarpaintT;
	private static JLabel lblHornsT;
	private static JLabel lblHair;
	private static JLabel lblFacialHair;
	private static JLabel lblSkinColour;
	private static JLabel lblEyeColour;
	private static JLabel lblWarpaint;
	private static JLabel lblHorns;
	private static JLabel lblHairColour;
	private static JButton btnSaveAndExit;
	private static JSlider sliderAge;
	private static JSlider sliderHeight;
	private static JSlider sliderWeight;
	private static JLabel lblWeapon;
	private static JLabel lblWeaponT;
	private static JLabel lblArmourT;
	private static JLabel lblArmour;
	private static JLabel lblCurrentHeight;
	private static JLabel lblCurrentAge;
	private static JLabel lblCurrentWeight;
	private static JLabel lbl1;
	private static JLabel lblNewLabel_1;
	private static JLabel label_1;
	private static JLabel lbl2;
	private static JLabel label_3;
	private static JLabel lbl3;
	private static JLabel label_5;
	private static JLabel lbl4;
	private static JLabel label_7;
	private static JLabel lbl5;
	private static JLabel label_9;
	private static JLabel lbl6;
	private static JLabel label_11;
	private static JLabel lbl7;
	private static JLabel label_2;
	private static JLabel lbl8;
	private static JLabel label_6;
	private static JLabel lbl9;
	private static JButton btnDoneV;
	private static JLabel characterImageV;
	private static JLabel label_8;
	private static JLabel label_10;
	private static JLabel label_13;
	private static JLabel lblHairV;
	private static JLabel lblFacialHairV;
	private static JLabel lblHairColourV;
	private static JLabel lblSkinColourV;
	private static JLabel lblEyeColourV;
	private static JLabel lblWarpaintV;
	private static JLabel lblHornsV;
	private static JLabel lblArmourV;
	private static JLabel lblWeaponV;
	private static JLabel lblAge_1;
	private static JLabel lblHeight;
	private static JLabel lblWeightkg_1;
	private static JLabel lblName;
	private static JLabel lblNameV;
	private static JLabel lblHeightV;
	private static JLabel lblAgeV;
	private static JLabel lblWeightV;
	private JLabel lblGender;
	private JLabel lblGenderV;
	private JLabel lblPlaceOfBirthV;
	private JLabel lblBirthPlace;
	private JLabel lblViewCharacter;
	private JLabel lblRace_1;
	private JLabel lblRaceV;
	private JLabel lblCharactertype;
	private JLabel lblCharacterTypeV;
	private JLabel lblErrorMenu;
	private JLabel lblErrorAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					@SuppressWarnings("unused")
					Main window = new Main();
					Main.frameMain.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize()
	{
		//   Main Frame   //
		frameMain = new JFrame();
		frameMain.setBackground(Color.WHITE);
		frameMain.getContentPane().setBackground(Color.WHITE);
		frameMain.getContentPane().setMaximumSize(new Dimension(1120, 630));
		frameMain.getContentPane().setMinimumSize(new Dimension(1120, 630));
		frameMain.setMinimumSize(new Dimension(1279, 720));
		frameMain.setMaximumSize(new Dimension(1600, 900));
		frameMain.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		frameMain.setTitle("Skyrim Character Creator");
		frameMain.setBounds(100, 100, 484, 331);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.getContentPane().setLayout(new CardLayout(0, 0));


		//   Panels   //
		panelMenu = new JPanel();
		panelMenu.setBackground(Color.LIGHT_GRAY);
		frameMain.getContentPane().add(panelMenu, "name_259927276451317");
		panelMenu.setLayout(null);

		panelAdd = new JPanel();
		panelAdd.setLayout(null);
		panelAdd.setBackground(Color.LIGHT_GRAY);
		frameMain.getContentPane().add(panelAdd, "name_260021479517881");

		panelMenu.setEnabled(true);
		panelAdd.setEnabled(false);
		panelMenu.setEnabled(false);

		panelMenu.setVisible(true);
		panelAdd.setVisible(false);
		panelMenu.setVisible(false);


		//   Menu Panel   //
		btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.setEnabled(false);
				panelAdd.setEnabled(true);
				panelMenu.setEnabled(false);
				panelView.setEnabled(false);

				panelMenu.setVisible(false);
				panelAdd.setVisible(true);
				panelMenu.setVisible(false);
				panelView.setVisible(false);

				lblErrorMenu.setText("");
				lblErrorAdd.setText("");
				
				editNum = 0;

				rdbtnMale.setSelected(true);
				rdbtnMale.setSelected(false);

				fieldName.setText("");
				sliderAge.setValue(40);
				sliderHeight.setValue(160);
				sliderWeight.setValue(100);

				listRace.setSelectedIndex(0);
				setCharacterTypeList(listCharacterType, listRace.getSelectedValue());

				listCharacterType.setSelectedIndex(0);
				listPlaceOfBirth.setSelectedIndex(0);

				String gender;

				if (rdbtnMale.isSelected())
				{
					gender = "Male";
				}
				else
				{
					gender = "Female";
				}

				String race = listRace.getSelectedValue();
				String characterType = listCharacterType.getSelectedValue();

				buildCharacterImage(lblCharacterImage, gender, race, characterType);
				updateAttributes(lblHair, lblFacialHair, lblHairColour, lblSkinColour, lblEyeColour, lblWarpaint, lblHorns, lblArmour, lblWeapon);
			}
		});
		btnNew.setBounds(233, 229, 186, 23);
		panelMenu.add(btnNew);

		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (characters.size() == 0)
				{
						lblErrorMenu.setText("There are no characters to edit");
				}
				else
				{
					lblErrorMenu.setText("");
					
					editNum = 1;


					for (int x = 0 ; x < characters.size() ; x++)
					{
						if (characters.get(x).getName().equals(comboBox.getSelectedItem()))
						{
							tempCharacter = characters.get(x);
							indexNum = x;
							break;
						}
					}

					for (int x = 0 ; x < 10 ; x++)
					{
						if (listRace.getModel().getElementAt(x).equals(tempCharacter.getRace()))
						{
							listRace.setSelectedIndex(x);
							break;
						}
					}

					setCharacterTypeList(listCharacterType, tempCharacter.getRace());

					tempCharacter = null;

					for (int x = 0 ; x < characters.size() ; x++)
					{
						if (characters.get(x).getName().equals(comboBox.getSelectedItem()))
						{
							tempCharacter = characters.get(x);
							indexNum = x;
							break;
						}
					}	

					if (tempCharacter.getGender().equals("Male"))
					{
						rdbtnMale.setSelected(true);
						rdbtnFemale.setSelected(false);
					}
					else
					{
						rdbtnMale.setSelected(false);
						rdbtnFemale.setSelected(true);
					}

					fieldName.setText(tempCharacter.getName());
					sliderAge.setValue(tempCharacter.getAge());
					sliderHeight.setValue(tempCharacter.getHeight());
					sliderWeight.setValue(tempCharacter.getWeight());



					for (int y = 0 ; y < 5 ; y++)
					{
						if (listCharacterType.getModel().getElementAt(y).equals(tempCharacter.getCharacterType()))
						{
							listCharacterType.setSelectedIndex(y);
							break;
						}
					}

					for (int z = 0 ; z < 9 ; z++)
					{
						if (listPlaceOfBirth.getModel().getElementAt(z).equals(tempCharacter.getPlaceOfBirth()))
						{
							listPlaceOfBirth.setSelectedIndex(z);
							break;
						}
					}

					updateAttributes(lblHair, lblFacialHair, lblHairColour, lblSkinColour, lblEyeColour, lblWarpaint, lblHorns, lblArmour, lblWeapon);

					tempCharacter = null;

					editNum = 1;


					for (int x = 0 ; x < characters.size() ; x++)
					{
						if (characters.get(x).getName().equals(comboBox.getSelectedItem()))
						{
							tempCharacter = characters.get(x);
							indexNum = x;
							break;
						}
					}

					for (int x = 0 ; x < 10 ; x++)
					{
						if (listRace.getModel().getElementAt(x).equals(tempCharacter.getRace()))
						{
							listRace.setSelectedIndex(x);
							break;
						}
					}

					setCharacterTypeList(listCharacterType, tempCharacter.getRace());

					tempCharacter = null;

					for (int x = 0 ; x < characters.size() ; x++)
					{
						if (characters.get(x).getName().equals(comboBox.getSelectedItem()))
						{
							tempCharacter = characters.get(x);
							indexNum = x;
							break;
						}
					}	

					if (tempCharacter.getGender().equals("Male"))
					{
						rdbtnMale.setSelected(true);
						rdbtnFemale.setSelected(false);
					}
					else
					{
						rdbtnMale.setSelected(false);
						rdbtnFemale.setSelected(true);
					}

					fieldName.setText(tempCharacter.getName());
					sliderAge.setValue(tempCharacter.getAge());
					sliderHeight.setValue(tempCharacter.getHeight());
					sliderWeight.setValue(tempCharacter.getWeight());



					for (int y = 0 ; y < 5 ; y++)
					{
						if (listCharacterType.getModel().getElementAt(y).equals(tempCharacter.getCharacterType()))
						{
							listCharacterType.setSelectedIndex(y);
							break;
						}
					}

					for (int z = 0 ; z < 9 ; z++)
					{
						if (listPlaceOfBirth.getModel().getElementAt(z).equals(tempCharacter.getPlaceOfBirth()))
						{
							listPlaceOfBirth.setSelectedIndex(z);
							break;
						}
					}


					tempCharacter.setCharacterImage();
					characterIcon.setImage(tempCharacter.getCharacterImage());

					updateAttributes(lblHair, lblFacialHair, lblHairColour, lblSkinColour, lblEyeColour, lblWarpaint, lblHorns, lblArmour, lblWeapon);

					panelMenu.setEnabled(false);
					panelAdd.setEnabled(true);
					panelMenu.setEnabled(false);
					panelView.setEnabled(false);

					panelMenu.setVisible(false);
					panelAdd.setVisible(true);
					panelMenu.setVisible(false);
					panelView.setVisible(false);
				}
			}
		});
		btnEdit.setBounds(233, 284, 186, 23);
		panelMenu.add(btnEdit);

		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (characters.size() == 0)
				{
					lblErrorMenu.setText("There are no characters to delete");
				}
				else
				{
					lblErrorMenu.setText(comboBox.getSelectedItem() + " was deleted");
					
					characters.remove(comboBox.getSelectedIndex());
					comboBox.removeItemAt(comboBox.getSelectedIndex());
				}
			}
		});
		btnDelete.setBounds(233, 339, 186, 23);
		panelMenu.add(btnDelete);

		btnView = new JButton("View");
		btnView.setBounds(233, 393, 186, 23);
		panelMenu.add(btnView);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(233, 447, 186, 23);
		panelMenu.add(comboBox);

		menuImage = new JLabel(new ImageIcon("res/menu.png"));
		menuImage.setHorizontalAlignment(SwingConstants.CENTER);
		menuImage.setBorder(new LineBorder(new Color(0, 0, 0)));
		menuImage.setBounds(558, 80, 600, 450);
		panelMenu.add(menuImage);

		lblSkyrimCharacterCreator = new JLabel("Skyrim Character Creator");
		lblSkyrimCharacterCreator.setForeground(new Color(0, 0, 153));
		lblSkyrimCharacterCreator.setFont(new Font("Papyrus", Font.BOLD, 27));
		lblSkyrimCharacterCreator.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkyrimCharacterCreator.setBounds(153, 111, 361, 94);
		panelMenu.add(lblSkyrimCharacterCreator);

		btnSaveAndExit = new JButton("Save and Exit");
		btnSaveAndExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					//new File(textFile.getName()).delete();
					writeToFile();
					out.close();
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}


				System.exit(0);
			}
		});
		btnSaveAndExit.setBounds(776, 588, 186, 23);
		panelMenu.add(btnSaveAndExit);
		
		lblErrorMenu = new JLabel("");
		lblErrorMenu.setForeground(Color.RED);
		lblErrorMenu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblErrorMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorMenu.setBounds(184, 540, 293, 23);
		panelMenu.add(lblErrorMenu);


		try
		{	
			fr = new FileReader(textFile);
			in = new BufferedReader(fr);
			
			readFile();
			
			fw = new FileWriter(textFile);
			out = new BufferedWriter(fw);
		}
		catch(IOException e)
		{
			System.out.println("Error, read/write file(s) was not found");
		}
		
		
		//   Add Panel   //
		//   Done and Cancel   //
		btnCacnel = new JButton("Cancel");
		btnCacnel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.setEnabled(true);
				panelAdd.setEnabled(false);
				panelMenu.setEnabled(false);
				panelView.setEnabled(false);

				panelMenu.setVisible(true);
				panelAdd.setVisible(false);
				panelMenu.setVisible(false);
				panelView.setVisible(false);

				tempCharacter = null;
				
				lblErrorAdd.setText("");
			}
		});
		btnCacnel.setBounds(862, 586, 89, 23);
		panelAdd.add(btnCacnel);

		btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int skip  = 0;
				
				for (int x = 0 ;  x < characters.size() ;  x++)
				{
					if (characters.get(x).getName().equals(fieldName.getText()))
					{
						skip = 1;
						break;
					}
				}
				
				
				if (skip == 1 && editNum == 0)
				{
					lblErrorAdd.setText("A character with that name already exists, please change the name");
				}
				else if (fieldName.getText().equals("") || fieldName.getText().equals(null))
				{
					lblErrorAdd.setText("Please name your character before clicking done");
				}
				else if (editNum == 0)
				{
					String gender;

					if (rdbtnMale.isSelected())
					{
						gender = "Male";
					}
					else
					{
						gender = "Female";
					}

					String name = fieldName.getText();
					int age = sliderAge.getValue();
					int height = sliderHeight.getValue();
					int weight = sliderWeight.getValue();
					String race = listRace.getSelectedValue();
					String placeOfBirth = listPlaceOfBirth.getSelectedValue();
					String characterType = listCharacterType.getSelectedValue();

					newCharacter(name, gender, age, height, weight, race, placeOfBirth, characterType);

					comboBox.addItem(name);
					
					panelMenu.setEnabled(true);
					panelAdd.setEnabled(false);
					panelMenu.setEnabled(false);
					panelView.setEnabled(false);

					panelMenu.setVisible(true);
					panelAdd.setVisible(false);
					panelMenu.setVisible(false);
					panelView.setVisible(false);
					
					lblErrorAdd.setText("");
				}
				else 
				{
					characters.remove(indexNum);
					comboBox.removeItemAt(indexNum);

					String gender;

					if (rdbtnMale.isSelected())
					{
						gender = "Male";
					}
					else
					{
						gender = "Female";
					}

					String name = fieldName.getText();
					int age = sliderAge.getValue();
					int height = sliderHeight.getValue();
					int weight = sliderWeight.getValue();
					String race = listRace.getSelectedValue();
					String placeOfBirth = listPlaceOfBirth.getSelectedValue();
					String characterType = listCharacterType.getSelectedValue();

					newCharacter(name, gender, age, height, weight, race, placeOfBirth, characterType);
					comboBox.addItem(name);
					
					panelMenu.setEnabled(true);
					panelAdd.setEnabled(false);
					panelMenu.setEnabled(false);
					panelView.setEnabled(false);

					panelMenu.setVisible(true);
					panelAdd.setVisible(false);
					panelMenu.setVisible(false);
					panelView.setVisible(false);
					
					lblErrorAdd.setText("");
				}
			}
		});
		btnDone.setBounds(1032, 586, 89, 23);
		panelAdd.add(btnDone);


		//   Lists   //
		listRace = new JList<String>();
		listRace.setSelectionBackground(UIManager.getColor("List.selectionBackground"));
		listRace.setFont(new Font("Segoe Print", Font.PLAIN, 11));
		listRace.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"Altmer", "Argonian", "Bosmer", "Breton", "Dunmer", "Imperial", "Khajit", "Nord", "Orsimer", "Redguard"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		listRace.setBounds(56, 384, 171, 247);
		listRace.setSelectedIndex(0);
		panelAdd.add(listRace);

		listPlaceOfBirth = new JList<String>();
		listPlaceOfBirth.setFont(new Font("Segoe Print", Font.PLAIN, 11));
		listPlaceOfBirth.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"Black Marsh", "Cyrodiil", "Elsweyr", "Hammerfell", "High Rock", "Morrowind", "Skyrim", "Summerset Isles", "Valenwood"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		listPlaceOfBirth.setSelectedIndex(0);
		listPlaceOfBirth.setBounds(237, 384, 171, 247);
		panelAdd.add(listPlaceOfBirth);

		listCharacterType = new JList<String>();
		listCharacterType.setFont(new Font("Segoe Print", Font.PLAIN, 11));
		listCharacterType.setSelectedIndex(0);
		listCharacterType.setBounds(445, 145, 277, 117);
		setCharacterTypeList(listCharacterType, listRace.getSelectedValue());
		panelAdd.add(listCharacterType);


		listRace.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				setCharacterTypeList(listCharacterType, listRace.getSelectedValue());
			}
		});


		listCharacterType.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				
				if (listCharacterType.getSelectedValue() == null)
				{

				}
				else
				{
					String gender;

					if (rdbtnMale.isSelected())
					{
						gender = "Male";
					}
					else
					{
						gender = "Female";
					}

					String race = listRace.getSelectedValue();
					String characterType = listCharacterType.getSelectedValue();

					buildCharacterImage(lblCharacterImage, gender, race, characterType);
					updateAttributes(lblHair, lblFacialHair, lblHairColour, lblSkinColour, lblEyeColour, lblWarpaint, lblHorns, lblArmour, lblWeapon);
				}
			}
		});


		//   Buttons, Sliders, and Textfields   //
		fieldName = new JTextField();
		fieldName.setBounds(56, 154, 354, 20);
		panelAdd.add(fieldName);
		fieldName.setColumns(10);

		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Papyrus", Font.BOLD, 14));
		rdbtnMale.setBackground(Color.LIGHT_GRAY);
		rdbtnMale.setBounds(122, 91, 71, 23);
		rdbtnMale.setSelected(true);
		rdbtnMale.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (listCharacterType.getSelectedValue() == null)
				{

				}
				else
				{
					String gender;

					if (rdbtnMale.isSelected())
					{
						gender = "Male";
					}
					else
					{
						gender = "Female";
					}

					String race = listRace.getSelectedValue();
					String characterType = listCharacterType.getSelectedValue();

					buildCharacterImage(lblCharacterImage, gender, race, characterType);
					updateAttributes(lblHair, lblFacialHair, lblHairColour, lblSkinColour, lblEyeColour, lblWarpaint, lblHorns, lblArmour, lblWeapon);
				}
			}
		});
		panelAdd.add(rdbtnMale);

		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Papyrus", Font.BOLD, 14));
		rdbtnFemale.setBackground(Color.LIGHT_GRAY);
		rdbtnFemale.setBounds(262, 91, 80, 23);
		rdbtnFemale.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (listCharacterType.getSelectedValue() == null)
				{

				}
				else
				{
					String gender;

					if (rdbtnMale.isSelected())
					{
						gender = "Male";
					}
					else
					{
						gender = "Female";
					}

					String race = listRace.getSelectedValue();
					String characterType = listCharacterType.getSelectedValue();

					buildCharacterImage(lblCharacterImage, gender, race, characterType);
					updateAttributes(lblHair, lblFacialHair, lblHairColour, lblSkinColour, lblEyeColour, lblWarpaint, lblHorns, lblArmour, lblWeapon);
				}
			}
		});
		panelAdd.add(rdbtnFemale);

		genderButtons = new ButtonGroup();
		genderButtons.add(rdbtnMale);
		genderButtons.add(rdbtnFemale);

		sliderAge = new JSlider();
		sliderAge.setMinorTickSpacing(1);
		sliderAge.setMaximum(60);
		sliderAge.setMinimum(20);
		sliderAge.setValue(40);
		sliderAge.setSnapToTicks(true);
		sliderAge.setPaintTicks(true);
		sliderAge.setBounds(56, 207, 354, 26);
		sliderAge.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblCurrentAge.setText(sliderAge.getValue() + "");
			}
		});
		panelAdd.add(sliderAge);

		sliderHeight = new JSlider();
		sliderHeight.setMinorTickSpacing(1);
		sliderHeight.setSnapToTicks(true);
		sliderHeight.setPaintTicks(true);
		sliderHeight.setMinimum(120);
		sliderHeight.setMaximum(200);
		sliderHeight.setValue(160);
		sliderHeight.setBounds(56, 267, 354, 26);
		sliderHeight.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblCurrentHeight.setText(sliderHeight.getValue() + "");
			}
		});
		panelAdd.add(sliderHeight);

		sliderWeight = new JSlider();
		sliderWeight.setMinorTickSpacing(1);
		sliderWeight.setSnapToTicks(true);
		sliderWeight.setPaintTicks(true);
		sliderWeight.setMinimum(50);
		sliderWeight.setMaximum(150);
		sliderWeight.setValue(100);
		sliderWeight.setBounds(56, 320, 354, 26);
		sliderWeight.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblCurrentWeight.setText(sliderWeight.getValue() + "");
			}
		});
		panelAdd.add(sliderWeight);


		//   Character Image   //
		lblCharacterImage = new JLabel(characterIcon);
		lblCharacterImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterImage.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCharacterImage.setBounds(762, 91, 450, 450);
		panelAdd.add(lblCharacterImage);

		String gender;
		if (rdbtnMale.isSelected())
		{
			gender = "Male";
		}
		else
		{
			gender = "Female";
		}
		String race = listRace.getSelectedValue();
		String characterType = listCharacterType.getSelectedValue();
		buildCharacterImage(lblCharacterImage, gender, race, characterType);


		//   Dynamic Labels   //
		lblHair = new JLabel("New label");
		lblHair.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		lblHair.setBounds(544, 300, 177, 14);
		panelAdd.add(lblHair);

		lblFacialHair = new JLabel("New label");
		lblFacialHair.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		lblFacialHair.setBounds(544, 330, 177, 14);
		panelAdd.add(lblFacialHair);

		lblSkinColour = new JLabel("New label");
		lblSkinColour.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		lblSkinColour.setBounds(544, 390, 177, 14);
		panelAdd.add(lblSkinColour);

		lblEyeColour = new JLabel("New label");
		lblEyeColour.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		lblEyeColour.setBounds(544, 420, 177, 14);
		panelAdd.add(lblEyeColour);

		lblWarpaint = new JLabel("New label");
		lblWarpaint.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		lblWarpaint.setBounds(544, 450, 177, 14);
		panelAdd.add(lblWarpaint);

		lblHorns = new JLabel("New label");
		lblHorns.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		lblHorns.setBounds(544, 480, 177, 14);
		panelAdd.add(lblHorns);

		lblHairColour = new JLabel("New label");
		lblHairColour.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		lblHairColour.setBounds(544, 360, 177, 14);
		panelAdd.add(lblHairColour);

		lblWeapon = new JLabel("New label");
		lblWeapon.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		lblWeapon.setBounds(544, 591, 177, 14);
		panelAdd.add(lblWeapon);

		lblArmour = new JLabel("New label");
		lblArmour.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		lblArmour.setBounds(544, 561, 177, 14);
		panelAdd.add(lblArmour);

		lblCurrentAge = new JLabel(sliderAge.getValue() + "");
		lblCurrentAge.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCurrentAge.setFont(new Font("Poor Richard", Font.PLAIN, 13));
		lblCurrentAge.setBounds(302, 185, 108, 20);
		panelAdd.add(lblCurrentAge);

		lblCurrentHeight = new JLabel(sliderHeight.getValue() + "");
		lblCurrentHeight.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCurrentHeight.setFont(new Font("Poor Richard", Font.PLAIN, 13));
		lblCurrentHeight.setBounds(302, 244, 108, 20);
		panelAdd.add(lblCurrentHeight);

		lblCurrentWeight = new JLabel(sliderWeight.getValue() + "");
		lblCurrentWeight.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCurrentWeight.setFont(new Font("Poor Richard", Font.PLAIN, 13));
		lblCurrentWeight.setBounds(302, 301, 108, 20);
		panelAdd.add(lblCurrentWeight);


		//   Static Labels   //
		lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Papyrus", Font.BOLD, 14));
		lblAge.setBounds(56, 185, 108, 20);
		panelAdd.add(lblAge);

		lblHeightcm = new JLabel("Height (cm)");
		lblHeightcm.setFont(new Font("Papyrus", Font.BOLD, 14));
		lblHeightcm.setBounds(56, 243, 108, 20);
		panelAdd.add(lblHeightcm);

		lblWeightkg = new JLabel("Weight (kg)");
		lblWeightkg.setFont(new Font("Papyrus", Font.BOLD, 14));
		lblWeightkg.setBounds(56, 298, 108, 20);
		panelAdd.add(lblWeightkg);

		lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Papyrus", Font.BOLD, 14));
		lblNewLabel_2.setBounds(56, 134, 108, 20);
		panelAdd.add(lblNewLabel_2);

		lblRace = new JLabel("Race");
		lblRace.setFont(new Font("Papyrus", Font.BOLD, 14));
		lblRace.setBounds(56, 360, 171, 20);
		panelAdd.add(lblRace);

		lblCreateYourCharacter = new JLabel("Create Your Character");
		lblCreateYourCharacter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateYourCharacter.setForeground(new Color(0, 0, 153));
		lblCreateYourCharacter.setFont(new Font("Papyrus", Font.BOLD, 27));
		lblCreateYourCharacter.setBounds(390, 11, 361, 77);
		panelAdd.add(lblCreateYourCharacter);

		lblPlaceOfBirth = new JLabel("Place Of Birth");
		lblPlaceOfBirth.setFont(new Font("Papyrus", Font.BOLD, 14));
		lblPlaceOfBirth.setBounds(237, 360, 171, 20);
		panelAdd.add(lblPlaceOfBirth);

		lblCharacterType = new JLabel("Character Type");
		lblCharacterType.setFont(new Font("Papyrus", Font.BOLD, 14));
		lblCharacterType.setBounds(516, 121, 171, 20);
		panelAdd.add(lblCharacterType);

		lblHairT = new JLabel("Hair");
		lblHairT.setHorizontalAlignment(SwingConstants.CENTER);
		lblHairT.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblHairT.setBackground(Color.WHITE);
		lblHairT.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblHairT.setBounds(445, 298, 89, 20);
		panelAdd.add(lblHairT);

		lblFacialHairT = new JLabel("Facial Hair");
		lblFacialHairT.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacialHairT.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblFacialHairT.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFacialHairT.setBackground(Color.WHITE);
		lblFacialHairT.setBounds(445, 328, 89, 20);
		panelAdd.add(lblFacialHairT);

		lblHairColourT = new JLabel("Hair Colour");
		lblHairColourT.setHorizontalAlignment(SwingConstants.CENTER);
		lblHairColourT.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblHairColourT.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblHairColourT.setBackground(Color.WHITE);
		lblHairColourT.setBounds(445, 358, 89, 20);
		panelAdd.add(lblHairColourT);

		lblSkinColourT = new JLabel("Skin Colour");
		lblSkinColourT.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkinColourT.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblSkinColourT.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSkinColourT.setBackground(Color.WHITE);
		lblSkinColourT.setBounds(445, 388, 89, 20);
		panelAdd.add(lblSkinColourT);

		lblEyeColourT = new JLabel("Eye Colour");
		lblEyeColourT.setHorizontalAlignment(SwingConstants.CENTER);
		lblEyeColourT.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblEyeColourT.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblEyeColourT.setBackground(Color.WHITE);
		lblEyeColourT.setBounds(445, 418, 89, 20);
		panelAdd.add(lblEyeColourT);

		lblWarpaintT = new JLabel("Warpaint");
		lblWarpaintT.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarpaintT.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblWarpaintT.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblWarpaintT.setBackground(Color.WHITE);
		lblWarpaintT.setBounds(445, 448, 89, 20);
		panelAdd.add(lblWarpaintT);

		lblHornsT = new JLabel("Horns");
		lblHornsT.setHorizontalAlignment(SwingConstants.CENTER);
		lblHornsT.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblHornsT.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblHornsT.setBackground(Color.WHITE);
		lblHornsT.setBounds(445, 478, 89, 20);
		panelAdd.add(lblHornsT);

		lblWeaponT = new JLabel("Weapon");
		lblWeaponT.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeaponT.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblWeaponT.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblWeaponT.setBackground(Color.WHITE);
		lblWeaponT.setBounds(445, 589, 89, 20);
		panelAdd.add(lblWeaponT);

		lblArmourT = new JLabel("Armour");
		lblArmourT.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmourT.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblArmourT.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblArmourT.setBackground(Color.WHITE);
		lblArmourT.setBounds(445, 559, 89, 20);
		panelAdd.add(lblArmourT);

		panelView = new JPanel();
		panelView.setLayout(null);
		panelView.setBackground(Color.LIGHT_GRAY);
		frameMain.getContentPane().add(panelView, "name_260023757542570");

		lbl1 = new JLabel("Hair");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Papyrus", Font.BOLD, 13));
		lbl1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbl1.setBounds(176, 236, 119, 25);
		panelView.add(lbl1);

		lblNewLabel_1 = new JLabel(new ImageIcon("warpaint.png"));
		lblNewLabel_1.setBounds(420, 494, 75, 75);
		panelView.add(lblNewLabel_1);

		label_1 = new JLabel(new ImageIcon("horns.png"));
		label_1.setBounds(420, 580, 75, 75);
		panelView.add(label_1);

		lbl2 = new JLabel("Facial Hair");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Papyrus", Font.BOLD, 13));
		lbl2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbl2.setBounds(176, 322, 119, 25);
		panelView.add(lbl2);

		label_3 = new JLabel(new ImageIcon("hair.png"));
		label_3.setBounds(91, 236, 75, 75);
		panelView.add(label_3);

		lbl3 = new JLabel("Hair Colour");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Papyrus", Font.BOLD, 13));
		lbl3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbl3.setBounds(176, 408, 119, 25);
		panelView.add(lbl3);

		label_5 = new JLabel(new ImageIcon("facialhair.png"));
		label_5.setBounds(91, 322, 75, 75);
		panelView.add(label_5);

		lbl4 = new JLabel("Skin Colour");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("Papyrus", Font.BOLD, 13));
		lbl4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbl4.setBounds(176, 494, 119, 25);
		panelView.add(lbl4);

		label_7 = new JLabel(new ImageIcon("hair.png"));
		label_7.setBounds(91, 408, 75, 75);
		panelView.add(label_7);

		lbl5 = new JLabel("Eye Colour");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setFont(new Font("Papyrus", Font.BOLD, 13));
		lbl5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbl5.setBounds(176, 580, 119, 25);
		panelView.add(lbl5);

		label_9 = new JLabel(new ImageIcon("face.png"));
		label_9.setBounds(91, 494, 75, 75);
		panelView.add(label_9);

		lbl6 = new JLabel("Warpaint");
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setFont(new Font("Papyrus", Font.BOLD, 13));
		lbl6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbl6.setBounds(505, 494, 119, 25);
		panelView.add(lbl6);

		label_11 = new JLabel(new ImageIcon("eye.png"));
		label_11.setBounds(91, 580, 75, 75);
		panelView.add(label_11);

		lbl7 = new JLabel("Horns");
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setFont(new Font("Papyrus", Font.BOLD, 13));
		lbl7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbl7.setBounds(505, 580, 119, 25);
		panelView.add(lbl7);

		label_2 = new JLabel(new ImageIcon("armour.png"));
		label_2.setBounds(420, 236, 75, 75);
		panelView.add(label_2);

		lbl8 = new JLabel("Armour");
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setFont(new Font("Papyrus", Font.BOLD, 13));
		lbl8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbl8.setBounds(505, 236, 119, 25);
		panelView.add(lbl8);

		label_6 = new JLabel(new ImageIcon("weapon.png"));
		label_6.setBounds(420, 322, 75, 75);
		panelView.add(label_6);

		lbl9 = new JLabel("Weapons");
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setFont(new Font("Papyrus", Font.BOLD, 13));
		lbl9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lbl9.setBounds(505, 322, 119, 25);
		panelView.add(lbl9);

		btnDoneV = new JButton("Done");
		btnDoneV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.setEnabled(true);
				panelAdd.setEnabled(false);
				panelMenu.setEnabled(false);
				panelView.setEnabled(false);

				panelMenu.setVisible(true);
				panelAdd.setVisible(false);
				panelMenu.setVisible(false);
				panelView.setVisible(false);
			}
		});
		btnDoneV.setBounds(970, 581, 89, 23);
		panelView.add(btnDoneV);

		characterImageV = new JLabel(characterIcon);
		characterImageV.setHorizontalAlignment(SwingConstants.CENTER);
		characterImageV.setBorder(new LineBorder(new Color(0, 0, 0)));
		characterImageV.setBounds(778, 94, 450, 450);
		panelView.add(characterImageV);
		panelView.setEnabled(false);
		panelView.setEnabled(false);

		label_8 = new JLabel(new ImageIcon("colour.png"));
		label_8.setBounds(66, 408, 50, 50);
		panelView.add(label_8);

		label_10 = new JLabel(new ImageIcon("colour.png"));
		label_10.setBounds(66, 494, 50, 50);
		panelView.add(label_10);

		label_13 = new JLabel(new ImageIcon("colour.png"));
		label_13.setBounds(66, 580, 50, 50);
		panelView.add(label_13);

		lblHairV = new JLabel("");
		lblHairV.setHorizontalAlignment(SwingConstants.LEFT);
		lblHairV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblHairV.setBounds(186, 264, 175, 25);
		panelView.add(lblHairV);

		lblFacialHairV = new JLabel("");
		lblFacialHairV.setHorizontalAlignment(SwingConstants.LEFT);
		lblFacialHairV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblFacialHairV.setBounds(186, 347, 175, 25);
		panelView.add(lblFacialHairV);

		lblHairColourV = new JLabel("");
		lblHairColourV.setHorizontalAlignment(SwingConstants.LEFT);
		lblHairColourV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblHairColourV.setBounds(186, 433, 175, 25);
		panelView.add(lblHairColourV);

		lblSkinColourV = new JLabel("");
		lblSkinColourV.setHorizontalAlignment(SwingConstants.LEFT);
		lblSkinColourV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblSkinColourV.setBounds(186, 519, 175, 25);
		panelView.add(lblSkinColourV);

		lblEyeColourV = new JLabel("");
		lblEyeColourV.setHorizontalAlignment(SwingConstants.LEFT);
		lblEyeColourV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblEyeColourV.setBounds(186, 605, 175, 25);
		panelView.add(lblEyeColourV);

		lblWarpaintV = new JLabel("");
		lblWarpaintV.setHorizontalAlignment(SwingConstants.LEFT);
		lblWarpaintV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblWarpaintV.setBounds(515, 522, 195, 25);
		panelView.add(lblWarpaintV);

		lblHornsV = new JLabel("");
		lblHornsV.setHorizontalAlignment(SwingConstants.LEFT);
		lblHornsV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblHornsV.setBounds(515, 605, 195, 25);
		panelView.add(lblHornsV);

		lblArmourV = new JLabel("");
		lblArmourV.setHorizontalAlignment(SwingConstants.LEFT);
		lblArmourV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblArmourV.setBounds(515, 261, 195, 25);
		panelView.add(lblArmourV);

		lblWeaponV = new JLabel("");
		lblWeaponV.setHorizontalAlignment(SwingConstants.LEFT);
		lblWeaponV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblWeaponV.setBounds(515, 347, 195, 25);
		panelView.add(lblWeaponV);

		lblAge_1 = new JLabel("Age");
		lblAge_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge_1.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblAge_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblAge_1.setBounds(414, 71, 119, 25);
		panelView.add(lblAge_1);

		lblHeight = new JLabel("Height (cm)");
		lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeight.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblHeight.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblHeight.setBounds(414, 105, 119, 25);
		panelView.add(lblHeight);

		lblWeightkg_1 = new JLabel("Weight (kg)");
		lblWeightkg_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeightkg_1.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblWeightkg_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblWeightkg_1.setBounds(414, 141, 119, 25);
		panelView.add(lblWeightkg_1);

		lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblName.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblName.setBounds(66, 67, 119, 25);
		panelView.add(lblName);

		lblNameV = new JLabel("");
		lblNameV.setHorizontalAlignment(SwingConstants.LEFT);
		lblNameV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblNameV.setBounds(203, 67, 183, 25);
		panelView.add(lblNameV);

		lblHeightV = new JLabel("");
		lblHeightV.setHorizontalAlignment(SwingConstants.LEFT);
		lblHeightV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblHeightV.setBounds(553, 105, 183, 25);
		panelView.add(lblHeightV);

		lblAgeV = new JLabel("");
		lblAgeV.setHorizontalAlignment(SwingConstants.LEFT);
		lblAgeV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblAgeV.setBounds(553, 71, 183, 25);
		panelView.add(lblAgeV);

		lblWeightV = new JLabel("");
		lblWeightV.setHorizontalAlignment(SwingConstants.LEFT);
		lblWeightV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblWeightV.setBounds(553, 141, 183, 25);
		panelView.add(lblWeightV);

		lblGender = new JLabel("Gender");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblGender.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblGender.setBounds(66, 106, 119, 25);
		panelView.add(lblGender);

		lblGenderV = new JLabel("");
		lblGenderV.setHorizontalAlignment(SwingConstants.LEFT);
		lblGenderV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblGenderV.setBounds(205, 106, 183, 25);
		panelView.add(lblGenderV);

		lblPlaceOfBirthV = new JLabel("");
		lblPlaceOfBirthV.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlaceOfBirthV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblPlaceOfBirthV.setBounds(205, 142, 183, 25);
		panelView.add(lblPlaceOfBirthV);

		lblBirthPlace = new JLabel("Birth Place");
		lblBirthPlace.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthPlace.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblBirthPlace.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblBirthPlace.setBounds(66, 142, 119, 25);
		panelView.add(lblBirthPlace);

		lblViewCharacter = new JLabel("View Character");
		lblViewCharacter.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewCharacter.setForeground(new Color(0, 0, 153));
		lblViewCharacter.setFont(new Font("Papyrus", Font.BOLD, 27));
		lblViewCharacter.setBounds(263, 2, 361, 77);
		panelView.add(lblViewCharacter);

		lblRace_1 = new JLabel("Race");
		lblRace_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRace_1.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblRace_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblRace_1.setBounds(66, 179, 119, 25);
		panelView.add(lblRace_1);

		lblRaceV = new JLabel("");
		lblRaceV.setHorizontalAlignment(SwingConstants.LEFT);
		lblRaceV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblRaceV.setBounds(205, 179, 183, 25);
		panelView.add(lblRaceV);

		lblCharactertype = new JLabel("Character Type");
		lblCharactertype.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharactertype.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblCharactertype.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblCharactertype.setBounds(414, 178, 119, 25);
		panelView.add(lblCharactertype);

		lblCharacterTypeV = new JLabel("");
		lblCharacterTypeV.setHorizontalAlignment(SwingConstants.LEFT);
		lblCharacterTypeV.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblCharacterTypeV.setBounds(553, 178, 183, 25);
		panelView.add(lblCharacterTypeV);

		lblHorns.setVisible(false);
		lblHornsT.setVisible(false);
		lblHornsV.setVisible(false);
		lbl7.setVisible(false);
		label_1.setVisible(false);

		updateAttributes(lblHair, lblFacialHair, lblHairColour, lblSkinColour, lblEyeColour, lblWarpaint, lblHorns, lblArmour, lblWeapon);
		
		lblErrorAdd = new JLabel("");
		lblErrorAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorAdd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblErrorAdd.setForeground(Color.RED);
		lblErrorAdd.setBounds(762, 54, 450, 26);
		panelAdd.add(lblErrorAdd);

		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem() == null || characters.size() == 0)
				{
					lblErrorMenu.setText("There are no characters to view");
				}
				else
				{
					lblErrorMenu.setText("");
					
					panelMenu.setEnabled(false);
					panelAdd.setEnabled(false);
					panelMenu.setEnabled(false);
					panelView.setEnabled(true);

					panelMenu.setVisible(false);
					panelAdd.setVisible(false);
					panelMenu.setVisible(false);
					panelView.setVisible(true);

					for (int x = 0 ; x < characters.size() ; x++)
					{
						if (characters.get(x).getName().equals(comboBox.getSelectedItem()))
						{
							tempCharacter = characters.get(x);

							break;
						}
					}

					updateAttributes(lblHairV, lblFacialHairV, lblHairColourV, lblSkinColourV, lblEyeColourV, lblWarpaintV, lblHornsV, lblArmourV, lblWeaponV);

					lblNameV.setText(tempCharacter.getName());
					lblAgeV.setText(tempCharacter.getAge() + "");
					lblHeightV.setText(tempCharacter.getHeight() + "");
					lblWeightV.setText(tempCharacter.getWeight() + "");
					lblGenderV.setText(tempCharacter.getGender());
					lblPlaceOfBirthV.setText(tempCharacter.getPlaceOfBirth());
					lblRaceV.setText(tempCharacter.getRace());
					lblCharacterTypeV.setText(tempCharacter.getCharacterType());

					tempCharacter.setCharacterImage();

					characterIcon.setImage(tempCharacter.getCharacterImage());
				}
			}
		});

	}





	//   Update, Clear Labels   //
	public static void updateAttributes(JLabel hair, JLabel facialHair, JLabel hairColour, JLabel skinColour, JLabel eyeColour, JLabel warpaint, JLabel horns, JLabel armour, JLabel weapon)
	{
		hair.setText(tempCharacter.getHair());
		facialHair.setText(tempCharacter.getFacialHair());
		hairColour.setText(tempCharacter.getHairColour());
		skinColour.setText(tempCharacter.getSkinColour());
		eyeColour.setText(tempCharacter.getEyeColour());
		warpaint.setText(tempCharacter.getWarpaint());
		armour.setText(tempCharacter.getArmour());
		weapon.setText(tempCharacter.getWeapon());

		if (tempCharacter.getRace().equals("Argonian") || tempCharacter.getRace().equals("Khajit") || tempCharacter.getRace().equals("Orsimer"))
		{
			lblHorns.setVisible(true);
			lblHornsT.setVisible(true);

			lblHornsV.setVisible(true);
			lbl7.setVisible(true);
			label_1.setVisible(true);

			horns.setText(tempCharacter.getHorns());
		}
		else
		{
			lblHorns.setVisible(false);
			lblHornsT.setVisible(false);
			lblHornsV.setVisible(false);
			lbl7.setVisible(false);
			label_1.setVisible(false);
		}

		if (tempCharacter.getGender().equals("Female"))
		{
			lblFacialHair.setText("None");
		}
	}



	//   Set Character Methods   //
	public static void buildCharacterImage(JLabel label, String gender, String race, String characterType)
	{
		if (race.equals("Altmer") || race.equals("Bosmer") || race.equals("Dunmer"))
		{
			tempCharacter =  new Elf();
		}
		else if (race.equals("Breton") || race.equals("Imperial") || race.equals("Nord") || race.equals("Redguard"))
		{
			tempCharacter =  new Human();
		}
		else if (race.equals("Argonian"))
		{
			tempCharacter =  new Argonian();
		}
		else if (race.equals("Khajit"))
		{
			tempCharacter =  new Khajit();
		}
		else if (race.equals("Orsimer"))
		{
			tempCharacter =  new Orc();
		}

		tempCharacter.setGender(gender);
		tempCharacter.setRace(race);
		tempCharacter.setCharacterType(characterType);

		tempCharacter.setCharacterImage();
		
		characterIcon.setImage(tempCharacter.getCharacterImage());

		label.repaint();
	}


	public static void newCharacter(String name, String gender, int age, int height, int weight, String race, String placeOfBirth, String characterType)
	{ 	
		if (race.equals("Altmer") || race.equals("Bosmer") || race.equals("Dunmer"))
		{
			characters.add(new Elf());
		}
		else if (race.equals("Breton") || race.equals("Imperial") || race.equals("Nord") || race.equals("Redguard"))
		{
			characters.add(new Human());		
		}
		else if (race.equals("Argonian"))
		{
			characters.add(new Argonian());		
		}
		else if (race.equals("Khajit"))
		{
			characters.add(new Khajit());		
		}
		else if (race.equals("Orsimer"))
		{
			characters.add(new Orc());		
		}

		characters.get(characters.size() - 1).setName(name);
		characters.get(characters.size() - 1).setGender(gender);
		characters.get(characters.size() - 1).setAge(age);
		characters.get(characters.size() - 1).setHeight(height);
		characters.get(characters.size() - 1).setWeight(weight);
		characters.get(characters.size() - 1).setRace(race);
		characters.get(characters.size() - 1).setPlaceOfBirth(placeOfBirth);
		characters.get(characters.size() - 1).setCharacterType(characterType);

		if (characters.get(characters.size() - 1).getGender().equals("Female"))
		{
			characters.get(characters.size() - 1).setFacialHair("None");
		}

		tempCharacter = null;
	}

	
	public static void editCharacter(int indexNum, String name, String gender, int age, int weight, int height, String race, String placeOfBirth, String characterType)
	{
		characters.get(indexNum).setName(name);
		characters.get(indexNum).setGender(gender);
		characters.get(indexNum).setAge(age);
		characters.get(indexNum).setHeight(height);
		characters.get(indexNum).setWeight(weight);
		characters.get(indexNum).setRace(race);
		characters.get(indexNum).setPlaceOfBirth(placeOfBirth);
		characters.get(indexNum).setCharacterType(characterType);

		if (characters.get(indexNum).getGender().equals("Female"))
		{
			characters.get(indexNum).setFacialHair("None");
		}
	}

	//   Character Type List Methods   //
	public static void setCharacterTypeList(JList<String> charTypeList, String raceSelection)
	{	
		if (raceSelection.equals("Altmer") || raceSelection.equals("Bosmer") || raceSelection.equals("Dunmer"))
		{
			elfList(charTypeList);
		}
		else if (raceSelection.equals("Breton") || raceSelection.equals("Imperial") || raceSelection.equals("Nord") || raceSelection.equals("Redguard"))
		{
			humanList(charTypeList);
		}
		else if (raceSelection.equals("Argonian"))
		{
			argonianList(charTypeList);
		}
		else if (raceSelection.equals("Khajit"))
		{
			khajitList(charTypeList);
		}
		else if (raceSelection.equals("Orsimer"))
		{
			orcList(charTypeList);
		}

		listCharacterType.setSelectedIndex(0);
	}
	@SuppressWarnings("serial")
	public static void humanList(JList<String> charTypeList)
	{
		charTypeList.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"Archer", "Theif", "Mage", "Paladin", "Warrior"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
	}
	@SuppressWarnings("serial")
	public static void elfList(JList<String> charTypeList)
	{
		charTypeList.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"Battle Mage", "Druid", "Ranger", "Swords-Spell", "Necromancer"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
	}
	@SuppressWarnings("serial")
	public static void argonianList(JList<String> charTypeList)
	{
		charTypeList.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"Argonian Warrior", "Assassin", "Marsh Mage", "Scaled Knight", "Water-Lurker"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
	}
	@SuppressWarnings("serial")
	public static void khajitList(JList<String> charTypeList)
	{
		charTypeList.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"Assassin", "Desert Dweller", "Feline Fighter", "Jungle Bowman", "Merchant"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
	}
	@SuppressWarnings("serial")
	public static void orcList(JList<String> charTypeList)
	{
		charTypeList.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"Bandit", "Stronghold Defender", "Stronghold Ranger", "Stronghold Warrior", "Warchief"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
	}




	//   Read and Write to File   //

	public static void writeToFile() throws IOException
	{
		out.write(characters.size() + "");
		out.newLine();

		for (int x = 0 ; x < characters.size() ;  x++)
		{
			out.write(characters.get(x).getRace());
			out.newLine();

			out.write(characters.get(x).getName());
			out.newLine();

			out.write(characters.get(x).getGender());
			out.newLine();

			out.write(characters.get(x).getPlaceOfBirth());
			out.newLine();

			out.write(characters.get(x).getAge() + "");
			out.newLine();

			out.write(characters.get(x).getHeight() + "");
			out.newLine();

			out.write(characters.get(x).getWeight() + "");
			out.newLine();

			out.write(characters.get(x).getCharacterType());
			out.newLine();
		}
	}

	public static void readFile() throws IOException
	{
		String firstLine = in.readLine();
		
		if (firstLine == null)
		{

		}
		else
		{
			int numCharacters = Integer.parseInt(firstLine);
			
			for (int x = 0 ; x < numCharacters ;  x++)
			{
				String raceSelection = in.readLine();

				if (raceSelection.equals("Altmer") || raceSelection.equals("Bosmer") || raceSelection.equals("Dunmer"))
				{
					characters.add(new Elf());
				}
				else if (raceSelection.equals("Breton") || raceSelection.equals("Imperial") || raceSelection.equals("Nord") || raceSelection.equals("Redguard"))
				{
					characters.add(new Human());
				}
				else if (raceSelection.equals("Argonian"))
				{
					characters.add(new Argonian());
				}
				else if (raceSelection.equals("Khajit"))
				{
					characters.add(new Khajit());
				}
				else if (raceSelection.equals("Orsimer"))
				{
					characters.add(new Orc());
				}

				characters.get(x).setRace(raceSelection);
				
				String name = in.readLine();
				
				characters.get(x).setName(name);
				comboBox.addItem(name);
				
				characters.get(x).setGender(in.readLine());
				characters.get(x).setPlaceOfBirth(in.readLine());
				characters.get(x).setAge(Integer.parseInt(in.readLine()));
				characters.get(x).setHeight(Integer.parseInt(in.readLine()));
				characters.get(x).setWeight(Integer.parseInt(in.readLine()));
				characters.get(x).setCharacterType(in.readLine());
			}
		}
	}
}