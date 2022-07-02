import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main2 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(instant);
        System.out.println(zonedDateTime);
    }
}
