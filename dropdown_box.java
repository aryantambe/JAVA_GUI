package JAVA_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ComboBox extends JFrame implements ActionListener{
    JComboBox comboBox;
    ComboBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String[] animals={"dog","cat","lion","tiger"}; //String array for the dropdown list
        comboBox=new JComboBox(animals);
        comboBox.addItem("MEGATRON");//inserts item
        comboBox.insertItemAt("zebra",1);//inserts item on a particular index
        comboBox.setSelectedIndex(0); //This sets the first index as the selected item when we run the program
      //  comboBox.removeItem("lion");
       // comboBox.removeItemAt(4);
       // comboBox.removeAllItems(); //Removes everything
        comboBox.addActionListener(this);
        comboBox.setEditable(true); //Lets me edit the textbox and create a new item (with index -1)
        System.out.println(comboBox.getItemCount());
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println("The index number of the selected item is "+comboBox.getSelectedIndex()+" And the name is "+comboBox.getSelectedItem());
        }
    }
}
public class dropdown_box {
    public static void main(String[] args) {
        //JComboBox--> A component that combines a button or editable field and a drop-down list
        new ComboBox();
        //To add integer as the datatype for the array, we have to use wrapper classes as JComboBox  accepts only objects
        //So for example if i want to add integers then,
        //Integer[] arr={1,2,3};
        //Double[] arr{1.2,1.3,44.5}
    }
}
