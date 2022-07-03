package Zadania;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wage (kg): ");
        float waga = scanner.nextFloat();
        System.out.println("Podaj wzrost (cm): ");
        int wzrost = scanner.nextInt();

        interpretBmi(waga, wzrost);
    }

    private static void interpretBmi(float waga, int wzrost) {
        double wartoscBMI= getBmi(waga, wzrost);
        if (wartoscBMI <= 18 && wartoscBMI >= 24.9) {
            System.out.println("BMI optymalne");
        } else {
            System.out.println("BMI nieoptymalne");
        }
    }

    private static double getBmi(float waga, float wzrost){
        float wzrost2 =  wzrost / 100;

        return waga / wzrost2 * wzrost2;
    }

}
