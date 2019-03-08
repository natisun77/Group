package homework.fifth;

import static homework.fifth.Calculator.*;

public class MainCalculator {

    public static void main(String[] args) {

        System.out.println("To exit calculator input the sign '!'");

        char operation;
        while ((operation = CalculatorInputReader.readChar()) != '!') {
            try {
                int a = CalculatorInputReader.readNumber();
                int b = CalculatorInputReader.readNumber();

                System.out.println("Your result is " + calculate(a, operation, b));
            } catch (IllegalArgumentException e) {
                System.out.println("Calculator doesn't support such operation");
            }
        }
    }

}
