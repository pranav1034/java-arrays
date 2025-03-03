import java.util.Scanner;

public class Grades2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        // Define arrays
        int[][] marks = new int[n][3]; // Stores marks for Physics, Chemistry, and Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];
        
        // Take input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                
                while (true) {
                    System.out.print(subject + ": ");
                    marks[i][j] = sc.nextInt();
                    
                    if (marks[i][j] >= 0) {
                        break;
                    } else {
                        System.out.println("Invalid marks. Enter again.");
                    }
                }
            }
            
            // Calculate percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            
            // Assign grade
            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 80) {
                grade[i] = "B";
            } else if (percentage[i] >= 70) {
                grade[i] = "C";
            } else if (percentage[i] >= 60) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }
        
        // Print output
        System.out.println("Student Marks, Percentage, and Grade:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2] + ", Percentage: " + percentage[i] + "%, Grade: " + grade[i]);
        }
    }
}
