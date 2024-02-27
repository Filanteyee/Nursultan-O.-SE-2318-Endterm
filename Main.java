import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

       
        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");


        int choice = scanner.nextInt();

        Operation operation;
        switch (choice) {
            case 1:
                operation = new Addition();
                break;
            case 2:
                operation = new Subtraction();
                break;
            case 3:
                operation = new Multiplication();
                break;
            case 4:
                operation = new Division();
                break;
            default:
                throw new IllegalArgumentException("Invalid choice");
        }

        calculator.setOperation(operation);


        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();


        try {
            double result = calculator.calculate(num1, num2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}