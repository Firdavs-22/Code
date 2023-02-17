import java.util.Arrays;

public class SortCommandLine {
    public static void main(String[] args) {
        int[] sort = new int[args.length];
        for (int i = 0, len = args.length; i < len; i++) {
            sort[i] = Integer.parseInt(args[i]);
        }
        int tmp = 0;
        for (int i = 0,len = sort.length; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (sort[i] > sort[j]) {
                    tmp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = tmp;
                }
            }
        }

        for (int i :sort) {
            System.out.println(i);
        }
    }
}
