// Duane Pannell
// November 2022
//CSC 222 J.Surratt IDE Project 3
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(23);
        employee1.setSalary(45000);
        System.out.println("Here is the employee Id for Employee 1: " + employee1.getId());
        System.out.println("Here is the salary for Employee 1: $" + employee1.getSalary());
    }
}