package JAVA_GUI;

import javax.swing.*;
import java.awt.*;

public class grid_layout {
    public static void main(String[] args) {
        //Grid Layout--> Places components in a grid of cells (rows & columns)
        //               Each component takes all available space within its cell
        //               And also each cell is of the same size
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3,5,5)); //Creating a new grid layout with specified number of rows and colums and gaping
        for(int i=1;i<10;i++){
            JButton button =new JButton(String.valueOf(i));
            button.setFocusable(false);
            frame.add(button);
        }



        frame.setVisible(true);

    }
}
