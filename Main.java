//import packages
import javax.swing.*;
public class Main {
  public static void main(String[] args) {
    //create frame
    JFrame frame = new JFrame("Game");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //set pane to game panel
    frame.setContentPane(new Menu());

    //display game panel to frame
    frame.pack();
    frame.setVisible(true);
  }
}