package swingDemonstrate;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FrameExample {
	public static void main(String[] args) {
		JFrame frame= new JFrame("JFrame Example");
		JPanel panel= new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label= new JLabel("JLabel Example");
		JButton button= new JButton("Button");
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		frame.setSize(300, 300);
		//frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
