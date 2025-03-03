import java.util.Scanner;

public class LargestTwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initial size of array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {
            // If array is full, increase its size
            if (index == maxDigit) {
                maxDigit *= 2;  // Double the size
                int[] temp = new int[maxDigit];  // Create new array
                System.arraycopy(digits, 0, temp, 0, index); // Copy elements
                digits = temp; 
            }
            
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
        System.out.println("Second largest digit: " + secondLargest);

    }
}
