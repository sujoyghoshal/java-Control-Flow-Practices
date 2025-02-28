import java.util.Scanner;

public class PowerUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter power: ");
        int power = scanner.nextInt();

        int result = 1;
        int i = 0;

        while (i < power) {
            result *= number;
            i++;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
