package Zadania;

import java.util.Scanner;

public class Zadanie_11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        fibonacciNumbers();
    }

    private static void fibonacciNumbers() {
        System.out.println("Please enter a number:");
        int a = scanner.nextInt();
        int b1 = 0;
        int b2 = 1;
        int result = 0;
        for (int i = 1; i < a; i++) {

            result = b1 + b2;
            b1 = b2;
            b2 = result;
        }
        System.out.println("Number " + a + " from Fibonacci sequence is " + result);

    }
}
