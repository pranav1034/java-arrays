import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {
            if (index == maxDigit) break; // If array is full, stop
            digits[index++] = number % 10; // Extract last digit
            number /= 10; // Remove last digit
        }

        
        // Find largest and second largest
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        // Print results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " +  secondLargest);

    }
}
