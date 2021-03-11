import javax.swing.*;
import.java.awt.*;

public class Main {
  public static void main(String[] args) {
    JFrame fenetre = new JFrame();
    fenetre.setSize(500,500);
    fenetre.setLocation(100,100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton b1 = new JButton("Cyan");
    JButton b2 = new JButton("Magenta");
    JButton b3 = new JButton("Jaune");
    JPanel p1 = new JPanel();

    Action a1 = new Action(p1,Color.CYAN);
    b1.addActionListener(a1);
    Action a2 = new Action(p1,Color.MAGENTA);
    b2.addActionListener(a2);
    Action a3 = new Action(p1,Color.YELLOW);
    b3.addActionListener(a3);

    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    fenetre.add(p1);

    fenetre.setVisible(true);
  }
}
