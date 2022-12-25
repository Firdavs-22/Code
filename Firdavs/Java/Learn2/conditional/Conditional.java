package conditional;

import javax.swing.*;

public class Conditional {
    public static void main(String[] args) {
        /*int a = 7, b = 9;
        if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a >= b");
        }

        String str = a < b ? "a < b": "a >= b";
        System.out.println(str);

        System.out.println(a < b ? "a < b": "a >= b");

        int age = 25;
        if (age > 18) System.out.println("Big man");

        String in;
        in = JOptionPane.showInputDialog(null,"please enter number",JOptionPane.QUESTION_MESSAGE);

        if (in != null && !in.equals("")){
            double n = Double.parseDouble(in);
            if (n > 0) System.out.println("Positive number");
            else if (n == 0) System.out.println("0");
            else System.out.println("Negative number");
        } else {
            System.out.println("Error NaN");
        }*/

        String questOneJOption = JOptionPane.showInputDialog(null,"Enter Positive Number");
        double questOneNumber = 0;
        if (questOneJOption != null && !questOneJOption.equals("")){
            questOneNumber = Double.parseDouble(questOneJOption);
            if (questOneNumber > 0) System.out.println("good");
            else System.out.println("bad");
        }else {
            JOptionPane.showMessageDialog(null,"NaN");
        }

        String questTwoJoption = JOptionPane.showInputDialog(null,"Enter not 0 number");
        if (questTwoJoption != null && !questTwoJoption.equals("")){
            double questTwoNumber = Double.parseDouble(questTwoJoption);
            if (questTwoNumber != 0) JOptionPane.showMessageDialog(null,  questOneNumber /questTwoNumber);
            else JOptionPane.showMessageDialog(null,"Infinite");
        }else{
            JOptionPane.showMessageDialog(null,"NaN");
        }


    }
}
