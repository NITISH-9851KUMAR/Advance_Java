package swingDemonstrate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordFieldExample{
	public static void main(String[] args) {
		JFrame f= new JFrame("Password Field Example");
		
		final JLabel userLabel= new JLabel();
		userLabel.setBounds(20, 150, 200, 50);

		final JLabel passLabel= new JLabel();
		passLabel.setBounds(20, 180, 200, 50);
		
		final JPasswordField value= new JPasswordField();
		value.setBounds(100, 75, 100,  30);
		
		JLabel l1= new JLabel("UserName:");
		l1.setBounds(20, 20, 80, 30);
		
		JLabel l2= new JLabel("Password:");
		l2.setBounds(20, 75, 80, 30);
		
		JButton b= new JButton("Login");
		b.setBounds(100, 120, 80, 30);
		
		final JTextField text= new JTextField();
		text.setBounds(100, 20, 100, 30);
		
		f.add(value); f.add(l1); f.add(userLabel); f.add(passLabel); f.add(l2);
		f.add(b); f.add(text);
		
		f.setSize(300, 300);
		f.setLayout(null);;
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Add action Listener
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user= "Username: "+text.getText();
				userLabel.setText(user);
				String pass= "Password: "+new String(value.getPassword());
				passLabel.setText(pass);
			}
		});
	}

}
