package Zadania;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie_13 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        isItAPostCode();
    }

    private static void isItAPostCode() {
        System.out.println("Enter your postcode [XX-XXX]:");
        String s1 = scanner.nextLine();

        Pattern compiledPattern = Pattern.compile("^[0-9]{2}-[0-9]{3}$");
        Matcher matcher = compiledPattern.matcher(s1);

        System.out.println("It's postcode: " + matcher.matches());
    }
}
