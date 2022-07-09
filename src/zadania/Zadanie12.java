package zadania;
/*
Napisz program, który sprawdza czy ciąg znaków jest palindromem.
 */
import java.util.Scanner;

public class Zadanie12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj text");
        String text = scanner.nextLine();
//        System.out.println(isPalindrom(text));
        StringBuilder stringBuilder = new StringBuilder(text);
        String revertedText = stringBuilder.reverse().toString();
        System.out.println(revertedText);
        System.out.println(text.equals(revertedText));
    }


    static boolean isPalindrom(String s){

        for(int i = 0; i < s.length() / 2; i++)
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;

        return true;
    }
}
