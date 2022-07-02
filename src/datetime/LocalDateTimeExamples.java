package datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExamples {
    public static void main(String[] args) {

       /* LocalTime localTime = LocalTime.now();
        System.out.println("Local time is: " + localTime.minus(Duration.ofHours(2)));
        System.out.println("Local tine is: "+ localTime);
        LocalTime localTokyoTime = LocalTime.now(ZoneId.of("Pacific/Apia"));
        System.out.println(localTokyoTime);
        LocalTime pastTime = LocalTime.of(14,12);
        System.out.println(pastTime);
        System.out.println(pastTime.isBefore(localTime));
        System.out.println(localTime.getHour());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.now(ZoneId.of("Pacific/Apia"));
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(2020, Month.FEBRUARY, 21, 20, 15, 30);
        System.out.println(localDateTime2);
        LocalDateTime localDateTime3 = LocalDateTime.now();

        String pattern = "dd-MM-YYYY, HH-mm-ss";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(localDateTime3.format(dateTimeFormatter));*/

        LocalDate localDate = LocalDate.of(1996, Month.JUNE, 30);
        System.out.println(localDate.getDayOfWeek());
    }
}
