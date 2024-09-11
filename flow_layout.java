package JAVA_GUI;

import javax.swing.*;
import java.awt.*;

public class flow_layout {
    public static void main(String[] args) {
        //Flow layout--> places components in a row, sized at their preferred size
        //               If the horizontal space in the container is too small
        //               the Flowlayout class uses the next available row.

        JPanel panel=new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout()); //Panels actually use the flow layout as default!

        JFrame frame =new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); //Creating the new flow layout, with leading/trailing/center also creating spacing b/w them
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));

        frame.add(panel);

        frame.setVisible(true);

        
    }
}
