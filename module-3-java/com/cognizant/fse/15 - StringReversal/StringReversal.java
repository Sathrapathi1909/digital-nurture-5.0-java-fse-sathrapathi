import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        StringBuilder result = new StringBuilder(text);

        System.out.println("Reversed String: " + result.reverse());
    }
}
