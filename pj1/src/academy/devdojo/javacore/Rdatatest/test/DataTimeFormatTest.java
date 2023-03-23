package academy.devdojo.javacore.Rdatatest.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTimeFormatTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(s1);

        LocalDateTime localDateTime = LocalDateTime.now();
        String s4 = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
       LocalDateTime parse =   LocalDateTime.parse("2023-03-23T15:34:45.217");
       System.out.println(parse);
    }
}
