import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter employee information:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Employee Name: ");
        String name = scanner.next();
        System.out.print("Employee Salary: ");
        double salary = scanner.nextDouble();
        
        Employee employee = new Employee(empId, name, salary);
        double incomeTax = employee.calcTax();
        System.out.println("Income Tax: " + incomeTax);
        
        System.out.println("\nEnter product information:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();
        
        Product product = new Product(pid, price, quantity);
        double salesTax = product.calcTax();
        System.out.println("Sales Tax: " + salesTax);
        
        scanner.close();
    }
}