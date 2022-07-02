import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Birthday {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(1992,Month.DECEMBER,6);
        System.out.println(localDate.getDayOfWeek());

    }
}
