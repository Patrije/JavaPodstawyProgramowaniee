package zadania;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int)
i wypisze wszystkie liczby pierwsze, większe od 1 i mniejsze od podanej liczby

 */
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę: ");
        int userNumber = scanner.nextInt();

        System.out.println(getPrimeNumbersList(userNumber));

    }

    public static List<Integer> getPrimeNumbersList(int n) {
        List<Integer> primeNumbers = new LinkedList<>();
        if (n >= 2) {
            primeNumbers.add(2);
        }
        for (int i = 3; i <= n; i += 2) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
    private static boolean isPrime(int number) {
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
