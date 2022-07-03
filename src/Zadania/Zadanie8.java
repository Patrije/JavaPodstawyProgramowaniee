package Zadania;

import java.time.LocalDate;
import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date nastepnych zajec (YYYY-MM-DD): ");
        String str = scanner.next();
        LocalDate d = LocalDate.parse(str);
        LocalDate.now();


    }
}
