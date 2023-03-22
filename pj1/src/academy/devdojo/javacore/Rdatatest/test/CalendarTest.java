package academy.devdojo.javacore.Rdatatest.test;

import java.util.Date;
import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domigo porra");
        }
        Date date = c.getTime();
        System.out.println(date);
    }
}
