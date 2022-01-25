public class Main {
	
	/*instantiate classes*/
	ChoiceHandler cHandler = new ChoiceHandler(this);
	UI ui = new UI();
	VisibilityManager vm = new VisibilityManager(ui);
	
	public static void main(String[] args) {
		new Main();
	}
	
	/*create frame*/
	public Main() {
		ui.createUI(cHandler);
		vm.displayMenu();
	}

}

