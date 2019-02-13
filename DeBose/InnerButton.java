/**
 * Abby DuBose
 * Feb 12, 2019
 */
package chap12;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerButton {
	JFrame frame;
	JButton b;
	
	public static void main(String[] args) {
		InnerButton gui = new InnerButton();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b = new JButton("A");
		b.addActionListener(new BListener());
		
		frame.getContentPane().add(BorderLayout.SOUTH,  b);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}
	//I have no clue why but in eclipse it shows the "BListener" as an error	
	class BListener implements ActionListener {
		public void actionPreformed(ActionEvent e) {
			if (b.getText().equals("A");
			b.setText("B");
		
			//I have no clue why but in eclips it shows the "else" as and error
		} else {
			b.setText("A");
			}
		}
	}
}
			
		