package Zadania;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {

        int highest = 0, num = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Wpisz " + (i+1) + ". liczbe: ");
            num = scan.nextInt();
        }

        if (num > highest) {
            highest = num;
        }

        System.out.println("Najwieksza liczba to: " + highest);

    }
}
