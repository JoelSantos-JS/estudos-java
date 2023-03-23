package academy.devdojo.javacore.Rdatatest.test;

import java.time.Duration;
import java.time.LocalDate;

import java.time.LocalTime;
import java.time.Period;

public class DurationTest01 {
    public static void main(String[] args) {
        // LocalDate now = LocalDate.now();
        // LocalDate nowAfterTowYears = LocalDate.now().plusYears(2).plusDays(7);
        // LocalTime timeNow = LocalTime.now();
        // Duration duration = Duration.between(now , nowAfterTowYears);
        // Period period = Period.between(now, nowAfterTowYears);
        Period period2 = Period.ofMonths(2);

        System.out.println(period2);
        // System.out.println(now);
        // System.out.println(nowAfterTowYears);
        // System.out.println(duration);
    }
}
