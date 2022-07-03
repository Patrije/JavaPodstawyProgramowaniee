package zadania;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("User number: ");
        int number = scan.nextInt();
        int i;
        for (i = 2; i < number; i++) {
            if (i % 1 == 0) {
                System.out.println(i);
            }
        }
    }
}
