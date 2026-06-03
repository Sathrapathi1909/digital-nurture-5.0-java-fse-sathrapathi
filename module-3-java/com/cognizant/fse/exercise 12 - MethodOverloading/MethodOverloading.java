public class MethodOverloading {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10.5, 20.5));
        System.out.println(obj.add(10, 20, 30));
    }
}