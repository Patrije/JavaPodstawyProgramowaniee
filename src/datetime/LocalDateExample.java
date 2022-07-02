package datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
//        System.out.println("Local date w sytemowej strefie to: " + localDate);

//        LocalDate zonedlocalDate = LocalDate.now(ZoneId.of("Asia/Tokyo"));
//        System.out.println(" tokyo date is: " + zonedlocalDate);

        LocalDate concreteLocalDate = LocalDate.of(2019, 1, 1);
        System.out.println(concreteLocalDate.getMonth());
        System.out.println(concreteLocalDate.getDayOfWeek());
        System.out.println(concreteLocalDate.isAfter(localDate));
    }
}
