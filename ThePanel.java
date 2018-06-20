
/**
 * Write a description of class ThePanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThePanel extends JPanel implements ActionListener
{
    // instance variables - replace the example below with your own
   public ThePanel(){
       super();
       setPreferredSize(new Dimension(Main.WIDTH,Main.HEIGHT));
       
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    
    public void actionPerformed(ActionEvent e){
        repaint();
    }
}
