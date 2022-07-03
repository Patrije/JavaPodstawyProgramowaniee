package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class BirthDay {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(Year.1994, Month.MARCH, DayOfWeek.9);
        System.out.println(localDate.getDayOfWeek());
    }

}
