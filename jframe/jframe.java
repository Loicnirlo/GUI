import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;


public class jframe {
  public static void main(String[] args) {
    /*
    JFrame fenetre = new JFrame(); // cree l objet fenetre
    fenetre.setSize(500,500); // regler taille fenetre
    fenetre.setTitle("Jfram test"); //regler titre de la fenetre
    fenetre.getContentPane().setBackground(new Color(150,45,86)); // change background color

    // fenetre.setResizable(false); // empeche redimensionnement
    ImageIcon image = new ImageIcon("logo2.png"); // cree une image icon
    fenetre.setIconImage(image.getImage()); // change l'image icon de la fenetre

    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stop le programme quand on ferme la fenetre
    fenetre.setVisible(true); // rend la fenetre visible
    */

    MyFrame fenetre = new MyFrame();
  }
}
