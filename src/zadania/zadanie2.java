package zadania;

public class zadanie2 {

    static float bmi;
   static float masa = 50;
   static int wzrost = 170;

    // BMI= masa(kg)/wzrost[m]//

   static double dolnaGranica = 18.5;
   static double gornaGranica = 24.9;

    public static void main(String[] args) {
        if(getBmi(masa, wzrost) >= dolnaGranica && getBmi(masa, wzrost) <=gornaGranica){
            System.out.println("waga prawidlowa");
        } else {
            System.out.println("waga nieprawidlowa");
        }
    }

    public static float getBmi(float waga, int wzrost) {
        return waga/wzrost;
    }

}
