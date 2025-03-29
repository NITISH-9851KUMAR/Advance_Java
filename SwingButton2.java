package swingDemonstrate;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class SwingButton2 {
	
	SwingButton2(){
		JFrame frame= new JFrame("Swing Button Example");
		JButton button= new JButton("Click");
		button.setSize(200,  200);
		
		frame.setSize(400, 500);
		frame.add(button);
		frame.setLayout(null);
		frame.setLayout(new BorderLayout());
		frame.add(button, BorderLayout.CENTER);  // Add button to the center
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingButton2(); // Calling the constructors 
	}

}
