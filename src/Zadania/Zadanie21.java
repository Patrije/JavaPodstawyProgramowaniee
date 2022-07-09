package Zadania;

import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz zdanie: ");
        String str = scanner.nextLine();
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        } System.out.print(result);
    }
}