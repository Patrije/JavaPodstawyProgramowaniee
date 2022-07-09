package zadania;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int)
 i obliczy liczbę Fibonacciego o wskazanym indeksie. Przykładowo,
  jeśli użytkownik poda liczbę 5, Twój program powinien wypisać
   piątą liczbę Fibonacciego. Kolejne liczby Fibonacciego powstają
    poprzez zsumowanie dwóch poprzednich liczb Fibonacciego.
     Przykładowo, kilka pierwszych liczb Fibonacciego wynosi kolejno: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...

 */
public class Zadanie11 {

    public static long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
//        int pierwszaLiczba = 1;
//        int drugaLiczba = 1;
//        for (int i = 3; i <= n; i++) {
//            int suma = pierwszaLiczba + drugaLiczba;
//            pierwszaLiczba = drugaLiczba;
//            drugaLiczba = suma;
//        }
        return fibonacci(n-2)+fibonacci(n-1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(fibonacci(scanner.nextInt()));

    }
}
