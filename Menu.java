/*import packages*/
import java.awt.*;
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
		frame.setLayout(new GridLayout(2, 1));

		/*set title screen*/
		JPanel titleNamePanel = new JPanel();
		titleNamePanel.setBackground(Color.BLACK);
		JLabel titleNameLabel = new JLabel("PREDATOR");
		titleNameLabel.setForeground(Color.WHITE);
		titleNameLabel.setFont(titleFont);
		titleNameLabel.setHorizontalAlignment(0);
		JLabel titleAuthorLabel = new JLabel("By: Patricia Carucinschi & Sihan Zeng (ICS-3U7 Final Project)");
		titleAuthorLabel.setForeground(Color.WHITE);
		titleAuthorLabel.setFont(font);
		titleAuthorLabel.setHorizontalAlignment(0);
		titleNamePanel.setLayout(new GridLayout(4, 1));
		titleNamePanel.add(new JLabel(""));
		titleNamePanel.add(titleNameLabel);
		titleNamePanel.add(titleAuthorLabel);

		/*create button panel*/
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

		/*create buttons*/
		JButton startButton = new JButton("        START       "); //start button
		startButton.setBackground(Color.BLACK);
		startButton.setForeground(Color.WHITE);
		startButton.setFont(font);
		startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		startButton.setFocusPainted(false);	
		JButton instructionsButton = new JButton ("INSTRUCTIONS"); //instructions button
		instructionsButton.setBackground(Color.BLACK);
		instructionsButton.setForeground(Color.WHITE);
		instructionsButton.setFont(font);
		instructionsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		instructionsButton.setFocusPainted(false);
		JButton closeButton = new JButton("        CLOSE       "); //close button
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
		frame.add(titleNamePanel);
		frame.add(buttonPanel);

		/*set frame to be visible*/
		frame.setVisible(true);
	}
}