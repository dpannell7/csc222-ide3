// Duane Pannell
// November 2022
//CSC 222 J.Surratt IDE Project 3
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(23, 45000);
        employee1.setId(23);
        employee1.setSalary(45000);
        SeasonalEmployee employee2 = new SeasonalEmployee(70, 5000, "Winter", 4);
        System.out.println("Here is the employee Id for Employee 1: " + employee1.getId());

        System.out.println("Here is the salary for Employee 1: $" + employee2.getSalary());
        System.out.println("The number of months they are available is: " + employee2.getMonthsAvailable());
    }
}