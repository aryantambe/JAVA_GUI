package JAVA_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class frame1 extends JFrame implements ActionListener{
    JButton button;
    JTextField textField;
    frame1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button=new JButton("Submit");
        button.addActionListener(this);
        textField=new JFormattedTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("MV Boli",Font.BOLD,40));
        textField.setForeground(Color.green);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.RED);
        textField.setText("Username");
        this.add(button);
        this.add(textField);
        this.pack();
        this.setBackground(Color.BLACK);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            if(textField.getText().isBlank()){
                System.out.println("You haven't entered anything ");
            }
            else{
                System.out.println(textField.getText());
                textField.setEditable(false); //does let you edit after submitted once
                button.setEnabled(false);


            }
        }
    }
}


public class textfield_java {
    public static void main(String[] args) {

        //JTextField--> A GUI textbox component that can be used to add, set or get text.

        frame1 frame=new frame1();
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
        
    }
}
