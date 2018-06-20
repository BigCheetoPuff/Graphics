
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class Main
{
    public static final int WIDTH = 800,HEIGHT = 600;
   public static void main(String[] args){
       TheFrame f = new TheFrame();
       f.setSize(Main.WIDTH,Main.HEIGHT);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
       f.setLocationRelativeTo(null);
    }
    
}
