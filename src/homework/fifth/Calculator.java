package homework.fifth;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private static Map<Character, Calculation> operations = new HashMap<>();

    static {
        operations.put('+', (a, b) -> a + b);
        operations.put('-', (a, b) -> a - b);
        operations.put('*', (a, b) -> a * b);
        operations.put('/', (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Division by zero");
            }
            return a / b;
        });
        operations.put('^', Math::pow);
        operations.put('v', (a, b) -> Math.pow(a, 1.0 / b));
        operations.put('#', (a, b) -> Math.pow((double) (a + b) / (a + 117), b));
    }

    public static double calculate(int a, char x, int b) {
        if (!operations.containsKey(x)) {
            throw new IllegalArgumentException("Invalid operation");
        }
        return operations.get(x).calculate(a, b);
    }

}
