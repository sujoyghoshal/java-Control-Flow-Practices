import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get last digit
            sum += digit * digit * digit; // Cube and add to sum
            originalNumber /= 10; // Remove last digit
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
    }
}
