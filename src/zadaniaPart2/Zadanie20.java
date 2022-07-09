package zadaniaPart2;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Zadanie20 {
    public static void main(String[] args) {

        Date nowDate = new Date();


        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm dd-MM-yyyy");
        System.out.println("Data w formacie [hh:mm dd-MM-yyyy: " + sdf1.format(nowDate));

        LocalDate.now();


    }
}
