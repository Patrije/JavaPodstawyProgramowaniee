package Zadania;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie6 {

    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz slowo: ");
        ArrayList<String> list = new ArrayList<String>();
        String str = list.toArray(new String[0]);


        while (!in.hasNext("Starczy"))
        {
            list.add(in.next());
        }

        String longestString = getLongestString(str);
        System.out.format("Najdluzsze slowo to " + longestString);
    }
}