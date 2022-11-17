// Note: copied from textbook and altered. Added "car" String as additional attribute and method
public class EmployeeWithTerritory extends Employee {
   private int territory;
   private String car;// my addition as indicated above

   public EmployeeWithTerritory(int id, double salary, int terr, String needCar){
      super(id, salary);
      territory = terr;
      car = needCar;
   }
   public int getTerritory(){return territory;}
   public void setTerritory(int terr){territory = terr;}
   public String getCar(){return car;}// my addition as indicated above
   public void setCar(String needCar){car = needCar;}// my addition as indicated above
}//ends class
