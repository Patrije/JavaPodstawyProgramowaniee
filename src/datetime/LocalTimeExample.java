package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAmount;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("local time is: "+ localTime.minus(Duration.ofHours(2)));
        System.out.println("local time is: "+ localTime);

        LocalTime localTokyoTime = LocalTime.now(ZoneId.of("Pacific/Apia"));
        LocalDate localTokyoTimed = LocalDate.now(ZoneId.of("Pacific/Apia"));
        System.out.println("samoa" + localTokyoTimed);
        LocalTime pastTime = LocalTime.of(13,4);
        System.out.println("past time "+ pastTime);
        System.out.println(pastTime.isBefore(localTime));
        System.out.println(localTime.getHour());
        System.out.println(localTime.getSecond());
    }
}
