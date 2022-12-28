package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        classWork();
        homeWork();
    }

    static void classWork(){
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 30;
        arr[3] = 10;
        arr[4] = 12;

        System.out.println("[0]="+arr[0]);

        double[] d_arr = new double[20];
        for (int i = 0;i < d_arr.length;i++){
            d_arr[i] = Math.random();
        }


        for (int i = 0;d_arr.length > i;i++)
            System.out.println(d_arr[i]);

        String[] s_arr = {"John","Doe","Tester"};
        for (int i = 0;i < s_arr.length;i++)
            System.out.println(s_arr[i]);


        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i]> max) max = arr[i];

        System.out.println("max:"+max);

        for (int i :
                arr) {
            System.out.println(i);
        }
    }

    static void homeWork(){
        int len = 5;
        double[] number = new double[len];
        for (int i = 0; i < len; i++) {
            number[i] = Math.random();
        }

        int i = 0;
        double sum = 0,
                multiplier = 1;
        while (len > i){
            sum += number[i];
            i++;
        }

        for (int j = 0; j < len; j++) {
            multiplier *= number[j];
        }

        System.out.println(number[0]+"+"+number[1]+"+"+number[2]+"+"+number[3]+"+"+number[4]+"="+sum);
        System.out.println(number[0]+"*"+number[1]+"*"+number[2]+"*"+number[3]+"*"+number[4]+"="+multiplier);
    }
}
