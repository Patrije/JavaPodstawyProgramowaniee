package Zadania;

public class Zadanie_3 {
    public static void main(String[] args) {
        pifPafMethod(146);
    }

    private static void pifPafMethod(int enterYourNumber) {

        for (int i = 1; i <= enterYourNumber; i++) {
            if (i % 3 == 0 && i % 7 != 0){
                System.out.println("PIF");
            } else if (i % 7 == 0 && i % 3 != 0){
                System.out.println("PAF");
            } else if (i % 7 == 0 && i % 3 == 0){
                System.out.println("PIF PAF");
            }else{
                System.out.println(i);
            }
            
        }

    }
}
