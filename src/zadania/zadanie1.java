package zadania;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Srednica okregu: ");
        float srednica = scan.nextFloat();
        System.out.println("Obwod kola: " +  Math.PI * srednica);
    }
}