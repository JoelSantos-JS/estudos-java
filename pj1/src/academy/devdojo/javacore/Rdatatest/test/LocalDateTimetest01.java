package academy.devdojo.javacore.Rdatatest.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimetest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2023, 5, 3);
        System.out.println(localDateTime);
    }
}
