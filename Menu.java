/*import packages*/
import java.awt.*;
import javax.swing.*;

public class Menu {
	/*declare variables*/
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font font = new Font("Times New Roman", Font.PLAIN, 20);

	/*create frame*/
	public void createMenu() {
    
		/*initialize frame*/
		JFrame menuFrame = new JFrame();
		menuFrame.setSize(800, 600);
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.getContentPane().setBackground(Color.BLACK);
		menuFrame.setLayout(new GridLayout(2, 1));

		/*set title screen*/
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Color.BLACK);
		JLabel titleLabel = new JLabel("PREDATOR");
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(titleFont);
		titleLabel.setHorizontalAlignment(0);
		JLabel authorLabel = new JLabel("By: Patricia Carucinschi & Sihan Zeng (ICS-3U7 Final Project)");
		authorLabel.setForeground(Color.WHITE);
		authorLabel.setFont(font);
		authorLabel.setHorizontalAlignment(0);
		titlePanel.setLayout(new GridLayout(4, 1));
		titlePanel.add(new JLabel(""));
		titlePanel.add(titleLabel);
		titlePanel.add(authorLabel);

		/*create button panel*/
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

		/*create buttons*/
    //start button
		JButton startButton = new JButton("        START       ");
		startButton.setBackground(Color.BLACK);
		startButton.setForeground(Color.WHITE);
		startButton.setFont(font);
		startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		startButton.setFocusPainted(false);	
		
    //instructions button
		JButton instructionsButton = new JButton ("INSTRUCTIONS"); 
		instructionsButton.setBackground(Color.BLACK);
		instructionsButton.setForeground(Color.WHITE);
		instructionsButton.setFont(font);
		instructionsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		instructionsButton.setFocusPainted(false);
		
    //close button
		JButton closeButton = new JButton("        CLOSE       "); 
		closeButton.setBackground(Color.BLACK);
		closeButton.setForeground(Color.WHITE);
		closeButton.setFont(font);
		closeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		closeButton.setFocusPainted(false);

		/*add buttons to panels*/
		buttonPanel.add(startButton);
		buttonPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		buttonPanel.add(instructionsButton);
		buttonPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		buttonPanel.add(closeButton);

		/*add panels to frame*/
		menuFrame.add(titlePanel);
		menuFrame.add(buttonPanel);
		
		/*Instructions Frame
		JFrame instructionsFrame = new JFrame();
		instructionsFrame.setSize(800, 600);
		instructionsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		instructionsFrame.getContentPane().setBackground(Color.BLACK);
		instructionsFrame.setLayout(new GridLayout(2, 1));
    */
		
		/*set frame to be visible*/
		menuFrame.setVisible(true);
	}
	
}