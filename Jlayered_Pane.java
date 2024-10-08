package JAVA_GUI;

import javax.swing.*;
import java.awt.*;

public class Jlayered_Pane {
    public static void main(String[] args) {
        //JLayeredPane--> Swing container that provides a third dimension for positioning components
        //                ex- depth,Z-index
        JLabel label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        JLabel label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);

        JLabel label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane=new JLayeredPane(); //creates a new layered pane
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1,Integer.valueOf(0)); //The number 0 here means the layer on which we want the pane to be on
        layeredPane.add(label2,Integer.valueOf(1)); // Higher the number, the more outer or upward the pane will be
        layeredPane.add(label3,Integer.valueOf(2));
        JFrame frame=new JFrame("Jlayered Pane");
        frame.add(layeredPane);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
