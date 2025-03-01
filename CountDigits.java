import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = Math.abs(number); 

        do {
            temp /= 10; 
            count++;
        } while (temp != 0);

        System.out.println("Number of digits: " + count);
    }
}
