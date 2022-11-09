public class SeasonalEmployee extends Employee {

    private String season;
    private int monthsAvailable;

    public SeasonalEmployee(int id, double salary, String workSeason, int monthsAvail) {
        super(id, salary);
        season = workSeason;
        monthsAvailable = monthsAvail;
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
}//ends class
