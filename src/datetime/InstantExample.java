package datetime;

import java.time.*;

import static java.time.LocalTime.of;

public class InstantExample {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        ZonedDateTime zonedDatetime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(zonedDatetime);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();




        )
    }
}
