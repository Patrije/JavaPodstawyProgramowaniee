package zadania;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Napisz program, który pobierze od użytkownika tekst (zmienna typu String) i sprawdzi,
 czy użytkownik kichnął, tzn. czy w podanym tekście znajduje się tekst „aaaa psik” z dowolnie wieloma,
  ale minimum jedną literą ‘a’ na początku wyrażenia (czyli kichnięciem jest zarówno „a psik”, jak i „aaaaaaaaaa psik”).
Podpowiedź: użyj wyrażenia regularnego z odpowiednim kwantyfikatorem.

 */
public class Zadanie9 {

    public static void main(String[] args) {
        System.out.println("Podaj ciag znakow");
        Scanner scanner = new Scanner(System.in);
        String sneeze = scanner.nextLine();
        Pattern pattern = Pattern.compile("a{1,} psik");
        Matcher matcher = pattern.matcher(sneeze);
        if(matcher.matches()){
            System.out.println("Kichnales");
        }
    }
}
