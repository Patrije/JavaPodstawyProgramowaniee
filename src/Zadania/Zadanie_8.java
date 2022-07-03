package Zadania;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie_8 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        howManyDaysLeft();
    }

    private static void howManyDaysLeft() {
        System.out.println("Enter a date of next SDA lesson [dd-MM-YYY]:");
        String dateOfLesson = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate lessonDate = LocalDate.parse(dateOfLesson, formatter);
        System.out.println("You have " + Period.between(LocalDate.now(), lessonDate).getDays() + " days left to SDA lesson!");
    }
}
