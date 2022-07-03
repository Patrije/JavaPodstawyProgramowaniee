package dataTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDataExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Local date w systemowej strefie to: " + LocalDate);

        LocalDate zonedlocalDate = LocalDate.now(ZoneId.of(Asia/Tokyo))
    }
}
