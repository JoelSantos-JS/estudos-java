package academy.devdojo.javacore.Rdatatest.test;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ClassLocaly {
    public static void main(String[] args) {
        Locale localeItay =  new Locale("en", "en");
        Locale localeInd = new Locale("ja", "jp");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeItay);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeInd );
 
        System.out.println("JP" + dateFormat2.format(calendar.getTime()));
        System.out.println("en" + dateFormat.format(calendar.getTime()));

    }
}
