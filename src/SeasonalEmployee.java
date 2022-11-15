public class SeasonalEmployee extends Employee {

    private String season;
    private int monthsAvailable;
    private int housing;

    public SeasonalEmployee(int id, double salary, String workSeason, int monthsAvail, int needHouse) {
        super(id, salary);
        season = workSeason;
        monthsAvailable = monthsAvail;
        housing = needHouse;
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
}//ends class
