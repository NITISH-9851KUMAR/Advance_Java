package swingDemonstrate;

import javax.swing.*;

public class RadioButtonExample {

	RadioButtonExample(){
		JFrame f= new JFrame("Radion Button Example");
		JRadioButton r1= new JRadioButton("Male");
		JRadioButton r2= new JRadioButton("Female");
		r1.setBounds(75, 50, 100, 30);
		r2.setBounds(75, 100, 100, 30);
		
		ButtonGroup button= new ButtonGroup();
		button.add(r1);
		button.add(r2);
		
		f.add(r1); f.add(r2);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new RadioButtonExample();
	}
	
}
