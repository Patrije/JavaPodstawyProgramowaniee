import java.time.LocalDate;

public class DayOfBirth {
    public static void main(String[] args) {
        LocalDate concreteLocalDate = LocalDate.of(1996, 1, 1);
        System.out.println(concreteLocalDate.getDayOfWeek());
    }
}
