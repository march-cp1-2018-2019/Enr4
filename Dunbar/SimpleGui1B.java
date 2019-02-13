package chap12;

// Noah 2/11/2019

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{
  private JButton button;

  public static void main(String[] args){
    SimpleGui1B gui = new SimpleGui1B();
    gui.go();
  }

  public void go(){
    JFrame frame = new JFrame();
    button = new JButton("Click me");

    button.addActionListener(this);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(button);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent event){
    button.setText("I've been clicked!");
  }
}