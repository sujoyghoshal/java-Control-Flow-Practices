import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        double result;

        switch (op) {
            case '+':
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
