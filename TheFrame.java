
/**
 * Write a description of class TheFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
public class TheFrame extends JFrame
{
    // instance variables - replace the example below with your own
    public TheFrame(){
        ThePanel p = new ThePanel();
        this.getContentPane().add(p);
    }
}
