import java.util.Scanner;

class EmployeePayroll {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String employeeId = input.nextLine();

        System.out.print("Enter Basic Salary: ");
        String salaryInput = input.nextLine();

        System.out.print("Enter Bonus: ");
        String bonusInput = input.nextLine();

        // Converting String values into Wrapper Objects
        Integer employeeNumber = Integer.parseInt(employeeId);
        Double basicPay = Double.parseDouble(salaryInput);
        Double bonusPay = Double.parseDouble(bonusInput);

        // Checking salary and bonus
        if (basicPay >= 0 && bonusPay >= 0) {

            Double totalSalary = basicPay + bonusPay;

            System.out.println("\n--- Employee Payroll ---");
            System.out.println("Employee ID   : " + employeeNumber);
            System.out.println("Basic Salary  : " + basicPay);
            System.out.println("Bonus Amount  : " + bonusPay);
            System.out.println("Net Salary    : " + totalSalary);

        } else {
            System.out.println("Error: Salary and bonus cannot be negative.");
        }

        input.close();
    }
}
