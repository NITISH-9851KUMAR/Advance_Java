package swingDemonstrate;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ToggleButtonExample extends JFrame implements ItemListener{
	
	public static void main(String[] args) {
		new ToggleButtonExample();
	}

	private JToggleButton button;
	
	ToggleButtonExample() {
		setTitle("JToggleButton Example");
		setLayout(new FlowLayout());
		setJToggleButton();
		setAction();
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setJToggleButton() {
		button= new JToggleButton("True"); // Toggle Button is created
		add(button); // Set to the JFrame
	}
	
	private void setAction() {
		button.addItemListener(this); 
	}
	public void itemStateChanged(ItemEvent eve) {
		if(button.isSelected())
			button.setText("False");
		else button.setText("True");
	}
}
