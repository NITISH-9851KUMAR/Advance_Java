package swingDemonstrate;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Sribble2 extends Applet implements MouseListener{
	private int last_x, last_y; // store last mouse position
	private Color current_color= Color.black; //store the current color
	private Button clear_button; //The clear button
	private Choice color_choice; //The color dropdown list
	
	//This method is called to initialize the applet.
	//Applets don't have a main() mehtod
	public void init() {
		addMouseListener(this);
		this.setSize(300, 300); // size of Applet
		//set the background color
		this.setBackground(Color.white);
		
		//Create a button and add it to the applet. Set the buttons' color
		clear_button= new Button("Clear");
		clear_button.setForeground(Color.black);
		clear_button.setBackground(Color.lightGray);
		this.add(clear_button);
		
		//Create a menu of colors and add it to the Applet.
		//Also set the menu's colors and add a label
		color_choice= new Choice();
		color_choice.addItem("black");
		color_choice.addItem("red");
		color_choice.addItem("yellow");
		color_choice.addItem("green");
		color_choice.addItem("gray");
		color_choice.setForeground(Color.black);
		color_choice.setBackground(Color.lightGray);
		this.add(new Label("Color: "));
		this.add(color_choice);
	}
	
	//This method is called When the user clicks the mouse to start a scrible
	public boolean mouseDown(Event e, int x, int y) {
		last_x= x;
		last_y= y;
		return true;
	}
	
	
	//This method is called when the user drags the mouse
	public boolean mouseDrag(Event e, int x, int y) {
		Graphics g= this.getGraphics();
		g.setColor(current_color); // set the current color for drawing
		g.drawLine(last_x, last_y, x, y);
		last_x= x;
		last_y= y;
		return true;
	}
	public void mouseClicked(MouseEvent e) {
		showStatus("Mouse Clicked!");
	}
	public void mouseEntered(MouseEvent e) {}  //MouseListener class
	public void mouseExited(MouseEvent e) {}   //MouseListener class
	public void mouseReleased(MouseEvent e) {} //MouseListener class
	public void mousePressed(MouseEvent e) {} //MouseListener class
	
	//This method is called when the user clicks the button or chosen  a color
	public boolean action(Event event, Object arg) {
		//if the Clear button was clicked on, handle it.
		if(event.target == clear_button) {
			Graphics g= this.getGraphics();
			Rectangle r= this.bounds();
			g.setColor(this.getBackground());
			g.fillRect(r.x,  r.y, r.width, r.height);
			return true;
		}
		//Otherwise if a color was chosen, handle that
		else if(event.target==color_choice) {
			if(arg.equals("black")) current_color= Color.black;
			else if(arg.equals("red")) current_color= Color.red;
			else if(arg.equals("yellow")) current_color= Color.yellow;
			else if(arg.equals("green")) current_color= Color.green;
			else if(arg.equals("gray")) current_color= Color.gray;
			return true;
		}
		//Otherwise, let the superclass handle it
		else return super.action(event, arg);
	}
}
