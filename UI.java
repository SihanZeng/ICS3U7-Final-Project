/*import packages*/
import java.awt.*;
import javax.swing.*;

public class UI {
	
	/*declare components*/
	JFrame frame;
	JPanel titlePanel, buttonPanel, leftPanel, choiceButtonPanel, rightPanel, explanationPanel1, explanationPanel2, explanationImagePanel, returnPanel, linePanel1, linePanel2, linePanel3;
	JLabel titleLabel, authorLabel, explanationImage, sceneImage, weaponImage, hpLabel, sceneImageTest;
	JButton startButton, instructionsButton, closeButton, choice1Button, choice2Button, choice3Button, returnButton;
	JTextArea storyText, questionText, explanationText1, explanationText2;
	
	/*method to create frame*/
	public void createUI(ChoiceHandler cHandler) {
		
		/*declare font*/
		Font largeTitleFont = new Font("Times New Roman", Font.PLAIN, 90);
		Font smallTitleFont = new Font("Times New Roman", Font.PLAIN, 26);
		Font choiceButtonFont = new Font("Serif", Font.PLAIN, 16);
		Font storyFont = new Font("Calibri", Font.PLAIN, 18);
		Font explanationFont = new Font("Calibri", Font.PLAIN, 16);
		
		/*initialize frame*/
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		/*create components of the main menu*/
		//title panel
		titlePanel = new JPanel(); 
		titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
		titlePanel.setBackground(Color.black);
		//title label
		titleLabel = new JLabel("PREDATOR");
		titleLabel.setForeground(Color.white);
		titleLabel.setFont(largeTitleFont);
		titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		//author label
		authorLabel = new JLabel("ICS3U7 Final Project: Sihan Zeng and Patricia Carucinschi");
		authorLabel.setForeground(Color.white);
		authorLabel.setFont(smallTitleFont);
		authorLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		//button panel
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		buttonPanel.setBackground(Color.black);
		//start button
		startButton = new JButton("     Start     ");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(smallTitleFont);
		startButton.setFocusPainted(false);
		startButton.addActionListener(cHandler);
		startButton.setActionCommand("start");
		//instructions button
		instructionsButton = new JButton("Instructions");
		instructionsButton.setBackground(Color.black);
		instructionsButton.setForeground(Color.white);
		instructionsButton.setFont(smallTitleFont);
		instructionsButton.setFocusPainted(false);
		instructionsButton.addActionListener(cHandler);
		instructionsButton.setActionCommand("instructions");
		//instructions button
		closeButton = new JButton("    Close     ");
		closeButton.setBackground(Color.black);
		closeButton.setForeground(Color.white);
		closeButton.setFont(smallTitleFont);
		closeButton.setFocusPainted(false);
		closeButton.addActionListener(cHandler);
		closeButton.setActionCommand("close");
		
		/*create components of the game screen*/
		//left panel
		leftPanel = new JPanel();
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		leftPanel.setBackground(Color.lightGray); //not needed if frame can change background color
		leftPanel.setPreferredSize(new Dimension(370, 460));
		//story text
		storyText = new JTextArea("This is where the story goes.");
		storyText.setFont(storyFont);
		storyText.setBackground(Color.lightGray); //should be changed/removed at some point
		storyText.setForeground(Color.white);
		storyText.setLineWrap(true);
		storyText.setWrapStyleWord(true);
		storyText.setEditable(false);
		//question text
		questionText = new JTextArea("What will you do next?");
		questionText.setBackground(Color.lightGray); //should be changed/removed at some point
		//choice button panel
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBackground(Color.lightGray); //not needed if frame can change background color
		choiceButtonPanel.setLayout(new GridLayout(3, 1, 5, 5));
		//choice buttons
		choice1Button = new JButton("Choice 1");
		choice1Button.setFont(choiceButtonFont);
		choice1Button.addActionListener(cHandler);
		choice1Button.setActionCommand("c1");
		//set back and foreground color???
		choice1Button.setFocusPainted(false);
		choice2Button = new JButton("Choice 2");
		choice2Button.setFont(choiceButtonFont);
		choice2Button.addActionListener(cHandler);
		choice2Button.setActionCommand("c2");
		//set back and foreground color???
		choice2Button.setFocusPainted(false);
		choice3Button = new JButton("Choice 3");
		choice3Button.setFont(choiceButtonFont);
		choice3Button.addActionListener(cHandler);
		choice3Button.setActionCommand("c3");
		//set back and foreground color???
		choice3Button.setFocusPainted(false);
		//right panel
		rightPanel = new JPanel();
		rightPanel.setBackground(Color.lightGray); //not needed if frame can change background color
		rightPanel.setPreferredSize(new Dimension(370, 600));
		//scene image
		ImageIcon sceneImageF1 = new ImageIcon("Assets/knife_image.png");
		ImageIcon sceneImageF2 = new ImageIcon(sceneImageF1.getImage().getScaledInstance(360, 360, java.awt.Image.SCALE_SMOOTH));
		sceneImage = new JLabel(sceneImageF2);
		sceneImage.setPreferredSize(new Dimension(360, 360));
		//weapon image
		ImageIcon weaponImageF1 = new ImageIcon("Assets/knife_image.png");
		ImageIcon weaponImageF2 = new ImageIcon(weaponImageF1.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH));
		weaponImage = new JLabel(weaponImageF2);
		weaponImage.setPreferredSize(new Dimension(120, 120));
		//hp label
		hpLabel = new JLabel("HP: 15");		
		hpLabel.setBackground(Color.lightGray);
		hpLabel.setForeground(Color.white);
		
		/*create components of the instructions screen*/
		//explanation panel 1
		explanationPanel1 = new JPanel();
		explanationPanel1.setPreferredSize(new Dimension(770, 80));
		explanationPanel1.setBackground(Color.black);
		//explanation text 1
		explanationText1 = new JTextArea("Welcome to Predator! This is an interactive story game where you will play in the perspective of a high school student trying to save a friend from a suspected alien invasion. \n\n"
				+ "When you start the game, you will see a screen like this:");
		explanationText1.setPreferredSize(new Dimension(770, 80));
		explanationText1.setFont(explanationFont);
		explanationText1.setLineWrap(true);
		explanationText1.setWrapStyleWord(true);
		explanationText1.setEditable(false);
		explanationText1.setBackground(Color.black);
		explanationText1.setForeground(Color.white);
		//explanation panel 2
		explanationPanel2 = new JPanel();
		explanationPanel2.setPreferredSize(new Dimension(770, 80));
		explanationPanel2.setBackground(Color.black);
		//explanation text 2
		explanationText2 = new JTextArea("The top left tells you the story of the current scene. The Bottom left is where you choose up to 3 options on how you wish to continue"
				+ "The top right is an image of the scene. Below is the image of the knife you carry to fight. The button right is your HP.");
		explanationText2.setPreferredSize(new Dimension(770, 80));
		explanationText2.setFont(explanationFont);
		explanationText2.setLineWrap(true);
		explanationText2.setWrapStyleWord(true);
		explanationText2.setEditable(false);
		explanationText2.setBackground(Color.black);
		explanationText2.setForeground(Color.white);
		//explanation image panel
		explanationImagePanel = new JPanel();
		explanationImagePanel.setPreferredSize(new Dimension(770, 300));
		explanationImagePanel.setBackground(Color.black);
		//explanation image
		ImageIcon explanationImageF1 = new ImageIcon("Assets/explanation_image.png");
		ImageIcon explanationImageF2 = new ImageIcon(explanationImageF1.getImage().getScaledInstance(380, 285, java.awt.Image.SCALE_SMOOTH));
		explanationImage = new JLabel(explanationImageF2);
		explanationImage.setPreferredSize(new Dimension(380, 285));
		//return panel
		returnPanel = new JPanel();
		returnPanel.setBackground(Color.black);
		//return button
		returnButton = new JButton("Return");
		returnButton.addActionListener(cHandler);
		returnButton.setActionCommand("return");
		
		/*create line panel to take up a line*/
		linePanel1 = new JPanel();
		linePanel1.setPreferredSize(new Dimension(800, 60));
		linePanel1.setBackground(Color.black);
		linePanel2 = new JPanel();
		linePanel2.setPreferredSize(new Dimension(800, 60));
		linePanel2.setBackground(Color.black);
		linePanel3 = new JPanel();
		linePanel3.setPreferredSize(new Dimension(800, 10));
		linePanel3.setBackground(Color.black);
		
		/*add components to panels*/
		//menu panels
		titlePanel.add(titleLabel);
		titlePanel.add(authorLabel);
		buttonPanel.add(startButton);
		buttonPanel.add(Box.createRigidArea(new Dimension(0, 20))); //rigid area for space between buttons
		buttonPanel.add(instructionsButton);
		buttonPanel.add(Box.createRigidArea(new Dimension(0, 20))); //rigid area for space between buttons
		buttonPanel.add(closeButton);
		//game panels
		leftPanel.add(storyText);
		leftPanel.add(questionText);
		choiceButtonPanel.add(choice1Button);
		choiceButtonPanel.add(choice2Button);
		choiceButtonPanel.add(choice3Button);
		leftPanel.add(choiceButtonPanel);
		rightPanel.add(sceneImage);
		rightPanel.add(weaponImage);
		rightPanel.add(hpLabel);
		//instructions panels
		explanationPanel1.add(explanationText1);
		explanationImagePanel.add(explanationImage);
		explanationPanel2.add(explanationText2);
		returnPanel.add(returnButton);
		
		/*add panels to frame*/
		//menu components
		frame.add(linePanel1);
		frame.add(titlePanel);
		frame.add(new JLabel("       "));
		frame.add(linePanel2);
		frame.add(buttonPanel);
		//game components
		frame.add(leftPanel);
		frame.add(rightPanel);
		//instructions components
		frame.add(explanationPanel1);
		frame.add(explanationImagePanel);
		frame.add(linePanel3);
		frame.add(explanationPanel2);
		frame.add(returnPanel);
		
		/*set frame visible*/
		frame.setVisible(true);
	}
	
	

}