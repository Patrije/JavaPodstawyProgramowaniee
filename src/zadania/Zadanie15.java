package zadania;/*
Napisać program, który wczyta od użytkownika trzy długości boków trojkąta i sprawdzi czy trójkąt jest prostokątny.
 */

import java.util.Scanner;

public class Zadanie15 {

    public static void main(String[] args) {
        System.out.println("Wprowadz boki trojkata");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(czyProstokatny(a, b, c));

    }

    private static boolean czyProstokatny(int a, int b, int c){

        int longest = a;
        int drugiBok = b;
        int trzeciBok = c;

        if(b > a && b > c){
            longest = b;
            drugiBok = a;
            trzeciBok = c;
        } else if (c > a && c > b){
            longest = c;
            drugiBok = a;
            trzeciBok = b;
        }

        return drugiBok * drugiBok + trzeciBok * trzeciBok == longest * longest;
    }

}
