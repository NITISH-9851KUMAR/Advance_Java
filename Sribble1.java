package swingDemonstrate;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class Sribble1 extends Applet
implements MouseListener, MouseMotionListener{
	private int last_x, last_y;
	
	public void init() {
		this.addMouseListener(this); // add on Applet
		this.addMouseMotionListener(this); //add on Applet
	}
	
	public void mousePressed(MouseEvent e) { //MouseListener class
		last_x= e.getX();
		last_y= e.getY();
	}
	public void mouseDragged(MouseEvent e) { //MouseMotionListener class
		Graphics g= this.getGraphics();
		int x= e.getX(), y= e.getY();
		g.drawLine(last_x, last_y, x, y);
		last_x= x; last_y= y;
	}
	public void mouseClicked(MouseEvent e) { //MouseListener class
		showStatus("Mouse Clicked");
	}
	public void mouseMoved(MouseEvent e) {} //MouseMotionListener class
	public void mouseEntered(MouseEvent e) {}  //MouseListener class
	public void mouseExited(MouseEvent e) {}   //MouseListener class
	public void mouseReleased(MouseEvent e) {} //MouseListener class
}
