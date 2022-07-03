package zadania;

import java.util.Scanner;

public class zadanie_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Podaj dodatnia liczbe:");
        int number = scanner.nextInt();


        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 7 == 0) {

                System.out.println("Pif Paf");
            }
            else if (i % 7 == 0) {
                System.out.println("Paf");
            }
            else if (i % 3 == 0 ) {
                System.out.println("Pif");
            }
            else{
                System.out.println(i);

            }

        }


    }


}
