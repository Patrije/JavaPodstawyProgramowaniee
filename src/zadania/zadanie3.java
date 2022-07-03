package zadania;

import java.util.Scanner;

public class zadanie3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę naturalną");
        int liczba = scanner.nextInt();

        for (int i = 1; i <= liczba; i++) {

            if(i % 3 == 0 && i % 7 != 0){
                System.out.println("pif");
            }
            else if(i % 7 == 0 && i % 3 != 0){
                System.out.println("paf");
            }
            else if(i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif paf");
            }
            else{
                System.out.println(i);
            }




        }
    }
}