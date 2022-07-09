package Zadania;

import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz zdanie: ");
        String str = scanner.nextLine();
        int length = str.length();

        for (int i = 0; i <= length; i++) {
            if (i % 2 == 1) {
                System.out.print(str.charAt(i));
            }
        }
    }
}


