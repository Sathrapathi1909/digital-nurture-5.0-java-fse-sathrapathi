import java.util.List;

record Person(String name, int age) {}

public class PersonRecord {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Arun", 20),
                new Person("Vijay", 17),
                new Person("Kumar", 25)
        );

        people.stream()
                .filter(person -> person.age() >= 18)
                .forEach(System.out::println);
    }
}
