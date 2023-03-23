package academy.devdojo.javacore.Rdatatest.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTest01 {
    public static void main(String[] args) {
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(tokyoZone);
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime =  localDateTime.atZone(tokyoZone);
        System.out.println(zonedDateTime);
        Instant instant = Instant.now();

        System.out.println(instant);
        ZonedDateTime zonedDateTime2 = instant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);
    }
}
