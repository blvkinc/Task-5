package gui;

import java.awt.*;
import javax.swing.*;

/******************************************************************************
 * This shows how a lambda can be used to respond to a button press event. This
 * version uses more compact and cleaner than the previous version.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class GUI02 {

  public static void main(String[] args) {
    JFrame f = new JFrame();
    JButton b = new JButton("Press Me");
    f.setLayout(new BorderLayout());
    f.add(b, BorderLayout.CENTER);
    b.addActionListener(
        event -> System.out.println("Button says: " + 
                   event.getActionCommand()));
    f.pack();
    f.setVisible(true);
  }

}
