package zadania;

import java.util.Random;
import java.util.Scanner;

public class zadanie_2 {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        bodyMaxIndex();
    }
    static float bodyMaxIndex(){
        System.out.println("Podaj swoja wage: ");
        float weight = scanner.nextFloat();

        System.out.println("Podaj swoj wzrost: ");
        int high = scanner.nextInt();

        double high2 = (float) high / 100;


        float bmi =(float)( weight / (high2 * high2));

        if(bmi < 18.5 || bmi > 24.5){
            System.out.println("BMI nieoptymalne");
        }
        else {
            System.out.println("BMI optymalne");
        }
        return bmi;
    }
}
