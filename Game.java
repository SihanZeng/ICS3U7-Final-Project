/*import classes*/
import javax.swing.*;
import java.awt.*;

public class Game {
	
  /*create frame*/
	public void createGame() {
		JFrame gameFrame = new JFrame("Predator");
		gameFrame.setSize(800, 600);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		gameFrame.setLayout(new FlowLayout());

    /*initialize panels*/
    JPanel leftPanel = new JPanel();
    leftPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    leftPanel.setPreferredSize(new Dimension(375, 500));
    JPanel rightPanel = new JPanel();
    rightPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    rightPanel.setPreferredSize(new Dimension(375, 500));

    /*customize panels*/
    //left panel
    JLabel storyLabel1 = new JLabel("The story begins with you talking to your best friend. While");
    JLabel storyLabel2 = new JLabel("exitingly discussing their last day of school before winter");
    JLabel storyLabel3 = new JLabel("break, you both see something unusual walking towards ");
    JLabel storyLabel4 = new JLabel("you guys. Because it is dark out, you cannot see the figure");
    JLabel storyLabel5 = new JLabel("very clearly, but you move along and continue talking about");
    JLabel storyLabel6 = new JLabel("your day. Sooner or later, you turn around and see that your");
    JLabel storyLabel7 = new JLabel("friend is suddenly missing. You believe that your friend took");
    JLabel storyLabel8 = new JLabel("the creepy shortcut home as a joke to scare them.");
    JLabel questionLabel = new JLabel("                                                             What will you do next?                                                             ");
    JButton choice1Button = new JButton("Choice 1"); //different
    JButton choice2Button = new JButton("Choice 2"); //different
    JButton choice3Button = new JButton("Choice 3"); //different
    choice1Button.setPreferredSize(new Dimension(200, 65));
    choice2Button.setPreferredSize(new Dimension(200, 65));
    choice3Button.setPreferredSize(new Dimension(200, 65));
    //right panel
    ImageIcon sceneImageF = new ImageIcon("Assets/knife_image.png"); //tbd
    Image sceneImageI = sceneImageF.getImage();
    Image sceneImageII = sceneImageI.getScaledInstance(350, 350, java.awt.Image.SCALE_SMOOTH);
    ImageIcon newSceneImageF = new ImageIcon(sceneImageII);
    JLabel sceneImage = new JLabel(newSceneImageF);
    
    ImageIcon weaponImageF = new ImageIcon("Assets/knife_image.png"); //tbd
    Image weaponImageI = weaponImageF.getImage();
    Image weaponImageII = weaponImageI.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
    ImageIcon newWeaponImageF = new ImageIcon(weaponImageII);
    JLabel weaponImage = new JLabel(newWeaponImageF);
    
    JLabel hpLabel = new JLabel("HP: ");
    
    /*add components to panel*/
    //left panel
    leftPanel.add(storyLabel1); 
    leftPanel.add(storyLabel2); 
    leftPanel.add(storyLabel3);
    leftPanel.add(storyLabel4);
    leftPanel.add(storyLabel5);
    leftPanel.add(storyLabel6);
    leftPanel.add(storyLabel7);
    leftPanel.add(storyLabel8);
    leftPanel.add(new JLabel("                                                                 "));
    leftPanel.add(new JLabel("                                                                 "));
    leftPanel.add(questionLabel);
    leftPanel.add(new JLabel("                                                                   "));
    leftPanel.add(choice1Button);
    leftPanel.add(choice2Button);
    leftPanel.add(choice3Button);
    //right panel
    rightPanel.add(sceneImage);
    rightPanel.add(new JLabel("                                          "));
    rightPanel.add(weaponImage);
    rightPanel.add(new JLabel("                                          "));
    rightPanel.add(hpLabel); 

    /*add panels to frame*/
    gameFrame.add(leftPanel);
    gameFrame.add(rightPanel);

    /*add scene number to frame*/
    gameFrame.add(new JLabel(" ")); //different

    /*make frame visible*/
    gameFrame.setVisible(true);

  }
}