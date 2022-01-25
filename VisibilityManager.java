/*import color for background*/
import java.awt.Color;

public class VisibilityManager {

	/*declare ui instance*/
	UI ui;

	/*constructor to access UI class*/
	public VisibilityManager(UI userInterface) {
		ui = userInterface;
	}

	/*method to display menu and hide game*/
	public void displayMenu() {
		//show menu components
		ui.titlePanel.setVisible(true);
		ui.buttonPanel.setVisible(true);
		//hide game components
		ui.storyPanel.setVisible(false);
		ui.questionPanel.setVisible(false);
		ui.choiceButtonPanel.setVisible(false);
		ui.imagePanel.setVisible(false);
		ui.hpPanel.setVisible(false);
		//set background color
		ui.frame.getContentPane().setBackground(Color.black);
		
    /*repaint button panel to avoid invisible button bug*/
		for(int i = 0; i < 1000000; i++) {
			ui.buttonPanel.repaint();
		}
	}

	/*method to display game and hide menu*/
	public void displayGame() {
		//show game components
		ui.storyPanel.setVisible(true);
		ui.questionPanel.setVisible(true);
		ui.choiceButtonPanel.setVisible(true);
		ui.imagePanel.setVisible(true);
		ui.hpPanel.setVisible(true);
		//hide game components
		ui.titlePanel.setVisible(false);
		ui.buttonPanel.setVisible(false);
		//set background color
		ui.frame.getContentPane().setBackground(Color.lightGray);
	}
}