package Zadania;

import java.sql.SQLOutput;
import java.util.Random;

public class Zadanie_23 {

    static Random generator = new Random();

    public static void main(String[] args) {


        amountMethod();

    }

    private static void amountMethod() {
        int[] tab = new int[20];
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = generator.nextInt(11);
        }
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[j] == i) {
                    counter++;
                }
            }
            System.out.println("Number " + i + " x" + counter);
            counter = 0;

        }

    }
}
