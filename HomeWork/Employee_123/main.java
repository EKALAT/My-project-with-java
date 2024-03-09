package Employee_123;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Enter Employee Information--");
        System.out.print("1. Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("2. Hourly Wage: ");
        int paymentPerHour = scanner.nextInt();

        int employeeType;
        do {
            System.out.print("3. Select employee type (1 + Part-time, 2 + Full-time): ");
            employeeType = scanner.nextInt();

            if (employeeType != 1 && employeeType != 2) {
                System.out.println("ERROR: Invalid selection! Please choose 1 or 2.");
            }
        } while (employeeType != 1 && employeeType != 2);

        Employee employee = createEmployee(employeeType, name, paymentPerHour, scanner);

        System.out.println("--Display Employee Information--");
        System.out.println("1. Employee Name: " + employee.getName());
        System.out.println("2. Hourly Wage: " + employee.getPaymentPerHour());
        System.out.println("3. Monthly Salary: " + employee.calculateSalary());

        scanner.close();
    }

    private static Employee createEmployee(int employeeType, String name, int paymentPerHour, Scanner scanner) {
        if (employeeType == 1) {
            System.out.print("4. Number of working hours: ");
            int workingHours = scanner.nextInt();
            return new PartTimeEmployee(name, paymentPerHour, workingHours);
        } else {
            return new FullTimeEmployee(name, paymentPerHour);
        }
    }
}
