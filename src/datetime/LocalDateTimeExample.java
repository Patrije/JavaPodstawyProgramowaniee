package datetime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String pattern= "dd-MM-YYYY, HH-mm-ss";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(localDateTime.format(dateTimeFormatter));
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(ZoneId.of("Pacific/Apia"));
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(2020, Month.APRIL, 21, 20, 15, 30);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime3 = LocalDateTime.parse("2020-04-21T20:15:30");
        System.out.println(localDateTime3.getMonth());
    }
}
