package academy.devdojo.javacore.Rdatatest.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChromoUnitJ {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 12, 11, 13, 10);
        LocalDateTime localDate = LocalDateTime.now();
       System.out.println(ChronoUnit.DAYS.between(localDateTime, localDate)); 
    }
}
