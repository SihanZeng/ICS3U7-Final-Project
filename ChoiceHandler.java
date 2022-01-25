/*import packages*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener{
	Main game;

	/*construct choicehandler*/
	public ChoiceHandler(Main g) {
		game = g;
	}

	/*initialize action receiver*/
	public void actionPerformed(ActionEvent event){
		String yourChoice = event.getActionCommand(); 
		switch(yourChoice){
		case "start": 
			game.vm.displayGame();
			break;
		case "instructions":
			break;
		case "close":
			break;
		case "c1": 
			break;
		case "c2": 
			break;
		case "c3": 
			break;
		}
	}
}