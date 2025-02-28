import java.util.Scanner;

public class MultiplesBelow100ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = scanner.nextInt();

        if (number < 1 || number >= 100) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.print("Multiples of " + number + " below 100: ");
        for (int i = number; i < 100; i += number) {
            System.out.print(i + " ");
        }
    }
}
