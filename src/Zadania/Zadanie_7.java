package Zadania;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie_7 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        duplicatedNumbers();
    }

    private static void duplicatedNumbers() {
        int [] array = new int[10];
        ArrayList<Integer> dupNum = new ArrayList<>();

        System.out.println("Please enter ten numbers [int]:");
        for (int i = 0; i <= 9; i++) {
            System.out.println("No. " + (i + 1));
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j && !dupNum.contains(array[i])){
                    dupNum.add(array[i]);
                }
            }

        }
        System.out.println("Duplicated numbers: " + dupNum);
    }
}
