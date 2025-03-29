package swingDemonstrate;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class OptionPaneExample {
    JFrame f;
    OptionPaneExample(){
        f= new JFrame("OptionPane Example");

        //JOptionPane it is like a popup message
        JOptionPane.showMessageDialog(f,"Hello, Welcome to Java Programming Course.");
        //JOptionPane.showMessageDialog(f, "Welcome in This Course");
    }
    public static void main(String[] args) {
        new OptionPaneExample();
    }
}
