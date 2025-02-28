import java.util.Scanner;

public class GreatestFactorForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("Enter a number greater than 1.");
            return;
        }

        int greatestFactor = 1;
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor besides itself: " + greatestFactor);
    }
}
