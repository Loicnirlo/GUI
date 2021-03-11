import javax.swing.*;
import java.awt.*;

public class main {
  public static void main(String[] args) {



    JLabel etiquette = new JLabel("test");
    etiquette.setBounds(0,0,20,20);
    etiquette.setBackground(Color.yellow);
    etiquette.setVerticalAlignment(JLabel.TOP);

    JPanel redPanel = new JPanel();
    redPanel.setBackground(Color.red);
    redPanel.setBounds(0,0,250,250);

    JPanel bluePanel = new JPanel();
    bluePanel.setBackground(Color.blue);
    bluePanel.setBounds(250,0,250,250);
    bluePanel.setLayout(new BorderLayout());

    JFrame fenetre = new JFrame();
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setLayout(null);
    fenetre.setSize(650,650);
    fenetre.setVisible(true);

    bluePanel.add(etiquette);
    fenetre.add(redPanel);
    fenetre.add(bluePanel);
  }
}
