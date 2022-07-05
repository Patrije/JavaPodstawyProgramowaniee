package Zadania;

public class Zadanie_5 {
    public static void main(String[] args) {
        countingDigits(15);
    }

    private static void countingDigits(int i) {
        int modulo;
        int sum = 0;

        do {
            modulo = i % 10;
            if(modulo == 0){
                i /= 10;
            }
            i -= modulo;
            sum += modulo;
        } while (i > 0);


        while(i > 0)
        {
            modulo = i % 10;
            sum = sum + modulo;
            i = i / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
