package zadania;

import java.util.Scanner;

public class zadanie_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj promien kola: ");
        float number = scanner.nextFloat();
        System.out.println(obwodKola(number));


    }

    static float obwodKola(float r) {
        return (float) (2 * Math.PI * r);
    }
}
