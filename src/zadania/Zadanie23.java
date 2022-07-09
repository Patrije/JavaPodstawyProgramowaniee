package zadania;/*
Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . .
10,(wypelnic w petli klasą Scanner lub dla chętnych przy użyciu klasy Random)
a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza
się w tablicy.

 */

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zadanie23 {

    private static final int SIZE = 20;
    private static final int LOWEST_NUMBER = 1;
    private static final int HIGHEST_NUMBER = 10;

    public static void main(String[] args) {
        int[] randomNumbers = new int[SIZE];
        fillTable(randomNumbers);
        printResult(randomNumbers);
    }

    private static void fillTable(int[] randomNumbers){
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i< randomNumbers.length; i++){
            randomNumbers[i] = random.nextInt(LOWEST_NUMBER, HIGHEST_NUMBER+1);
        }
    }

    private static void printResult(int[] randomNumbers){
        System.out.println("Elementy tablicy " + Arrays.toString(randomNumbers));
        Arrays.sort(randomNumbers);
        System.out.println("Wystepienia poszczegolnych liczb z zakresu 1 -20: " );
        for(int i = LOWEST_NUMBER; i<=HIGHEST_NUMBER; i++){
            int counter =0;
            for(int j = 0; j<randomNumbers.length; j++){
                if(randomNumbers[j] == i ) {
                    counter++;
                }
            }
            System.out.println(i + " " + counter);

        }
    }
}
