import java.util.Scanner;

public class Bmi2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Multi-dimensional array: Stores height, weight, and BMI
        double[][] personData = new double[n][3]; // [n][0] = height, [n][1] = weight, [n][2] = BMI
        String[] weightStatus = new String[n]; // Stores weight status

        // Take input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height(m) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter weight(kg) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            // Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Print Output
        System.out.println("\nBMI Report:");
        for (int i = 0; i < n; i++) {
            System.out.println("The height(m), weight(kg), BMI, and status of person " + (i + 1) +
                    " is " + personData[i][0] + ", " + personData[i][1] + ", " + personData[i][2] + ", " + weightStatus[i]);
        }
    }
}

