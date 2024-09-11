package JAVA_GUI;

import javax.swing.*;

public class JoptionPane {
    public static void main(String[] args) {
        //JpotionPane--> pop a standard dialogue box that prompts the user for a value or
        //               informs them of something

//       JOptionPane.showMessageDialog(null,"This is some info","Title",JOptionPane.PLAIN_MESSAGE);
//       JOptionPane.showMessageDialog(null,"This is some info","Title",JOptionPane.INFORMATION_MESSAGE);
//       JOptionPane.showMessageDialog(null,"WTF??","Title",JOptionPane.QUESTION_MESSAGE);
//      while (true){
//          JOptionPane.showMessageDialog(null,"Warning","Title",JOptionPane.WARNING_MESSAGE);
//        }
//        JOptionPane.showMessageDialog(null,"CRITICAL ERROR","Title",JOptionPane.ERROR_MESSAGE);

                String answer = JOptionPane.showInputDialog("Are you ready for the question?");
                while(answer == null || !answer.equalsIgnoreCase("yes")) {
                    answer = JOptionPane.showInputDialog("Are you ready for the question?");
                }

                // Second question: Keep asking until the user gives a non-cancel answer
                int ans = JOptionPane.showConfirmDialog(null, "DO YOU LOVE ARYAN?", "Answer the following", JOptionPane.YES_NO_CANCEL_OPTION);
                while (ans == JOptionPane.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(null, "You cannot ignore this question");
                    ans = JOptionPane.showConfirmDialog(null, "DO YOU LOVE ARYAN?", "Answer the following", JOptionPane.YES_NO_CANCEL_OPTION);
                }

                // Handle the answer to the second question
                if (ans == JOptionPane.YES_OPTION) {
                    System.out.println("Good choice");
                } else if (ans == JOptionPane.NO_OPTION) {
                    System.out.println("Get lost");
                } else if (ans == JOptionPane.CLOSED_OPTION) {
                    System.out.println("WTF?");
                }
                String[] responses={"AWW","LOVE YOU MORE!","HEHE"};
                JOptionPane.showInternalOptionDialog(null,"I LOVE YOU TOO!",
                        "ARYAN:",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                 null,responses,0);
            }
        }





