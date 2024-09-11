package JAVA_GUI;

import javax.swing.*;
import java.awt.*;

public class panels {
    public static void main(String[] args) {
        //Jpanel--> It is a GUI component that functions as a container to hold other components
        JLabel label=new JLabel("Hey");
        ImageIcon img=new ImageIcon(panels.class.getResource("/deadpool.jpg"));
        label.setIcon(img);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel GreenPanel=new JPanel();
        GreenPanel.setBackground(Color.GREEN);
        GreenPanel.setBounds(0,250,500,250);

        JPanel BLuePanel=new JPanel();
        BLuePanel.setBackground(Color.BLUE);
        BLuePanel.setBounds(250,0,250,250);

        JPanel RedPanel=new JPanel();
        RedPanel.setBackground(Color.RED);
        RedPanel.setBounds(0,0,250,250);
        GreenPanel.setLayout(new BorderLayout());


        JFrame frame=new JFrame();
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(RedPanel);
        frame.add(BLuePanel);
        frame.add(GreenPanel);
        RedPanel.add(label);
        BLuePanel.add(label);
        GreenPanel.add(label);
    }
}
