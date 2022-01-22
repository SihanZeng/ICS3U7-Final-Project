public class Main {
	
  /*instantiate objects*/
  ChoiceHandler cHandler = new ChoiceHandler(this);
  Menu ui = new Menu();

	
	public static void main (String[] args) {
		new Main();
	}
	
	public Main() {
    /*call on create frame*/
    ui.createMenu();
	}
}