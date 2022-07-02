package datetime;

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

        for(String availableZoneIds : availableZones){
            System.out.println(ZonedDateTime.now(ZoneId.of(availableZoneIds)));
        }

    }
}
