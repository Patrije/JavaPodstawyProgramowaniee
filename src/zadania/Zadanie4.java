package zadania;

import java.util.Scanner;
/*
Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int)
i wypisze wszystkie liczby pierwsze, większe od 1 i mniejsze od podanej liczby
 */
public class Zadanie4 {

    public static void main(String[] args) {
        System.out.println("Podaj liczbe: ");
        int liczba = new Scanner(System.in).nextInt();
        for (int number = 2; number <= liczba; number++) {
            if (isPrimeNumber(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

