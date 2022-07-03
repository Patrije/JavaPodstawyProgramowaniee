package zadania;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika dodatnią liczbę (typu int) i wypisze wszystkie liczby od 1 do podanej liczby, każda w kolejnej linijce, z następującymi zmianami:
w miejscu liczb podzielnych przez 3, zamiast liczby program powinien wypisać „Pif”
w miejscu liczb podzielnych przez 7, zamiast liczby program powinien wypisać „Paf”
jeśli liczba jest podzielna zarówno przez 3, jak i 7, program powinien wypisać „Pif paf”

 */
public class Zadanie3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        int i;
        for(i = 1; i <= liczba; i++){
            if(i % 3 == 0 && i % 7 == 0){
                System.out.println("Pif Paf");
            } else if(i % 3 == 0){
                System.out.println("Pif");
            } else if(i % 7 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }
    }

}
