package swingDemonstrate;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class JMenuExample {
    JMenu menu, subMenu;
    JMenuExample(){
        JFrame f= new JFrame("JMenu Example");

        JMenuBar menuBar= new JMenuBar(); // It is Main JMenuBar, through which all Menu will visible on screen
        menuBar.setBounds(10, 10, 100, 100);


        JMenu menu1= new JMenu("Menu1");
        JMenu menu2= new JMenu("Menu2");
        JMenu menu3= new JMenu("Menu3");



        // Add Some Item in menu1
        JMenuItem i1= new JMenuItem("Item 1");
        JMenuItem i2= new JMenuItem("Item 2");
        JMenuItem i3= new JMenuItem("Item 3");
        JMenuItem i4= new JMenuItem("Item 4");

        // Add Item in menu1
        menu1.add(i1);
        menu1.add(i2);
        menu1.add(i3);
        menu1.add(i4);

        // Add Item in menu2

        JMenuItem f1= new JMenuItem("Mango");
        JMenuItem f2= new JMenuItem("Apple");
        JMenuItem f3= new JMenuItem("Banana");
        JMenuItem f4= new JMenuItem("Guava");

        menu2.add(f1);
        menu2.add(f2);
        menu2.add(f3);
        menu2.add(f4);

        //Add MenuItem in menu3
        JMenuItem v1= new JMenuItem("Potato");
        JMenuItem v2= new JMenuItem("Tomato");
        JMenuItem v3= new JMenuItem("Grapes");
        JMenuItem v4= new JMenuItem("Brinjal");
        menu3.add(v1);
        menu3.add(v2);
        menu3.add(v3);
        menu3.add(v4);

        // Add subMenu under Menu

        JMenuItem si1= new JMenuItem("Sum Menu Item1");
        subMenu= new JMenu("Submenu");
        subMenu.add(si1);
        menu3.add(subMenu);

        menuBar.add(menu1); // all Menu appear in MenuBar
        menuBar.add(menu2); // all Menu appear in MenuBar
        menuBar.add(menu3); // all Menu appear in MenuBar

        f.setJMenuBar(menuBar); // Now finally JMenuBar add on Frame

        f.setLayout(null);
        f.setSize(500, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JMenuExample();
    }
}
