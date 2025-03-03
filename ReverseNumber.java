import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count the number of digits
        int temp = number, count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Create an array to store digits
        int[] digits = new int[count];

        // Extract digits and store in array
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display digits in reverse order
        System.out.print("Digits in reverse order: ");
        for (int digit : digits) {
            System.out.print(digit);
        }

    }
}
