package swingDemonstrate;

import javax.swing.*;

public class CheckBoxExample {
	CheckBoxExample(){
		JFrame f= new JFrame("CheckBox Example");
		JCheckBox b1= new JCheckBox("C++");
		b1.setBounds(100, 100, 50, 50);
		JCheckBox b2= new JCheckBox("Java", true);
		b2.setBounds(100, 150, 50, 50);
		
		f.add(b1);
		f.add(b2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CheckBoxExample();
	}
}
