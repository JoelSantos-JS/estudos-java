package academy.devdojo.javacore.Rdatatest.test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate localDate = LocalDate.of(2010, 2, 20);
        System.out.println(localDate.getYear());
    }
}
