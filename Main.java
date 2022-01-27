public class Main {
	
	/*instantiate classes*/
	ChoiceHandler cHandler = new ChoiceHandler(this);
	UI ui = new UI();
	VisibilityManager vm = new VisibilityManager(ui);
	Story story = new Story(this, ui, vm);
	String nextPosition1, nextPosition2, nextPosition3;
	
	public static void main(String[] args) {
		new Main();
	}
	
	/*create frame*/
	public Main() {
		ui.createUI(cHandler);
		story.defaultSetup();
		vm.displayMenu();
	}

}
