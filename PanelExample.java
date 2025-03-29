package swingDemonstrate;

import java.awt.Color;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelExample {
	
	PanelExample(){
		JFrame frame= new JFrame("JFrame Example");
		JPanel panel= new JPanel();
		panel.setBounds(50, 50, 200, 200);
		panel.setBackground(Color.GRAY);
		
		JButton b1= new JButton("Button1");
		//b1.setBounds(50, 100, 80, 30);
		b1.setBackground(Color.GREEN);
		
		JButton b2= new JButton("Button2");
		//b2.setBounds(100, 100, 80, 30);
		b2.setBackground(Color.yellow);
		
		panel.add(b1); panel.add(b2);
		panel.setLayout(new FlowLayout());
		
		frame.add(panel);
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelExample();
	}

}
