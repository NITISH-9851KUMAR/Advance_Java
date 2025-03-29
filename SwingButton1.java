package swingDemonstrate;

import javax.swing.*;
import java.awt.*;

public class SwingButton1 {
	public static void main(String[] args) {
		
		JFrame frame= new JFrame("Swing Button Example");
		JButton button= new JButton("Click Me");
		button.setBounds(50, 50, 100,  40);
		
		frame.setSize(400, 500);
		frame.add(button);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
