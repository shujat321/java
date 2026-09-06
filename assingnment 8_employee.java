class assingnment 8_employee {
    String name = "Rahul";
    int salary = 6500000;

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    void displayManager() {
        System.out.println("Manager accessing Employee details:");
        System.out.println("Employee Name: " + super.name);
        System.out.println("Salary: " + super.salary);
    }
}

public class assignment8_employee {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.displayManager();
    }
}
