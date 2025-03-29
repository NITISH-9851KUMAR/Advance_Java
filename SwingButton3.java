package swingDemonstrate;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingButton3 extends JFrame {
	
	SwingButton3(){
		JButton button= new JButton("Click");
		button.setBounds(100, 100, 100, 30);
		
		add(button);
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingButton3();
	}

}
