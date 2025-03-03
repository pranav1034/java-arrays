import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input 
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i+1)+" :" );
            numbers[i] = sc.nextInt();
        }

        // Checking for positive, negative, or zero
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is a positive even number.");
                } else {
                    System.out.println(num + " is a positive odd number.");
                }
            } else if (num < 0) {
                System.out.println(num + " is a negative number.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        // Comparing first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than last element.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element is smaller than last element.");
        } else {
            System.out.println("First and last elements are equal.");
        }
    }
}

