import javax.swing.JComponent;
import java.awt.Graphics;

public class Disque extends JComponent {
  @Override
  public void paintComponent(Graphics pinceau) {
    // on crée un nouveau pinceau pour pouvoir le modifier plus tard
    Graphics secondPinceau = pinceau.create();
    // si le composant n'est pas censé être transparent
    if (this.isOpaque()) {
      // on repeint toute la surface avec la couleur de fond
      secondPinceau.setColor(this.getBackground());
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    // maintenant on fait ce que l'on veut
    secondPinceau.setColor(this.getForeground());
    secondPinceau.fillOval(0, 0, 500, 500);
  }
}
