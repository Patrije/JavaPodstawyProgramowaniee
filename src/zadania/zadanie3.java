package zadania;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scan.nextInt();

        int i;
        for (i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif Paf");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else if (i % 3 == 0) {
                System.out.println("Pif");
            } else {
                System.out.println(i);
            }
        }
    }
}
