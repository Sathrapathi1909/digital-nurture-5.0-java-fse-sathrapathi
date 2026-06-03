import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
