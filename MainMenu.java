import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.*;
/**
 * Description: An application to show the main links of a registration system
 * @paragm label1
 */
public class MainMenu  extends Container implements ActionListener {
  
  JButton b1;
  JButton b2;
  JButton b3;
  JButton b4;
  //ActionListener l = new ActionListener(this);
  /**
   * Default constructor
   */ 
  public MainMenu() {
    setLayout(new FlowLayout());
    
    //Add text to the buttons
    b1 = new JButton("Search       ");
    b1.setPreferredSize(new Dimension(200, 30));
    b2 = new JButton("        Personal Information              ");
    b2.setPreferredSize(new Dimension(200, 30));
    b3 = new JButton("              Create          ");
    b3.setPreferredSize(new Dimension(200, 30));
    b4 = new JButton("                   View                  ");
    b4.setPreferredSize(new Dimension(200, 30));
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    
    //Event handler of the main menu buttons
    //b1.addActionListener();
    
  }
  public void actionPerformed(ActionEvent e) {
  }
  public void actionListener(ActionListener ae) {
  }
}