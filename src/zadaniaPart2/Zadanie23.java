package zadaniaPart2;

import java.util.Random;

public class Zadanie23 {
    static Random r = new Random();

    public static void main(String[] args) {
        amountMethod();

    }

    private static void amountMethod() {
        int[] tab = new int[20];
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(11);
        }
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[j] == i) {
                    counter++;
                }
            }
            System.out.println("Number " + i + " is x" + counter + " times");
            counter = 0;

        }

    }
}
