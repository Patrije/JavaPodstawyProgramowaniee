package Zadania;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String args[]) {

        System.out.println("Podaj liczbe: ");
        int limit = new Scanner(System.in).nextInt();

//        System.out.println(limit);
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}