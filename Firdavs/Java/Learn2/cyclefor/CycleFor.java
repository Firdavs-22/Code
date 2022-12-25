package cyclefor;

import javax.swing.*;

public class CycleFor {
    public static void main(String[] args) {
        classWork();
        homeWork();
    }

    static void homeWork(){
        String positiveJOption = JOptionPane.showInputDialog(null,"Enter positive number",JOptionPane.QUESTION_MESSAGE);
        if (positiveJOption != null && !positiveJOption.equals("")){
            double positive = Double.parseDouble(positiveJOption);
            if (positive > 0 && (int) positive == positive){
                int sum = 0;
                for (int i = 1; i <= positive; i++){
                    sum += i;
                }
                JOptionPane.showMessageDialog(null,sum);
            }else {
                JOptionPane.showMessageDialog(null,"Not a Positive Number");
            }
        }else {
            JOptionPane.showMessageDialog(null,"NaN");
        }
    }

    static void classWork(){
        for (int i = 0; i < 100; i++){
            System.out.print(i + "-");
        }

        System.out.println();

        for (int i = 0; i < 100;i++)
            if (i % 2 == 0) System.out.print(i + "-");


        System.out.println();

        int sum = 0,
                n = 10;
        for (int i = 0; i <= n; i += 2)
            sum += i;
        System.out.println(sum);
    }
}
