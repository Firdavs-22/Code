package cycledowhile;

import javax.swing.*;

public class CycleDoWhile {
    public static void main(String[] args) {
        classWork();
        homeWork();
    }

    static void classWork(){
        int a = 5;
        while (a > 10) System.out.println("We in cycle while");

        do {
            System.out.println("We in cycle do while");
        }while (a > 10);

        a = 0;
        while (true){
            if (++a == 10) break;
            if (a % 2 == 0) continue;
            System.out.print(a+"-");
        }
    }

    static void homeWork(){
        String inputPositive;
        double number;
        boolean isCorrect = false;
        do {
            inputPositive = JOptionPane.showInputDialog(null,"Enter positive number",JOptionPane.QUESTION_MESSAGE);
            if (inputPositive != null && !inputPositive.equals("")){
                number = Double.parseDouble(inputPositive);
                if ((int) number == number && number > 0){
                    isCorrect = true;
                    JOptionPane.showMessageDialog(null,"Thanks");
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect");
                }
            }else {
                JOptionPane.showMessageDialog(null,"NaN");
            }
        } while (!isCorrect);
    }
}
