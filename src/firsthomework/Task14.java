package firsthomework;

//1.4
public class Task14 {
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    public static int fibonacci(int number) {
        int f1 = 1;
        int f2 = 1;
        for (int i = 3; i <= number; i++) {
            f2 = f2 + f1;
            f1 = f2 - f1;
        }
        return f2;
    }


    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(fibonacci(6));

    }
}
