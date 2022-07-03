package zadania;

import java.util.Scanner;

public class Zadanie2 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        float a = loadWeight();
        int b = loadHeight();
        float heightInMeters = (float)b/100;
        float bmi = a/((float)(Math.pow(heightInMeters,2)));
        if(bmi > 24.9 || bmi < 18.5 ){
            System.out.println("BMI nieoptymalne");
        }else {
            System.out.println("BMI optymalne");
        }



    }
    static float loadWeight(){
        System.out.println("Podaj swoją wagę w KG: ");
        return s.nextFloat();
    }
    static int loadHeight(){
        System.out.println("Podaj swój wzrost w CM: ");
        return s.nextInt();
    }
}
