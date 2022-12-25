package cyclewhile;

import javax.swing.*;

public class CycleWhile {
    public static void main(String[] args) {
        classWork();
        homeWork();
    }

    static void classWork(){
        int i = 0;
        while (i < 100){
            System.out.print(i + "-");
            i++;
        }

        System.out.println();

        String input;
        input = JOptionPane.showInputDialog(null,"Enter Positive Number",JOptionPane.QUESTION_MESSAGE);
        if (input != null && !input.equals("")) {
            int number = Integer.parseInt(input);
            if (number < 0){
                JOptionPane.showMessageDialog(null,"Not a Positive Number");
            } else {
                int summa = 0;
                i = 1;
                while (i <= number) summa += i++;
                JOptionPane.showMessageDialog(null,summa);
            }
        }else {
            JOptionPane.showMessageDialog(null,"NaN");
        }


    }

    static void homeWork(){
        String inputNumber = JOptionPane.showInputDialog(null,"Enter not negative number",JOptionPane.QUESTION_MESSAGE);
        if (inputNumber != null && !inputNumber.equals("")){
            double number = Double.parseDouble(inputNumber);
            if (number >= 0 && (int) number == number) {
                int factorial = 1,
                    i = 0;
                while (i < number) factorial *= ++i;
                JOptionPane.showMessageDialog(null,factorial);
            }else {
                JOptionPane.showMessageDialog(null,"Entered incorrect");
            }
        } else {
            JOptionPane.showMessageDialog(null,"NaN");
        }
    }
}
