package swingDemonstrate;

import javax.swing.*;

public class TableExample {
    JFrame frame;

    TableExample(){
        frame= new JFrame("Table Example");

        // Table Heading as column
        String column[]= {"PRN", "Name", "Grade"};

        // Table data
        String data[][]= {
                //PRN      Name    Grade
                {"31001", "Akash", "A"},
                {"31002", "Divyanshu", "B"},
                {"31003", "Ankush", "C"},
                {"31004", "Nitish", "D"}};


        JTable jt= new JTable(data, column); // Define Table
        // It is necessary to write first data of Table and second Column of Table
        jt.setBounds(30, 40, 100, 200);

        JScrollPane js= new JScrollPane(jt);
        // JScrollPane add the Column into column
        // If we don't use js into frame then we show only data of table

        frame.add(js);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }

    public static void main(String[] args) {
        new TableExample();
    }
}
