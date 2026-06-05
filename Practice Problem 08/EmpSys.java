public class EmpSys {
    static class Employee {
        String name;
        int employeeId;
        double baseSalary;

        Employee(String name, int employeeId, double baseSalary) {
            this.name = name;
            this.employeeId = employeeId;
            this.baseSalary = baseSalary;
        }

        double calculateSalary() {
            return baseSalary;
        }

        void displayInfo() {
            System.out.println("Name: " + name + ", ID: " + employeeId);
            System.out.println("Salary: " + calculateSalary());
        }
    }

    static class Manager extends Employee {
        double bonus;

        Manager(String name, int employeeId, double baseSalary, double bonus) {
            super(name, employeeId, baseSalary);
            this.bonus = bonus;
        }

        @Override
        double calculateSalary() {
            return baseSalary + bonus;
        }
    }

    static class Intern extends Employee {
        int durationMonths;

        Intern(String name, int employeeId, double baseSalary, int durationMonths) {
            super(name, employeeId, baseSalary);
            this.durationMonths = durationMonths;
        }

        @Override
        double calculateSalary() {
            return baseSalary * 0.5;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 50000);
        Manager mgr = new Manager("Bob", 102, 70000, 15000);
        Intern intern = new Intern("Charlie", 103, 20000, 6);

        emp.displayInfo();
        System.out.println();
        mgr.displayInfo();
        System.out.println();
        intern.displayInfo();
    }
}
