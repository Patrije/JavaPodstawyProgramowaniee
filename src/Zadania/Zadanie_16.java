package Zadania;

import java.sql.SQLOutput;

public class Zadanie_16 {
    public static void main(String[] args) {

        int[] array = {11, 10, 25, 3, 24, 25, 22, 11, 3, 16, 19, 3, 24, 10, 25};

        findingRepetitions(array);
    }

    private static void findingRepetitions(int[] array) {
        int amount;
        int result = 0;
        int position = 0;


        for (int i = 0; i < array.length; i++) {
            amount = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    amount++;
                }
                if(amount > result){
                    result = amount;
                    position = i;
                }
            }
        }
        System.out.println("The most common number is: " + array[position]);
    }
}
