package datetime;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Local date w systemowej strefie to: " + localDate);

        LocalDate zonedlocalDate = localDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(" tokyo date is: " + zonedlocalDate);



    }



}
