package Zadania;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj srednice: ");
        float srednica = scanner.nextFloat();
        System.out.println("Obwod kola to: " + Math.PI * srednica);
        System.out.println("Obwod kola to: " + 3.14 * srednica);
    }
}
