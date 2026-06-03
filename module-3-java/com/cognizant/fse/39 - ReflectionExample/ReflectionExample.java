import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Student {

    public void displayDetails() {
        System.out.println("Student Details");
    }

    public void showMessage(String message) {
        System.out.println("Message: " + message);
    }
}

public class ReflectionExample {

    public static void main(String[] args) {

        try {

            Class<?> cls = Class.forName("Student");

            Method[] methods = cls.getDeclaredMethods();

            System.out.println("Methods and Parameters:");

            for (Method method : methods) {

                System.out.println("Method Name: " + method.getName());

                Parameter[] parameters = method.getParameters();

                for (Parameter parameter : parameters) {
                    System.out.println("Parameter Type: "
                            + parameter.getType().getSimpleName());
                }
            }

            Object obj = cls.getDeclaredConstructor().newInstance();

            Method method =
                    cls.getDeclaredMethod("displayDetails");

            method.invoke(obj);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}