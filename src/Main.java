// Duane Pannell
// November 2022
//CSC 222 J.Surratt IDE Project 3
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";//just using colors, don't worry about it
    public static void main(String[] args) throws IOException{
        //create int variable to apply user input to
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
            System.out.print("Enter the new employee's ID number: ");//user input id
            employee1.setId(input.nextInt());
            System.out.print("Enter the new employee's Salary: ");//user input salary
            employee1.setSalary(input.nextDouble());
            System.out.println(" ");
            System.out.println("Employee: #" +employee1.getId()+ " has been created and assigned a salary of $" +employee1.getSalary());//output containing user input
        }// ends employee type 1 if statement

        //  if statement for employee type 2
        if(employeeType == 2) {
            EmployeeWithTerritory employee2 = new EmployeeWithTerritory(0, 0, 0, "");
            System.out.println(" ");
            System.out.println("You have chosen to create an employee with territory");
            System.out.print("Enter the new employee's ID number: ");//user input id
            employee2.setId(input.nextInt());
            System.out.print("Enter the new employee's Salary: ");//user input salary
            employee2.setSalary(input.nextDouble());
            System.out.print("What territory will they be servicing? '1' = Northern, '2' = Southern, '3' = Eastern, '4' = Western : ");//user input for territory
            employee2.setTerritory(input.nextInt());
            System.out.print("Will they be issued a '" +YELLOW+"company vehicle"+RESET+"' or a '"+YELLOW+"fuel card"+RESET+"' for their personal vehicle? ");//user input for car
            //Scanner scan = new Scanner(System.in);// 2nd scanner variable for multiple word input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));// buffer reader for multiple word string
            String travel= reader.readLine();
            //travel+=scan.nextLine();
            //scan.close();// end of 2nd scanner variable
            employee2.setCar(travel);
            System.out.println(" ");
            System.out.println("Employee: #" + employee2.getId() + " has been created and assigned a salary of $" + employee2.getSalary());//output for user input
            // use if statements to convert user input for int territory into a string output with geographical area
            // include car variable in all possibilities
                if(employee2.getTerritory() == 1){System.out.println("They will be servicing the Northern territory and will be issued a " + employee2.getCar());}
                else if(employee2.getTerritory() == 2){System.out.println("They will be servicing the Southern territory and will be issued a " + employee2.getCar());}
                else if(employee2.getTerritory() == 3){System.out.println("They will be servicing the Eastern territory and will be issued a " + employee2.getCar());}
                else if(employee2.getTerritory() == 4){System.out.println("They will be servicing the Western territory and will be issued a " + employee2.getCar());}
        }// ends if statement for employee type 2

        //  if statement for employee type 3
        if(employeeType == 3) {
            SeasonalEmployee employee3 = new SeasonalEmployee(0, 0, "", 0, 0, "");
            System.out.println(" ");
            System.out.println("You have chosen to create a seasonal employee");
            System.out.print("Enter the new employee's ID number: ");//user input id
            employee3.setId(input.nextInt());
            System.out.print("Enter the new employee's Salary: ");//user input salary
            employee3.setSalary(input.nextDouble());
            System.out.print("In what season will the new employee be working?: ");//user input season;
            employee3.setSeason(input.next());
            System.out.print("How many months will they be available to work?: ");//user input months available
            employee3.setMonthsAvailable(input.nextInt());
            System.out.print("Will housing be provided the company during this time? 1=Yes 2=No: ");//user input housing
            employee3.setHousing(input.nextInt());
            System.out.println("Please list all equipment that will be provided by the company for " + employee3.getSeason() + " work: ");//user input equipment
            Scanner input2 = new Scanner(System.in);
            String stuff = "";//had to create a new string variable here because the scanner wasn't suitable for the way I wanted to output
            stuff+=input2.nextLine();
            input.close();
            System.out.println(" ");
            System.out.println("Employee: #" + employee3.getId() + " has been created and assigned a salary of $" + employee3.getSalary());//output for user input
            System.out.println("They will be working for " + employee3.getMonthsAvailable() + " months during the " + employee3.getSeason());
            if(employee3.getHousing() == 1){System.out.println("The company will arrange housing.");}
            else{System.out.println("The company will NOT arrange housing.");}
            System.out.println(" ");
            employee3.setEquipment(stuff);
            System.out.println("Note: Please direct employee #"+employee3.getId()+" to the equipment manager immediately to be issued: "+stuff);

        }//ends if statement for employee type 3



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
    }//ends main method
}//ends main class