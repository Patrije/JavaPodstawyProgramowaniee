package Zadania;

import java.util.Scanner;

public class Zadanie_14 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        sortUsersString();

    }

    private static void sortUsersString() {
        System.out.println("Enter some text: ");
        char[] array = scanner.nextLine().toCharArray();

        for (int i = 0; i < array.length; i++) {
            if(i % 2  == 0 || array[i] == ' '){
                System.out.print(array[i]);
            }
        }

    }
}
