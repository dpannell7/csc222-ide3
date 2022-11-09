public class EmployeeWithTerritory extends Employee {
   private int territory;

   public EmployeeWithTerritory(int id, double salary, int terr){
      super(id, salary);
      territory = terr;
   }
   public int getTerritory()
   {
      return territory;
   }
   public void setTerritory(int terr)
   {
      territory = terr;
   }
}//ends class
