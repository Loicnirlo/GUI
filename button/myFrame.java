import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myFrame extends JFrame implements ActionListener{

  JButton button;

  myFrame(){

    button = new JButton("test");
    button.setHorizontalAlignment(JButton.CENTER);
    button.addActionListener(myFrame);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setVisible(true);
    this.add(button, BorderLayout.CENTER);
  }

  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==button){
      System.out.println("yes");
    }
  }
}
