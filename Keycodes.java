package swingDemonstrate;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Keycodes extends Applet 
implements KeyListener{
	String msg= ""; int x= 10, y= 20;
	
	public void init() {
		resize(500, 500);
		addKeyListener(this);
		requestFocus();
	}
	//when key pressed this function called 
	public void keyPressed(KeyEvent ke) {
		showStatus("Key down");
		int key= ke.getKeyCode();
		switch(key) {
			case KeyEvent.VK_F1:
				msg += "<F1>";
			break;
			
			case KeyEvent.VK_F2:
				msg += "<F2>";
			break;
			
			case KeyEvent.VK_F3:
				msg += "<F3>";
			break;
			
			case KeyEvent.VK_PAGE_DOWN:
				msg += "<PgDn>";
			break;
			
			case KeyEvent.VK_PAGE_UP:
				msg += "<PgUp>";
			break;
			
			case KeyEvent.VK_LEFT:
				msg += "<Left Arrow>";
			break;
		
			case KeyEvent.VK_RIGHT:
				msg += "<Right Arrow>";
			break;
			
			case KeyEvent.VK_DOWN:
				msg += "<Down Arrow>";
			break;
			
			case KeyEvent.VK_UP:
				msg += "<Up Arrow>";
			break;
				
		}
		repaint();	
	}
	public void keyReleased(KeyEvent ke) {
		showStatus("Key UP");
	}
	public void keyTyped(KeyEvent ke) {
		msg += ke.getKeyChar();
	}
	public void paint(Graphics g) {
		g.drawString(msg, x, y);
	}

}
