/*import classes*/
import javax.swing.*;
import java.awt.*;

public class Game {
	
  /*create frame*/
	public void createGame() {
		JFrame gameFrame = new JFrame("Predator");
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		gameFrame.setLayout(new FlowLayout());

    /*initialize panels*/
    JPanel leftPanel = new JPanel();
    leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
    JPanel rightPanel = new JPanel();
    rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

    /*customize panels*/
    //left panel
    JLabel storyLabel = new JLabel(" "); //different 
    JLabel questionLabel = new JLabel("What will you do next?");
    JButton choice1Button = new JButton(" "); //different
    JButton choice2Button = new JButton(" "); //different
    JButton choice3Button = new JButton(" "); //different
    //right panel
    ImageIcon sceneImage_ = new ImageIcon("knife_image.png"); //tbd 
    JLabel sceneImage = new JLabel(sceneImage_);
    ImageIcon weaponImage_ = new ImageIcon("knife_image.png"); //tbd
    JLabel hpLabel = new JLabel("HP: "); //different
    JLabel weaponImage = new JLabel(weaponImage_);
    
    /*add components to panel*/
    //left panel
    leftPanel.add(storyLabel); 
    leftPanel.add(questionLabel);
    leftPanel.add(choice1Button);
    leftPanel.add(choice2Button);
    leftPanel.add(choice3Button);
    //right panel
    rightPanel.add(sceneImage); 
    rightPanel.add(weaponImage);
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