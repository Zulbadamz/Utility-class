public class TestMathUtils {
    public static void main(String[] args) {
        // Testing Addition
        System.out.println("Addition of 5 and 3: " + MathUtils.add(5, 3));

        // Testing Subtraction
        System.out.println("Subtraction of 5 from 10: " + MathUtils.subtract(10, 5));

        // Testing Multiplication
        System.out.println("Multiplication of 5 and 3: " + MathUtils.multiply(5, 3));

        // Testing Division with valid case
        System.out.println("Division of 10 by 2: " + MathUtils.divide(10, 2));

        // Testing Division by zero
        System.out.println("Division of 10 by 0: " + MathUtils.divide(10, 0));

        // Edge case for negative numbers
        System.out.println("Subtraction of 5 from -3: " + MathUtils.subtract(-3, 5));
    }
}

