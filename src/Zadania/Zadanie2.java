package Zadania;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoja wage w kilogramach");
        float waga = scanner.nextFloat();
        System.out.println("Podaj swoj wzrost w centymetrach");
        int wzrost = scanner.nextInt();
        interpretBmi(waga, wzrost);
    }

    private static void interpretBmi(float waga, int wzrost){
        double bmiValue = bmi(waga, wzrost);
        if(bmiValue>= 18.5 && bmiValue<=24.9){
            System.out.println("Bmi wynosi: "+ bmiValue + " tzn: Waga optymalna");
        } else {
            System.out.println("Bmi wynosi: " + bmiValue + " tzn: Waga nieoptymalna");
        }
    }

    private static double bmi(float waga, int wzrost){
        return  waga/((float)(Math.pow(((double)wzrost/100),2)));
    }
}
