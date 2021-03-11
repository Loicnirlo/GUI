import javax.swing.*;
import java.awt.*;

public class Exo2 {
  public static void main(String[] args) {

  	JFrame fenetre = new JFrame();

    fenetre.setSize(500, 500);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Disque dis = new Disque();

    dis.setForeground(Color.GREEN);
    dis.setBackground(Color.GREEN);

    fenetre.add(dis);
    fenetre.setVisible(true);

  }
}
