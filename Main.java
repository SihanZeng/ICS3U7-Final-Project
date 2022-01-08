//import pacakges
import javax.swing.*;
public class Main {
  public static void main(String[] args) {
    //initialize frame
    JFrame frame = new JFrame("Game");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //set panel to menu class
    frame.setContentPane(new Menu());

    //display frame
    frame.pack();
    frame.setVisible(true);
  }
}