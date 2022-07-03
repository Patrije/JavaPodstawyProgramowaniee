package Zadania;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        int i;
        for (i = 2; i < liczba; i++) {
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
