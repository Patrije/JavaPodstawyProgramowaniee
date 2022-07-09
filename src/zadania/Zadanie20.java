package zadania;/*
Napisz program który wyświetli zadaną datę w formacie:
godzina::minuta dzien-miesiąc-rok
hh:mm:ss a dzien miesiąc rok

 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zadanie20 {

    public static void main(String[] args) {

    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH::mm dd-MM-yyyy");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm:ss a dd MM yyyy");
    String formattedDate = localDateTime.format(formatter2);
        System.out.println(formattedDate);
    }

}
