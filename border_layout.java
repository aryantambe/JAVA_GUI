package JAVA_GUI;

import javax.swing.*;
import java.awt.*;

public class border_layout {
    public static void main(String[] args) {
        //Layout Manager--> Defines the natural layout of components within a container
        //3 common managers--> Flow layout, Border Layout, Grid Layout
        //BorderLayout--> A BorderLayout places components in five areas: NORTH,SOUTH,EAST,WEST,CENTER
        //                All extra space is placed in the center area

        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10,10)); //Creating a border layout for my panels with a margin 10X10

        JPanel panel1 =new JPanel();
        JPanel panel2 =new JPanel();
        JPanel panel3 =new JPanel();
        JPanel panel4 =new JPanel();
        JPanel panel5 =new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.magenta);
        panel3.setBackground(Color.cyan);
        panel4.setBackground(Color.black);
        panel5.setBackground(Color.yellow);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);

        //We can also have panels in panels i.e sub panels




    }
}
