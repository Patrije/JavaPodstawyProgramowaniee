package zadania;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie8 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a date of next SDA lesson [dd-MM-YYY]:");
        String dateOfLesson = s.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate lessonDate = LocalDate.parse(dateOfLesson, formatter);
        System.out.println("You have " + Period.between(LocalDate.now(),lessonDate) + " left to SDA lesson!" );







    }
}
