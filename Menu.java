/*import packages*/
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Menu {
	/*declare variables*/
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font font = new Font("Times New Roman", Font.PLAIN, 20);

  /*create frame*/
	public void createFrame() {
		/*initialize frame*/
    JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setBackground(Color.BLACK);
		frame.setLayout(null);
		
		/*set title screen*/
		JPanel titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 500);
		titleNamePanel.setBackground(Color.BLACK);
		JLabel titleNameLabel = new JLabel("PREDATOR");
		titleNameLabel.setForeground(Color.WHITE);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		JLabel titleAuthorLabel = new JLabel("By: Patricia Carucinschi & Sihan Zeng (ICS-3U7 Final Project)");
		titleAuthorLabel.setForeground(Color.WHITE);
		titleAuthorLabel.setFont(font);
		titleNamePanel.add(titleAuthorLabel);
		
    /*create button panels*/
		JPanel startButtonPanel = new JPanel(); //start button panel
		startButtonPanel.setBounds(300, 400, 100, 50);
		startButtonPanel.setBackground(Color.BLACK);
    JPanel instructionsButtonPanel = new JPanel(); //instructions button panel
		instructionsButtonPanel.setBounds(300, 450, 200, 300);
		instructionsButtonPanel.setBackground(Color.BLACK);
    JPanel closeButtonPanel = new JPanel(); //close button panel
		closeButtonPanel.setBounds(300, 500, 200, 300);
		closeButtonPanel.setBackground(Color.BLACK);
    
    /*create buttons*/
    JButton startButton = new JButton("START"); //start button
		startButton.setBackground(Color.BLACK);
		startButton.setForeground(Color.WHITE);
		startButton.setFont(font);
		startButton.setFocusPainted(false);	
		JButton instructionsButton = new JButton ("INSTRUCTIONS"); //instructions button
		instructionsButton.setBackground(Color.BLACK);
		instructionsButton.setForeground(Color.WHITE);
		instructionsButton.setFont(font);
		instructionsButton.setFocusPainted(false);
		JButton closeButton = new JButton("CLOSE"); //close button
		closeButton.setBackground(Color.BLACK);
		closeButton.setForeground(Color.WHITE);
		closeButton.setFont(font);
		closeButton.setFocusPainted(false);
		
		/*add buttons to panels*/
    startButtonPanel.add(startButton);
    instructionsButtonPanel.add(instructionsButton);
    closeButtonPanel.add(closeButton);
		
    /*add panels to frame*/
		frame.add(titleNamePanel);
		frame.add(startButtonPanel);
		frame.add(instructionsButtonPanel);
		frame.add(closeButtonPanel);
		
    /*set frame to be visible*/
		frame.setVisible(true);
	}
}