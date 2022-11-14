// Duane Pannell
// November 2022
//CSC 222 J.Surratt IDE Project 3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int employeeType;
        //  get user input for type of employee to create
        System.out.println("******************************************");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("Standard Employee: Enter '1'");
        System.out.println("Employee with territory: Enter '2'");
        System.out.println("Seasonal Employee: Enter '3'");
        System.out.println(" ");
        System.out.print("What type of employee would you like to create? ");
        employeeType = input.nextInt();

        //  if statement for employee type 1
        if(employeeType == 1){
            Employee employee1 = new Employee(0, 0);
            System.out.println(" ");
            System.out.println("You have chosen to create a Standard Employee");
            System.out.print("Enter the new employee's ID number: ");
            employee1.setId(input.nextInt());
            System.out.print("Enter the new employee's Salary: ");
            employee1.setSalary(input.nextDouble());
            System.out.println(" ");
            System.out.println("Employee: #" +employee1.getId()+ " has been created and assigned a salary of $" +employee1.getSalary());
        }// ends employee type 1 if statement

        //  if statement for employee type 2
        if(employeeType == 2) {
            EmployeeWithTerritory employee2 = new EmployeeWithTerritory(0, 0, 0);
            System.out.println(" ");
            System.out.println("You have chosen to create a Standard Employee");
            System.out.print("Enter the new employee's ID number: ");
            employee2.setId(input.nextInt());
            System.out.print("Enter the new employee's Salary: ");
            employee2.setSalary(input.nextDouble());
            System.out.print("What territory will they be servicing? '1' = Northern, '2' = Southern, '3' = Eastern, '4' = Western : ");
            employee2.setTerritory(input.nextInt());
            System.out.println(" ");
            System.out.println("Employee: #" + employee2.getId() + " has been created and assigned a salary of $" + employee2.getSalary());
                if(employee2.getTerritory() == 1){System.out.println("They will be servicing the Northern territory");}
                else if(employee2.getTerritory() == 2){System.out.println("They will be servicing the Southern territory");}
                else if(employee2.getTerritory() == 3){System.out.println("They will be servicing the Eastern territory");}
                else if(employee2.getTerritory() == 4){System.out.println("They will be servicing the Western territory");}
        }// ends if statement for employee type 2

        

        /*Employee employee1 = new Employee(01, 45000);
        employee1.setId(23);
        employee1.setSalary(45000);
        SeasonalEmployee employee2 = new SeasonalEmployee(02, 5000, "Winter", 4);
        EmployeeWithTerritory employee3 = new EmployeeWithTerritory(03, 60000, 5);
        System.out.println("Here is the employee Id for Employee 1: " + employee1.getId());
        System.out.println("Here is the salary for Employee 1: $" + employee2.getSalary());
        System.out.println("The number of months they are available is: " + employee2.getMonthsAvailable());
        System.out.println("Here is the employee territory for Employee 3: " + employee3.getTerritory());
        */
    }
}