import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myFrame extends JFrame implements ActionListener{

  JPanel pan1;
  JButton button;

  myFrame(){

    pan1 = new JPanel();
    pan1.setBackground(new Color(65,45,75));

    button = new JButton("test");
    button.setHorizontalAlignment(JButton.CENTER);
    button.addActionListener(this);


    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setVisible(true);
    this.add(button);
    this.set
  }

  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==button){
      this.add(pan1);
    }
  }
}
