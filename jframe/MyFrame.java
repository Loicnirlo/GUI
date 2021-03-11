import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {

  public MyFrame(){

    this.setSize(500,500);
    this.setTitle("Jfram test");
    this.getContentPane().setBackground(new Color(150,45,86));

    ImageIcon image = new ImageIcon("logo2.png");
    this.setIconImage(image.getImage());

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}
