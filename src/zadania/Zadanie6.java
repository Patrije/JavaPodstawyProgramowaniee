package zadania;

import java.util.Scanner;

/*
Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String)
 tak długo, aż użytkownik poda tekst „Starczy”, a następnie wypisze najdłuższy z podanych
  tekstów (nie biorąc pod uwagę tekstu „Starczy”). Jeśli użytkownik nie poda żadnego tekstu,
   to wypisz „Nie podano żadnego tekstu”.

 */
public class Zadanie6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestText = "";
        String userInput;
        String endLoopCondition = "Starczy";

        do{
            System.out.println("Podaj text, na slowo 'Starczy' konczymy");
            userInput = scanner.next();
            if(userInput.length()>longestText.length() && !userInput.equals(endLoopCondition)){
                longestText = userInput;
            }
        } while(!userInput.equals(endLoopCondition));
        System.out.println(longestText);
    }
}
