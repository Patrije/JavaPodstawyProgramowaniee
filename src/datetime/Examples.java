package datetime;

import java.time.*;

public class Examples {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        System.out.println(instant);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
    }

}
