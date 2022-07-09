package zadania;

import java.util.Scanner;

public class Zadanie14 {

    public static void main(String[] args) {
        System.out.println("Podaj text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i=i+2) {
            System.out.println(chars[i]);
        }
    }
}
