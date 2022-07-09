package zadania;

import java.util.Scanner;


public class zadanie21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ciag znakow: ");
        String ciagznakow = scan.next();

        StringBuilder reverseString = new StringBuilder();
        reverseString.append(ciagznakow);
        reverseString.reverse();

        System.out.println("Odwrocony ciag znakow: " + reverseString);
    }
}


