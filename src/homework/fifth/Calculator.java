package homework.fifth;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<Character, Calculation> operations = new HashMap<>();

    public Calculator() {
        operations.put('+', (a, b) -> a + b);
        operations.put('-', (a, b) -> a - b);
        operations.put('*', (a, b) -> a * b);
        operations.put('/', (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Division by zero");
            }
            return a / b;
        });
        operations.put('^', (a, b) -> Math.pow(a, b));
        operations.put('v', (a, b) -> Math.pow(a, 1.0 / b));
        operations.put('#', (a, b) -> Math.pow((double) (a + b) / (a + 117), b));
    }

    public double calculation(int a, char x, int b) {
        if (!operations.containsKey(x)) {
            throw new IllegalArgumentException("Invalid operation");
        }
        return operations.get(x).calculate(a, b);
    }

}
