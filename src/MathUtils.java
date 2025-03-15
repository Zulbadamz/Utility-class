public class MathUtils {
    // Addition Method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction Method
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication Method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division Method with error handling for division by zero
    public static double divide(int a, int b) {
        if (b == 0) {
            return Double.NaN; // Error handling for division by zero
        }
        return (double) a / b;
    }
}
