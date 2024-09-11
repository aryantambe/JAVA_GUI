package JAVA_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Radioframe extends JFrame implements ActionListener{
    JRadioButton pizzaButton;
    JRadioButton burgerButton ;
    JRadioButton hotdogButton;
    Radioframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
         pizzaButton=new JRadioButton("Pizza");
         burgerButton=new JRadioButton("Burger");
         hotdogButton=new JRadioButton("Hotdog");
         pizzaButton.addActionListener(this);
         hotdogButton.addActionListener(this);
         burgerButton.addActionListener(this);

        ButtonGroup group=new ButtonGroup();
        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(hotdogButton);
        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton){
            System.out.println("You ordered pizza");
        } else if (e.getSource()==burgerButton) {
            System.out.println("You ordered burger");
        }
        else if(e.getSource()==hotdogButton){
            System.out.println("You ordered hotdog");
        }
        else if(e.getSource()==null){
            System.out.println("You dont want anything? Okay!");
        }
    }
}

public class radio_buttons {
    public static void main(String[] args) {
        //JRadioBuuttons- These are one or more buttons in a grouping in which only one can be selected per group
        new Radioframe();

        //You can also change the icon of the radio buttons using new imageIcon.
    }
}
