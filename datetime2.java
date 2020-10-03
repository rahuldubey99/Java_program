import java.util.Calendar;
import java.util.GregorianCalendar;

public class datetime2 {
    public static void main(String[] args) {
        int day, month, year;
        int second , minute, hour;
        GregorianCalendar date = new GregorianCalendar();
        int a =5;
        while (a>=1) {
            day = date.get(Calendar.DAY_OF_MONTH);
            month = date.get(Calendar.MONTH);
            year = date.get(Calendar.YEAR);
            second = date.get(Calendar.SECOND);
            minute = date.get(Calendar.MINUTE);
            hour = date.get(Calendar.HOUR);
            System.out.println("Date:"+day+"/"+month+"/"+year);
            System.out.println("Time:"+hour+":"+":"+minute+":"+":"+second);
            
        }
    }
    
}
