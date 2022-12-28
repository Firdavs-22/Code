package switchcase;

import javax.swing.*;

public class SwitchCase {
    public static void main(String[] args) {
        classWork();
        homeWork();
    }

    static void classWork(){
        int a = 1;
        String s;
        while (true){
            switch (a){
                case 1:
                    s = "one";
                    break;
                case 2:
                    s = "two";
                    break;
                case 3:
                    s = "three";
                    break;
                default:
                    s = "another number";
            }
            System.out.println(s);
            a++;
            if (a > 4) break;
        }



    }

    static void homeWork(){
        String inputFirstNumber = JOptionPane.showInputDialog(null,"Please enter first number"),
                inputLastNumber = JOptionPane.showInputDialog(null,"Please enter last number"),
                inputOperation = JOptionPane.showInputDialog(null,"Please enter operation(+,-,*,/)");
        if (
                inputOperation != null && inputFirstNumber != null && inputLastNumber != null &&
                !inputOperation.equals("") && !inputFirstNumber.equals("") && !inputLastNumber.equals("")
        ){
            double firstNumber = Double.parseDouble(inputFirstNumber),
            lastNumber = Double.parseDouble(inputLastNumber);
            String output = firstNumber + " " + inputOperation + " " + lastNumber + " = ";
            switch (inputOperation){
                case "+":
                    JOptionPane.showMessageDialog(null,output+(firstNumber+lastNumber));
                    break;
                case "-":
                    JOptionPane.showMessageDialog(null,output+(firstNumber-lastNumber));
                    break;
                case "*":
                    JOptionPane.showMessageDialog(null,output+(firstNumber*lastNumber));
                    break;
                case "/":
                    JOptionPane.showMessageDialog(null,output+(firstNumber/lastNumber));
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Incorrect Operation");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Incorrect Entered");
        }
    }
}
