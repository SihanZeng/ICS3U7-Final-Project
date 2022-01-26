/*import color for background*/
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class VisibilityManager {

	/*declare ui instance*/
	UI ui;

	/*constructor to access UI class*/
	public VisibilityManager(UI ui) {
		this.ui = ui;
	}

	/*method to display menu and hide others*/
	public void displayMenu() {	
		//hide game components
		ui.leftPanel.setVisible(false);
		ui.rightPanel.setVisible(false);
		//hide instructions components
		ui.explanationPanel.setVisible(false);
		ui.returnPanel.setVisible(false);
		//set background color
		ui.frame.getContentPane().setBackground(Color.black);
		//show menu components
		ui.linePanel1.setVisible(true);
		ui.titlePanel.setVisible(true);
		ui.linePanel2.setVisible(true);
		ui.buttonPanel.setVisible(true);

	}

	/*method to display game and hide others*/
	public void displayGame() {
		
		//hide menu components
		ui.titlePanel.setVisible(false);
		ui.buttonPanel.setVisible(false);
		ui.linePanel1.setVisible(false);
		ui.linePanel2.setVisible(false);
		//hide instructions components
		ui.explanationPanel.setVisible(false);
		ui.returnPanel.setVisible(false);
		//set background color
		ui.frame.getContentPane().setBackground(Color.lightGray);
		//show game components
		ui.leftPanel.setVisible(true);
		ui.rightPanel.setVisible(true);

	}

	/*method to display instructions and hide others*/
	public void displayInstructions() {


	}

}