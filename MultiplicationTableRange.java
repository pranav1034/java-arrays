import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4];

        // Calculating the multiplication table for 6 to 9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        // Print results
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

    }
}
