import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Action implements ActionListener{
  public Action(JPanel p1, Color couleur){
    this.panel = p1;
    this.color = couleur;
  }
  private JPanel panel;
  private Color color;

  @Override
  public void ActionPerformed(ActionEvent event){
    this.pane1.setBackground(this.color);
  }
}
