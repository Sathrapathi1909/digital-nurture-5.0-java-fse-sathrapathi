import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpressions {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Arun");
        names.add("Vijay");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}
