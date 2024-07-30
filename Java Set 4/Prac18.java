class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Prac18 {
    public static void main(String[] args) {
       
        Employee employee = new Employee();
        employee.name = "shubham chaudhary";
        employee.age = 18;
        employee.phoneNumber = "6356859545";
        employee.address = "modasa";
        employee.salary = 500000;
        employee.specialization = "farmer";

       
        Manager manager = new Manager();
        manager.name = "rajubhai patel";
        manager.age = 46;
        manager.phoneNumber = "9265487512";
        manager.address = "navi shinol";
        manager.salary = 800000;
        manager.department = "farming";

        
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + employee.specialization);
        employee.printSalary();


        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}
