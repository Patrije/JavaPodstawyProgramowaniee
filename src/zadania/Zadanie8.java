package zadania;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy
ile dni do nich pozostało. Podpowiedź: datę wczytaj jako typ String i przeparsuj na LocalDate.
Obecną datę pobierz z metody LocalDate.now().

 */
public class Zadanie8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date nast zajec w formacie dd-MM-YYYY");
        String userDate = scanner.next();
        int liczbaDni = countDaysToNextLesson(userDate);
        System.out.println(liczbaDni + " " + "days left");
    }

    private static int countDaysToNextLesson(String userDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate lessonDate = LocalDate.parse(userDate, formatter);
        return Period.between(LocalDate.now(), lessonDate).getDays();
    }
}
