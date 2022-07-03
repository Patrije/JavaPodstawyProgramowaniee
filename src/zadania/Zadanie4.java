package zadania;

import java.util.Scanner;

public class Zadanie4 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int userNumber = loadNumber();
        for (int i = 1; i > userNumber; ) {
            if (userNumber <= 0) {
                System.out.println("Wrong number! Write positive number!");
                userNumber = loadNumber();
                continue;
            }
        }

        for (int i = 2; i <= userNumber / 2; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }

        }


    }

    static int loadNumber() {
        System.out.println("Podaj dodatnią liczbę: ");
        return s.nextInt();
    }

    static boolean isPrimeNumber(int x) {

        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                return false;

            }
        }
        return true;
    }
}
