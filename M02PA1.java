import java.util.Calendar;
import java.util.GregorianCalendar;

public class M02PA1 
{
    public static void main(String[] args) 
    {
        //current date object
        MyDate currentDate = new MyDate();
        System.out.println("Today's Date: " + currentDate.getMonth() + "/" + currentDate.getDay() + "/" + currentDate.getYear());

        //example miliseconds used
        MyDate date2 = new MyDate( 561555550000L);
        System.out.println("Date elapsed: " + date2.getMonth() + "/" + date2.getDay() + "/" + date2.getYear()); //this should output the date september 18th, 1987
    }
}

//class declaration
class MyDate 
{
    private int year, month, day;

    //no arge
    public MyDate() 
    {
        Calendar gcal = new GregorianCalendar();
        year = gcal.get(Calendar.YEAR);
        month = gcal.get(Calendar.MONTH);
        day = gcal.get(Calendar.DAY_OF_MONTH);
    }

    //elapsed time constructor
    public MyDate(long elapsedTime) {setDate(elapsedTime);}

    //parameterized constructor
    public MyDate(int y, int m, int d) 
    {
        year = y;
        month = m;
        day = d;
    }

    //getters
    public int getYear() {return year;}
    public int getMonth() {return month;}
    public int getDay() {return day;}

    //set date
    public void setDate(long elapsedTime) 
    {
        Calendar gcal = new GregorianCalendar(); //gcal is gregorian calendar
        gcal.setTimeInMillis(elapsedTime);
        year = gcal.get(Calendar.YEAR);
        month = gcal.get(Calendar.MONTH);
        day = gcal.get(Calendar.DAY_OF_MONTH);
    }
}