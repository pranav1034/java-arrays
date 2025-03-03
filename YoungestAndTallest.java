import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store ages and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height (cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Finding the youngest friend
        int minAge = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAge]) {
                minAge = i;
            }
        }

        // Finding the tallest friend
        int maxHeight = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[maxHeight]) {
                maxHeight = i;
            }
        }

        // Print results
        System.out.println("\nThe youngest friend is " + names[minAge] + " with age " + ages[minAge] + " years.");
        System.out.println("The tallest friend is " + names[maxHeight] + " with height " + heights[maxHeight] + " cm.");

    }
}
