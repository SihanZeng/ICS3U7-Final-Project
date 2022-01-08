//import packages
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Menu extends JPanel implements Runnable {
  //set the frame's fields
  public static final int WIDTH = 800;
  public static final int HEIGHT = 600;
  
  //declare variables
  private Thread thread;
  private boolean running;
  private BufferedImage image;
  private Graphics2D g;

  //call the constructor to create panel
  public Menu() {
    super();
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    //focus panel onto frame
    setFocusable(true);
    requestFocus();
  }

  //override notify function
  public void addNotify() {
    super.addNotify();
    //start thread
    if(thread == null) {
      //initialize thread to this panel
      thread = new Thread(this);
      thread.start();
    }
  }

  //run function for thread to activate
  public void run() {
    //initialize running variables
    running = true;
    image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    g = (Graphics2D) image.getGraphics();
    //frame loop
    while(running) {
      frameUpdate();
      frameRender();
      frameDraw();
    }
  }

  private void frameUpdate() {

  }

  //function to double buffer frame onto backframe
  private void frameRender() {
    /*test variables*/
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, WIDTH, HEIGHT);
    g.setColor(Color.BLACK);
    g.drawString("TEST STRING", 100, 100);

  }

  //function to draw backframe onto frame
  private void frameDraw() {
    Graphics g2 = this.getGraphics();
    g2.drawImage(image, 0, 0, null);
    g2.dispose();
  }
}