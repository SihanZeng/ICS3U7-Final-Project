/*import color for background*/
import java.awt.Color;

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
		ui.explanationPanel1.setVisible(false);
		ui.explanationImagePanel.setVisible(false);
		ui.linePanel3.setVisible(false);
		ui.explanationPanel2.setVisible(false);
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
		ui.explanationPanel1.setVisible(false);
		ui.explanationImagePanel.setVisible(false);
		ui.explanationPanel2.setVisible(false);
		ui.linePanel3.setVisible(false);
		ui.returnPanel.setVisible(false);
		//set background color
		ui.frame.getContentPane().setBackground(Color.lightGray);
		//show game components
		ui.leftPanel.setVisible(true);
		ui.rightPanel.setVisible(true);

	}

	/*method to display instructions and hide others*/
	public void displayInstructions() {
		//hide menu components
		ui.titlePanel.setVisible(false);
		ui.buttonPanel.setVisible(false);
		ui.linePanel1.setVisible(false);
		ui.linePanel2.setVisible(false);
		//hide game components
		ui.leftPanel.setVisible(false);
		ui.rightPanel.setVisible(false);
		//show instructions components
		ui.explanationPanel1.setVisible(true);
		ui.explanationImagePanel.setVisible(true);
		ui.explanationPanel2.setVisible(true);
		ui.linePanel3.setVisible(true);
		ui.returnPanel.setVisible(true);	

	}

}