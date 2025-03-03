import java.util.Scanner;

public class EmployeesBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int employees = 10;
        double[] salaries = new double[employees];
        double[] yearsOfService = new double[employees];
        double[] bonuses = new double[employees];
        double[] newSalaries = new double[employees];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Taking input 
        for (int i = 0; i < employees; i++) {
            System.out.println("Enter salary for Employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            System.out.println("Enter years of service for Employee " + (i + 1) + ": ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.err.println("Invalid input. Please enter again.");
                i--;  // Decrement index to take valid input again
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculating bonuses and new salaries
        for (int i = 0; i < employees; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print results
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < employees ; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] +
                               ", Bonus = " + bonuses[i] +
                               ", New Salary = " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

    }
}
