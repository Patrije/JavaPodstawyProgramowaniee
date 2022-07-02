import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("local date with system time servives" + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("actually time write now is: " + localTime);
    }
}
