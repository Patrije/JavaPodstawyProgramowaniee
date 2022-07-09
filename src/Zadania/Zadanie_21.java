package Zadania;

import java.util.Scanner;

public class Zadanie_21 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        reverseSequence();
    }

    private static void reverseSequence() {
        System.out.println("Give me some sequence:");
        String sequence = scanner.nextLine();

        char[] array = sequence.toCharArray();
        char[] array1 = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[array.length - 1 - i];
        }
        for (char a : array1) {
            System.out.print(a);
        }
    }
}
