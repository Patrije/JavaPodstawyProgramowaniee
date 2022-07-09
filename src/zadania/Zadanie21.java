package zadania;/*
Napisać program, który wczytuje od użytkownika ciąg znaków,
a następnie tworzy łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
Przykładowo, dla łańcucha „Kot" wynikiem powinien być łańcuch „toK".
 */

import java.util.Scanner;

public class Zadanie21 {

    public static void main(String[] args) {
        System.out.println("wprowadz text");
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());

        String reversedText = new StringBuilder(text.toString()).reverse().toString();
        System.out.println(reversedText);

    }
}
