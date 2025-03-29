package swingDemonstrate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class ButtonImage {
	public static void main(String[] args) {
JFrame frame= new JFrame("Button Action Listener");
		
		JButton b= new JButton("Click");
		b.setBounds(50, 100, 80, 30);
		
		JButton iB= new JButton(new ImageIcon("N:\\photo.png"));
		iB.setBounds(50, 150, 200, 40);
		iB.setVisible(false);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iB.setVisible(true);
			}
		});
		
		frame.add(b);
		frame.add(iB);
		frame.setSize(300, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
