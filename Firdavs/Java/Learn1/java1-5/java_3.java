public class java_3 {
    public static void main(String[] args){
        boolean cond = true;
        System.out.println(cond ? "Yes" : "no");

        int i = 1;
        while(i < 10){
            System.out.print(i);
            i++;
        }
        System.out.println();

        int j = 2;
        do {
            System.out.print(j);
            j++;
        }while (j == 1);
        System.out.println();

        for (int loop_1 = 0;loop_1 < 10;loop_1++){
            System.out.print(loop_1);
        }
        System.out.println();

        String[] arrs = {"a","ab"};
        for (String arr : arrs){
            System.out.print(arr);
        }
    }
}
