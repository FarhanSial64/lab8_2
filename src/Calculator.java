
public class Calculator {
	// Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to multiply two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Example: Add two numbers
        int sum = calculator.add(10, 5);
        System.out.println("Sum: " + sum);

        // Example: Multiply two numbers
        int product = calculator.multiply(10, 5);
        System.out.println("Product: " + product);
    }
}
