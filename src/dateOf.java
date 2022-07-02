import java.time.LocalDate;

public class dateOf {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(1992, 05, 05);
        System.out.println(localDate.getDayOfWeek());

    }
}
