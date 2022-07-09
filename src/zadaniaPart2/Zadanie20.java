package zadaniaPart2;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Zadanie20 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH::mm dd-MM-yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm:ss a dd MM yyyy");
        String formattedDate = localDateTime.format(formatter);
        String formattedDate2 = localDateTime.format(formatter2);

        System.out.println(formattedDate);
        System.out.println(formattedDate2);

        Date nowDate = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH::mm dd-MM-yyyy");
        System.out.println("Data w formacie [HH::mm dd-MM-yyyy] -->  " + sdf1.format(nowDate));



    }
}
