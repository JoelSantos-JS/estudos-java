package academy.devdojo.javacore.Rdatatest.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DataFormat {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[6];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
