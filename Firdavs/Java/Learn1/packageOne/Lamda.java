import java.util.ArrayList;
import java.util.function.Consumer;

public class Lamda {
    public static void main(String[] args) {
        StringLamda exclaim = str -> str+"!";
        StringLamda ask = str -> str+"?";
        printFormated("Hello",ask);
        printFormated("Hello",exclaim);
    }

    static void addLamda(){
        Consumer<Integer> print = n ->{function.write(n);};
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(11);
        nums.add(2);
        nums.add(33);
        nums.add(7);
        nums.forEach(print);
    }
    static void arr_forEach(){
        /*Integer int*/
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(7);
        nums.forEach(n -> {function.write(n);});
    }
    static void printFormated(String str,StringLamda format){
        String res = format.run(str);
        function.write(res);
    }
}

interface StringLamda{
    String run(String run);
}
