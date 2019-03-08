package homework.fifth;

import java.util.Scanner;
import java.util.Set;

public class CalculatorInputReader {
    private static Scanner sc = new Scanner(System.in);

    public static int readNumber() {
        System.out.println("Enter number: ");
        Integer number = null;
        while (number == null) {
            try {
                String numberStr = sc.nextLine();
                number = Integer.parseInt(numberStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Try again");
            }
        }
        return number;
    }

    public static char readChar() {
        System.out.println("Enter the operation: ");
        Character operation = null;
        while (operation == null) {
            try {
                String simbolStr = sc.nextLine();
                if (simbolStr.length() == 1) {
                    operation = simbolStr.charAt(0);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Try again");
            }
        }
        return operation;
    }

}
