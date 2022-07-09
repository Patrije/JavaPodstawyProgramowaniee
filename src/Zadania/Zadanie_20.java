package Zadania;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zadanie_20 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
        String formattedDate = localDateTime.format(formatter);
        System.out.println(formattedDate);

    }
}
