package Zadania;

import java.util.Scanner;

public class Zadanie2 {
    public static float main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wage (kg): ");
        float waga = scanner.nextFloat();
        System.out.println("Podaj wzrost (cm): ");
        int wzrost = scanner.nextInt();
        float wzrost2 = wzrost / 100; //wzrost w metrach

        float wartoscBMI = waga / (wzrost2 * wzrost2);

        if (wartoscBMI <= 18.5 && wartoscBMI >= 24.9) {
            System.out.println("BMI optymalne");
        } else {
            System.out.println("BMI nieoptymalne");
        }
    } return //???
}