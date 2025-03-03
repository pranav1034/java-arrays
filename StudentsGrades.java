import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Define separate arrays for each subject
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Take input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            System.out.print("Physics: ");
            physics[i] = sc.nextInt();

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();

            System.out.print("Maths: ");
            maths[i] = sc.nextInt();

            // Calculate percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // Assign grade
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
		grade[i] = "E";
	    } else {
                grade[i] = "F";
            }
        }

        // Print output
        System.out.println("Student Marks, Percentage, and Grade:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Physics: " + physics[i] + 
                               ", Chemistry: " + chemistry[i] + ", Maths: " + maths[i] + 
                               ", Percentage: " + percentage[i] + "%, Grade: " + grade[i]);
        }
    }
}
