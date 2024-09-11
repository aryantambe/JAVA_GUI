package JAVA_GUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class labels {
    public static void main(String[] args) {
        //Jlable--> a GUI display area for a string of text or image or both

        JLabel label=new JLabel(); //Creates a label
        ImageIcon img=new ImageIcon(labels.class.getResource("/deadpool.jpg"));//import an image
        Border border= BorderFactory.createLineBorder(Color.RED,3); //Creates a border
        label.setIcon(img); //sets image
        label.setText("Divya my sweet and only wife ");//set text of label
        label.setHorizontalTextPosition(JLabel.CENTER); //Puts the text LEFT,RIGHT OR CENTRE of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); //Puts the text BOTTOM OR CENTRE of ImageIcon
        label.setForeground(Color.RED);  //Sets the font colour of the text
        label.setFont(new Font("MV Boli",Font.BOLD,20));  //Sets the font of the text
        label.setIconTextGap(-5);  //Sets the gap between text and image
        label.setBackground(Color.BLACK); //sets the background color of label
        label.setOpaque(true); //by default it is false
        label.setBorder(border); //sets the border
        label.setVerticalAlignment(JLabel.CENTER); //sets vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//sets horizontal position of icon+text within label
       // label.setBounds(100,50,350,350);//set x and y positions within frame aswell as dimensions
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().setBackground(Color.BLACK);
       // frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
        frame.pack();
    }
}
