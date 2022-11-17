// copied from textbook as is. no alteration
public class Employee {
   private int idNumber;
   private double baseSalary;

   public Employee(int id, double salary) {
      idNumber = id;
      baseSalary = salary;
   }

   public int getId()
   {
      return idNumber;
   }
   public double getSalary()
   {
      return baseSalary;
   }
   public void setId(int idNum)
   {
      idNumber = idNum;
   }
   public void setSalary(double sal)
   {
      baseSalary = sal;
   }
}//ends employee class

