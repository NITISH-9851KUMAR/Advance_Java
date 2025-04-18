package swingDemonstrate;

import javax.swing.JPopupMenu;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PopupMenuExample {
    PopupMenuExample(){
        final JFrame frame= new JFrame("PopupMenu Example");

        final JPopupMenu popupMenu= new JPopupMenu("Edit");

        JMenuItem cut= new JMenuItem("Cut");
        JMenuItem copy= new JMenuItem("Copy");
        JMenuItem paste= new JMenuItem("Paste");

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        frame.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                popupMenu.show(frame, e.getX(), e.getY());
            }
        });

        frame.add(popupMenu);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PopupMenuExample();
    }
}
