package Zadania;

public class Zadanie_2 {
    public static void main(String[] args) {
        countYourBMI( 176, 87.9f);
    }

    private static void countYourBMI(int yourHeightInCentymitres, float yourWeightInKilograms) {
        float bmi;
        double height = (float) yourHeightInCentymitres / 100;
        bmi = (float) (yourWeightInKilograms / (height * height));

        if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Your BMI is " + bmi + " and it's OK!");
        }else if (bmi > 24.9){
            System.out.println("Your BMI is " + bmi + " and You are overweight!");
        }else{
            System.out.println("Your BMI is " + bmi + " Your are underweight!");
        }
    }
}
