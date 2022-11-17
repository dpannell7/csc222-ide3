// Child class of my own creation extending the employee class
public class SeasonalEmployee extends Employee {

    private String season;
    private int monthsAvailable;
    private int housing;
    private String equipment;

    public SeasonalEmployee(int id, double salary, String workSeason, int monthsAvail, int needHouse, String gear) {
        super(id, salary);
        season = workSeason;
        monthsAvailable = monthsAvail;
        housing = needHouse;
        equipment = gear;
    }

    public String getSeason()
    {
        return season;
    }
    public void setSeason(String seas) {season = seas;}

    public int getMonthsAvailable()
    {
        return monthsAvailable;
    }
    public void setMonthsAvailable(int months) {monthsAvailable = months;}
    public int getHousing() {return housing;}
    public void setHousing(int house){housing = house;}
    public String getEquipment()
    {
        return equipment;
    }
    public void setEquipment(String gear) {season = gear;}
}//ends class
