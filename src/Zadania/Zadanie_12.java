package Zadania;

import java.util.Scanner;

public class Zadanie_12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        isPalindromMethod();
    }

    private static void isPalindromMethod() {

        System.out.println("Enter some sequence of characters:");
        String s1 = scanner.nextLine();

        char[] array = s1.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                System.out.println("This sequence is NOT palindrom!");
                return;
            }
        }
        System.out.println("This sequence IS palindrom!");

    }
}
