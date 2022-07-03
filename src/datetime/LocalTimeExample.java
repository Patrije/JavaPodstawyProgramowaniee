package datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("local time is:" + localTime.minus(Duration.ofHours(2)));
        System.out.println("local time is: "+ localTime);

        LocalTime localTokyoTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));



    }
}
