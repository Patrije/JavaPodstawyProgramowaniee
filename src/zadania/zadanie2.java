package zadania;

import javax.swing.*;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Weight: ");
        float weight = scan.nextFloat();
        System.out.println("Heigh: ");
        int heigh = scan.nextInt();
        float BMI = weight / (heigh ^ 2);

        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI optymalne");

        } else {
            System.out.println("BMI nieoptymalne");
        }

    }
}
