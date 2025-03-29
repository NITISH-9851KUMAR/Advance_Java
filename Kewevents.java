package swingDemonstrate;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Kewevents extends Applet 
implements KeyListener{
	String msg= "";
	int x= 10, y= 20; //output coordinates 
	public void init() {
		addKeyListener(this);
		requestFocus(); // request focus
	}
	public void keyPressed(KeyEvent ke) {
		showStatus("Key Down");
	}
	public void keyReleased(KeyEvent ke) {
		showStatus("Key Up");
	}
	public void keyTyped(KeyEvent ke) {
		msg += ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g) { //Display the keystores
		g.drawString(msg, x, y);
	}

}
