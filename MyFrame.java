package JAVA_GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setSize(420,420);//Sets the x and y dimension of the frame
        this.setTitle("Jframe Title goes here");//Sets the title of the frame
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //The default is hide on close
        //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Does nothing when you close
        this.setResizable(false); //Prevents frame from being resized
        this.setVisible(true);//makes frame visible
        ImageIcon img=new ImageIcon(Main.class.getResource("/deadpool.jpg")); //Get resource gives the correct path
        this.setIconImage(img.getImage());//change icon of the Jframe
        this.getContentPane().setBackground(Color.pink);//change the colour of the background(already present ones)
        this.getContentPane().setBackground(new Color(123,50,250));//insert rgb values(0 to 255)
    }
}
