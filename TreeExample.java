package swingDemonstrate;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.*;

public class TreeExample {
    JFrame f;
    TreeExample(){
        f= new JFrame();

        DefaultMutableTreeNode style= new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color= new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font= new DefaultMutableTreeNode("Font");

        // Style is root node
        // and has two child node color and font
        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red= new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue= new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode black= new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode green= new DefaultMutableTreeNode("green");

        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);

        JTree jt= new JTree(style); // Actual JTree is created

        f.add(jt);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TreeExample();
    }
}
