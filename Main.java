public class Main {
	
  /*instantiate objects*/
  ChoiceHandler cHandler = new ChoiceHandler(this);
  UI ui = new UI();

	
	public static void main (String[] args) {
		new Main();
	}
	
	public Main() {
    /*call on create frame*/
    ui.createUI();
	}
}