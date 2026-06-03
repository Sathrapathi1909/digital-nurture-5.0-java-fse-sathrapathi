import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Vijay");
        students.add("Kumar");

        for (String student : students) {
            System.out.println(student);
        }
    }
}