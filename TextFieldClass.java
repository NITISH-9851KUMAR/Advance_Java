package swingDemonstrate;

import javax.swing.*;
import java.awt.Event.*;

public class TextFieldClass {
	JTextField tf1, tf2, tf3;
	JButton b1, b2;
	
	TextFieldClass(){
		JFrame frame= new JFrame("TextField Example");
		frame.setSize(300, 400);
		
		tf1= new JTextField();
		tf1.setBounds(50, 50, 100, 50);
		
		tf2= new JTextField();
		tf2.setBounds(50, 100, 100, 50);
		
		tf3= new JTextField();
		tf3.setBounds(50, 150, 100, 50);
		tf3.setEditable(false);
		
		b1= new JButton("Ok");
		b1.setBounds(50, 200, 30, 30);
		b2= new JButton("Click");
		b2.setBounds(100, 200, 40, 30);
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		
		//frame.add(b1); frame.add(b2);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldClass();
	}

}
