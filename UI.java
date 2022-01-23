/*import packages*/
import java.awt.*;
import javax.swing.*;

public class UI {
	
	/*method to create frame*/
	public void createUI() {
		/*declare font*/
		Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
		Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
		
		/*initialize frame*/
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		
		/*create components of the main menu*/
		//title panel
		JPanel titlePanel = new JPanel(); 
		titlePanel.setBounds(80, 70, 640, 500);
		titlePanel.setBackground(Color.black);
		//title label
		JLabel titleLabel = new JLabel("PREDATOR");
		titleLabel.setForeground(Color.white);
		titleLabel.setFont(titleFont);
		//author label
		JLabel authorLabel = new JLabel("ICS3U7 Final Project: Sihan Zeng and Patricia Carucinschi");
		authorLabel.setForeground(Color.white);
		authorLabel.setFont(normalFont);
		//button panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 300, 200, 180);
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		buttonPanel.setBackground(Color.black);
		//start button
		JButton startButton = new JButton("     Start     ");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.setFocusPainted(false);
		//instructions button
		JButton instructionsButton = new JButton("Instructions");
		instructionsButton.setBackground(Color.black);
		instructionsButton.setForeground(Color.white);
		instructionsButton.setFont(normalFont);
		instructionsButton.setFocusPainted(false);
		//instructions button
		JButton closeButton = new JButton("    Close     ");
		closeButton.setBackground(Color.black);
		closeButton.setForeground(Color.white);
		closeButton.setFont(normalFont);
		closeButton.setFocusPainted(false);
		
		/*create components of the game screen*/
		//story panel
		JPanel storyPanel = new JPanel();
		storyPanel.setBounds(10, 10, 380, 260);
		storyPanel.setBackground(Color.lightGray); //not needed if frame can change background color
		//story text
		JTextArea storyText = new JTextArea("This is where the story goes.");
		storyText.setBounds(10, 10, 380, 260);
		storyText.setBackground(Color.lightGray); //should be changed/removed at some point
		storyText.setForeground(Color.white);
		storyText.setLineWrap(true);
		storyText.setWrapStyleWord(true);
		storyText.setEditable(false);
		//question panel
		JPanel questionPanel = new JPanel();
		questionPanel.setBounds(10, 270, 380, 20);
		questionPanel.setBackground(Color.lightGray); //not needed if frame can change background color
		//question text
		JTextArea questionText = new JTextArea("What will you do next?");
		questionText.setBounds(10, 260, 380, 20);
		questionText.setBackground(Color.lightGray); //should be changed/removed at some point
		//choice button panel
		JPanel choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(60, 300, 280, 250);
		choiceButtonPanel.setBackground(Color.lightGray); //not needed if frame can change background color
		choiceButtonPanel.setLayout(new GridLayout(3, 1, 5, 5));
		//choice buttons
		JButton choice1Button = new JButton("Choice 1");
		//set back and foreground color???
		choice1Button.setFocusPainted(false);
		JButton choice2Button = new JButton("Choice 2");
		//set back and foreground color???
		choice2Button.setFocusPainted(false);
		JButton choice3Button = new JButton("Choice 3");
		//set back and foreground color???
		choice3Button.setFocusPainted(false);
		//image panel
		JPanel imagePanel = new JPanel();
		imagePanel.setBounds(410, 10, 360, 500);
		imagePanel.setBackground(Color.lightGray); //not needed if frame can change background color
		//scene image
		ImageIcon sceneImageF1 = new ImageIcon("Assets/knife_image.png");
		ImageIcon sceneImageF2 = new ImageIcon(sceneImageF1.getImage().getScaledInstance(360, 360, java.awt.Image.SCALE_SMOOTH));
		JLabel sceneImage = new JLabel(sceneImageF2);
		sceneImage.setBounds(410, 10, 360, 360);
		//weapon image
		ImageIcon weaponImageF1 = new ImageIcon("Assets/knife_image.png");
		ImageIcon weaponImageF2 = new ImageIcon(weaponImageF1.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH));
		JLabel weaponImage = new JLabel(weaponImageF2);
		weaponImage.setBounds(515, 390, 120, 120);
		//hp panel
		JPanel hpPanel = new JPanel();
		hpPanel.setBounds(410, 510, 360, 40);
		hpPanel.setBackground(Color.lightGray); //not needed if frame can change background color
		//hp label
		JLabel hpLabel = new JLabel("HP: 15");		
		hpLabel.setBackground(Color.lightGray);
		hpLabel.setForeground(Color.white);
		
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
		storyPanel.add(storyText);
		questionPanel.add(questionText);
		choiceButtonPanel.add(choice1Button);
		choiceButtonPanel.add(choice2Button);
		choiceButtonPanel.add(choice3Button);
		imagePanel.add(sceneImage);
		imagePanel.add(weaponImage);
		hpPanel.add(hpLabel);
		
		/*add panels to frame*/
		frame.add(storyPanel);
		frame.add(questionPanel);
		frame.add(choiceButtonPanel);
		frame.add(imagePanel);
		frame.add(hpPanel);
		
		/*set frame visible*/
		frame.setVisible(true);
		
		/*repaint button panel to avoid invisible button bug
		for(int i = 0; i < 1000000; i++) {
			buttonPanel.repaint();
		}
		*/
	}

}