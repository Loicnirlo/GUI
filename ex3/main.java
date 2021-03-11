import javax.swing.*;
import java.awt.*;

public class main {
  public static void main(String[] args) {

    JFrame fenetre = new JFrame();
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setSize(300,300);

    int z = Integer.parseInt(args[0]);

    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridLayout(z,1));
    for(int i = 0; i<z; i++){
      panel1.add(new JButton("OK"));
    }

    JPanel panel2 = new JPanel();
    panel2.setLayout(new GridLayout(z,1));
    for(int i = 0; i<z; i++){
      panel2.add(new JButton("OK"));
    }

    fenetre.add(panel1,BorderLayout.WEST);
    fenetre.add(panel2,BorderLayout.EAST);

    // System.out.println(fenetre.getSize().width/3);

    fenetre.setVisible(true);
  }
}
