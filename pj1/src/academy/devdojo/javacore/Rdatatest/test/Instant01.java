package academy.devdojo.javacore.Rdatatest.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Instant01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
    }
        
}
