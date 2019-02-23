package firsthomework;
//1.4
public class Task14 {
    public static void factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("Факториал " + number + " равен " + result);
    }

    public static void fibonacci(int number) {
        int f1 = 1;
        int f2 = 1;
        for (int i = 3; i <= number; i++) {
            f2 = f2 + f1;
            f1 = f2 - f1;
        }
            System.out.println(f2);
    }


    public static void main(String[] args) {
        factorial(6);
        for (int i = 0; i < 10; i++) {
            fibonacci(i);
        }
    }
}
