package swingDemonstrate;

import javafx.scene.control.ComboBox;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;


public class ButtonEvent {
	public static void main(String[] args) {
		
		JFrame frame= new JFrame("Button Action Listener");
		
		JButton b= new JButton("Click");
		b.setBounds(50, 100, 80, 30);
		
		JTextField t= new JTextField();
		t.setBounds(50, 150, 200, 40);
		t.setVisible(false);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("Welcome to NPTEL Java Course");
				t.setVisible(true);
			}
		});
		
		frame.add(b);
		frame.add(t);
		frame.setSize(300, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
