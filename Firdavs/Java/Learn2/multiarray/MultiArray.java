package multiarray;

public class MultiArray {
    public static void main(String[] args) {
        classWork();
        homeWork();
    }

    static void classWork(){
        char[][] arr = new char[2][2];
        arr[0][0] = 'a';
        arr[0][1] = 'c';
        arr[1][0] = 'b';
        arr[1][1] = 'd';

        for (int i = 0,len_i = arr.length; i < len_i; i++) {
            System.out.println(arr[i]);
            for (int j = 0, len_j = arr[i].length; j < len_j; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }

        int[][] table = new int[9][9];
        for (int i = 0,len_i = table.length;i < len_i;i++){
            for (int j = 0,len_j = table[i].length; j < len_j; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("   1  2  3  4  5  6  7  8  9");
        for (int i = 0,len_i = table.length; i < len_i; i++) {
            System.out.print(i+1+"  ");
            for (int j = 0,len_j = table[i].length; j < len_j; j++) {
                System.out.print(table[i][j] + (table[i][j] < 10 ? "  " : " " ));
            }
            System.out.println();
        }
    }

    static void homeWork(){
        int[][] multi_arr = {
                {1, 2},
                {2, 3}
        };

        int sum = 0,
            arr_sum = 0;
        String sum_view = "";
        int[] arr = new int[2];
        for (int i = 0,len_i = multi_arr.length; i < len_i; i++) {
            for (int j = 0,len_j = multi_arr[i].length; j < len_j; j++) {
                sum_view += (len_i-1 == i && len_j-1 == j) ? multi_arr[i][j]+" = " : multi_arr[i][j]+" + ";
                sum += multi_arr[i][j];
                arr_sum += multi_arr[i][j];
                if (len_j - 1 == j){
                    arr[i] = arr_sum;
                    arr_sum = 0;

                }
            }
        }
        System.out.println(sum_view+sum);
        System.out.println("arr[0] = "+arr[0]+"\narr[1] = "+arr[1]);



    }
}
