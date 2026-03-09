package que3;
import java.util.Scanner;
public class EPMSAPP {
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        Employee Emp1= new Employee();

        System.out.print("Enter employee ID: ");
        Emp1.setEmployeeid(get.nextInt());
        get.nextLine();
        System.out.print("Enter Employee Name: ");
        Emp1.setEmployeeName(get.nextLine());
        System.out.print("Enter Basic Salary: ");
        Emp1.setBasicSalary(get.nextDouble());
        System.out.println("Enter Performance Rating (1-5): ");
        Emp1.setPerRating(get.nextInt());

        System.out.println("\nEmployee Details:");
        System.out.println("Employee id: "+Emp1.getEmployeeid());
        System.out.println("Name: "+Emp1.getEmployeeName());
        System.out.println("Basic Salary: "+Emp1.getBasicSalary());
        System.out.println("Performance Rating: "+Emp1.getPerRating());
        System.out.println("Bonus: "+Emp1.calculateBonus());
        System.out.println("Total Salary: "+Emp1.calculateTotalSalary());
    }
}
