import javax.swing.*;
import java.awt.*;

public class main {
  public static void main(String[] args) {

    ImageIcon logo = new ImageIcon("ninja.png");

    JLabel etiquette = new JLabel();
    etiquette.setText("Bro, do you even code ?");
    etiquette.setIcon(logo);
    etiquette.setHorizontalTextPosition(JLabel.CENTER); // place text par rapport icon
    etiquette.setVerticalTextPosition(JLabel.TOP); // same
    etiquette.setForeground(new Color(0X000000)); // color font
    etiquette.setFont(new Font("Arial",Font.PLAIN,20)); //font style
    etiquette.setIconTextGap(10); // gere gap entre text-image;
    etiquette.setBackground(new Color(0xDCCA7C)); // set background Color
    etiquette.setOpaque(true); //display background color
    etiquette.setVerticalAlignment(JLabel.CENTER);
    etiquette.setHorizontalAlignment(JLabel.CENTER);
    //*****/etiquette.setBounds(150,0,250,250);/***(x,y,width,height)***/


    JFrame fenetre = new JFrame();
    fenetre.setSize(500,500);
    //******/fenetre.setLayout(null);/*****/
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setVisible(true);

    fenetre.add(etiquette);
    //fenetre.pack();
  }
}
