public class Calculator {
	// Method to add two numbers with input validation
    public int add(int num1, int num2) {
        validateInput(num1, num2);
        return num1 + num2;
    }

    // Method to multiply two numbers with input validation
    public int multiply(int num1, int num2) {
        validateInput(num1, num2);
        return num1 * num2;
    }
    
    // Private method to validate inputs
    private void validateInput(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative integers.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Example: Add two numbers
        try {
            int sum = calculator.add(10, 5);
            System.out.println("Sum: " + sum);

            // Example: Multiply two numbers
            int product = calculator.multiply(10, 5);
            System.out.println("Product: " + product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
