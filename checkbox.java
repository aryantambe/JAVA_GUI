package JAVA_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class frame_for_checkbox extends JFrame implements ActionListener{
    JButton button;
    JCheckBox checkBox;
    frame_for_checkbox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button=new JButton();
        button.setText("Submit");
        button.addActionListener(this);

         checkBox=new JCheckBox("I am not a robot");//Create a checkbox
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas ",Font.PLAIN,35));
        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
    }
}
public class checkbox {
    public static void main(String[] args) {
        //JCheckBox- It is a GUI component that can be selected or deselected
        new frame_for_checkbox();
        //We can also change the icon of the checkbox and make it change for selected or deselected
    }
}
