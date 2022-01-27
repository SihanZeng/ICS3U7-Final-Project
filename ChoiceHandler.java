/*import packages*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {
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
			game.story.scene1();
			break;
		case "instructions":
			game.vm.displayInstructions();
			break;
		case "return":
			game.vm.displayMenu();
			break;
		case "close":
			System.exit(0);
			break;
		case "c1": 
			game.story.selectPosition(game.nextPosition1);
			break;
		case "c2": 
			game.story.selectPosition(game.nextPosition2);
			break;
		case "c3": 
			game.story.selectPosition(game.nextPosition3);
			break;
		}
	}
}