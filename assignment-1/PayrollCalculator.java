import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String name;
        double hourlyWage;
        int hoursWorked;
        double grossSalary;
        double tax;
        double netSalary;

        try {
            // Get employee information
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

            System.out.print("Enter your hourly wage: ");
            hourlyWage = scanner.nextDouble();

            System.out.print("Enter hours worked: ");
            hoursWorked = scanner.nextInt();

            // Check for negative values
            if (hourlyWage < 0 || hoursWorked < 0) {
                System.out.println("Hourly wage and hours worked cannot be negative.");
                scanner.close();
                return;
            }

            // Calculate salary
            grossSalary = hourlyWage * hoursWorked;
            tax = grossSalary * 0.20;
            netSalary = grossSalary - tax;

            // Display payroll summary
            System.out.println();
            System.out.println("Payroll Summary for " + name);
            System.out.println("-----------------------------------");
            System.out.println("Hours Worked: " + hoursWorked);
            System.out.printf("Hourly Wage: $%.2f%n", hourlyWage);
            System.out.printf("Gross Salary: $%.2f%n", grossSalary);
            System.out.printf("Taxes Deducted: $%.2f%n", tax);
            System.out.printf("Net Salary: $%.2f%n", netSalary);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers for wage and hours worked.");
        }

        scanner.close();
    }
}