
package swingDemonstrate;

import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
public class JListExample {
    JListExample(){
        JFrame frame= new JFrame("JTable Example");

        DefaultListModel<String> l= new DefaultListModel<>();
        l.addElement("Applet");
        l.addElement("Mango");
        l.addElement("Banana");
        l.addElement("Guava");

        JList<String> list= new JList<>(l);
        list.setBounds(50, 100, 100, 75);

        frame.setSize(400, 400);
        frame.add(list);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JListExample();
    }
}
