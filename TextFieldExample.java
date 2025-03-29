package swingDemonstrate;

import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Color;

public class TextFieldExample implements ActionListener{
	JTextField tf1, tf2, tf3;
	JButton b1, b2, b3, b4;
	
	TextFieldExample(){
		JFrame frame= new JFrame("TextField Example");
		frame.setSize(300, 400);

		JPanel panel= new JPanel();
		panel.setBounds(30, 200,200, 100);
		//panel.setBackground(Color.gray);
		panel.setLayout(new FlowLayout());
		
		tf1= new JTextField();
		tf1.setBounds(50, 50, 100, 20);
		
		tf2= new JTextField();
		tf2.setBounds(50, 100, 100, 20);
		
		tf3= new JTextField();
		tf3.setBounds(50, 150, 100, 20);
		tf3.setEditable(false);
		
		b1= new JButton("+");
		b1.setBounds(50, 200, 50, 20);
		b2= new JButton("-");
		b2.setBounds(100, 200, 50, 20);
		b3= new JButton("x");
		b3.setBounds(50, 200, 50, 20);
		b4= new JButton("/");
		b4.setBounds(100, 200, 50, 20);
		
		b1.addActionListener(this);
	        b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		panel.add(b1); panel.add(b2); panel.add(b3);panel.add(b4);
		frame.add(panel);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);

		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		int x= Integer.parseInt(tf1.getText());
		int y= Integer.parseInt(tf2.getText());
		
		int val= 0;
		if(e.getSource()==b1) {
			val= x+y;
		}
		else if(e.getSource()==b2) {
			val= x-y;
		}
		else if(e.getSource()==b3) {
			val= x*y;
		}
		else val= x/y;
		
		tf3.setText(String.valueOf(val));
		
	}
	
	public static void main(String[] args) {
		new TextFieldExample();
	}

}

