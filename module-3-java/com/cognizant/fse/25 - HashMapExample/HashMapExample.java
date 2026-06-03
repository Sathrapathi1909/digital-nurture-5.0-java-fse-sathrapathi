import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Arun");
        students.put(102, "Vijay");
        students.put(103, "Kumar");

        System.out.println(students.get(102));
    }
}
