package Zadania;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Zadanie_6 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        theLongestString();
    }
    private static void theLongestString() {
        ArrayList<String> wordsFromUser = new ArrayList<>();
        String usersWord;
        String theLongest = "";
        System.out.println("We will try to find the longest word.. If you want to quit enter [Starczy]!");

        do {
            System.out.println("Enter some word:");
            usersWord = scanner.nextLine();
            if (Objects.equals(usersWord, "")) {
                System.out.println("Nie podano żadnego tekstu!");
            }
            wordsFromUser.add(usersWord);
        } while (!Objects.equals(usersWord, "Starczy"));

        for (String s : wordsFromUser) {
            if (s.length() > theLongest.length() && !s.equals("Starczy")) {
                theLongest = s;
            }
        }
        System.out.println("The longest string is: " + theLongest);
    }
}
