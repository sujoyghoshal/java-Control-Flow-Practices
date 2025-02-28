import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("Enter a number greater than 1.");
            return;
        }

        int greatestFactor = 1;
        int i = number - 1;

        while (i > 0) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }

        System.out.println("Greatest factor besides itself: " + greatestFactor);
    }
}
