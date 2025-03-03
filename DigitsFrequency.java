import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Frequency array to store count of digits (0-9)
        int[] frequency = new int[10];

        // Extract digits and count frequency
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;  // Extract last digit
            frequency[digit]++;     // Increment count for that digit
            temp /= 10;             // Remove last digit
        }

        // Print frequency
        for (int i = 0; i < 10; i++) {
             System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
        }
    }
}

