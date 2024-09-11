package JAVA_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class frame_for_button_class extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    frame_for_button_class(){
        ImageIcon img=new ImageIcon(frame_for_button_class.class.getResource("/deadpool2.jpg"));
        label=new JLabel();
        label.setIcon(img);
        label.setBounds(150,250,150,150);
        label.setVisible(false);



        ImageIcon icon=new ImageIcon(frame_for_button_class.class.getResource("/deadpool.jpg"));
        button=new JButton();
        button.setBounds(10,10,300,200);
        button.addActionListener(this); //Adds tbe action listener
        button.setText("I am a button");
        button.setFocusable(false); //Removes the extra border around the text of the button
        button.setIcon(icon);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("MV Boli",Font.BOLD,20));
        button.setForeground(Color.red);
        button.setBackground(Color.BLACK);
        button.setBorder(BorderFactory.createEtchedBorder());
        //   button.setEnabled(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){ //Tells what to do when the button is triggered
            System.out.println("You just pressed me!");
            button.setEnabled(false); //clickable only once now
            label.setVisible(true);
        }
    }
}

public class buttons {
    public static void main(String[] args) {
        //Jbutton --> It is a button that performs an action when clicked on
        new frame_for_button_class();
    }
}
