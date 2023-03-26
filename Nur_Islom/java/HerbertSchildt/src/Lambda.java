import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        numbers.sort((a, b) -> a.compareTo(b));
        System.out.println(numbers);
    }
}