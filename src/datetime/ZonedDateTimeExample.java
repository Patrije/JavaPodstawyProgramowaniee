package datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Set;

public class ZonedDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Karachi"));

        System.out.println(zonedDateTime1);

        Set<String> availableZones = ZoneId.getAvailableZoneIds();
        for (String availableZone : availableZones) {
            System.out.println(ZonedDateTime.now(ZoneId.of(availableZone)));
        }
        LocalDateTime localDateTime = LocalDateTime.of(2024, Month.DECEMBER, 31, 20, 12, 0);
        ZonedDateTime okreslonaData = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Tokyo"));
        System.out.println(okreslonaData.getDayOfWeek());
    }
}
