package Zadania;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        int i;
        for(i = 0; i < liczba; i++){
            if(i % 3 == 0 && i % 7 != 0){
                System.out.println("Pif");
            } else if(i % 7 == 0 && i % 3 != 0){
                    System.out.println("Paf");
                } else if(i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif paf");
            } else {
                System.out.println(i);
            }
        }
    }
}
