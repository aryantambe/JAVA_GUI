package JAVA_GUI;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Jframe-> A GUI window to add components to
//        JFrame frame=new JFrame(); //Creates a frame
//        frame.setSize(420,420);//Sets the x and y dimension of the frame
//        frame.setTitle("Jframe Title goes here");//Sets the title of the frame
//       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //The default is hide on close
//      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Does nothing when you close
//        frame.setResizable(false); //Prevents frame from being resized
//        frame.setVisible(true);//makes frame visible
//        ImageIcon img=new ImageIcon(Main.class.getResource("/deadpool.jpg")); //Get resource gives the correct path
//        frame.setIconImage(img.getImage());//change icon of the Jframe
//        frame.getContentPane().setBackground(Color.pink);//change the colour of the background(already present ones)
 //       frame.getContentPane().setBackground(new Color(123,50,250));//insert rgb values(0 to 255)
        MyFrame newFrame=new MyFrame();

    }
}