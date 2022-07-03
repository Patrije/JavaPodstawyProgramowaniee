package zadania;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie7 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int tenNumbers[]= new int[10];
        ArrayList<Integer> multipleNumbers = new ArrayList<>();

        for(int i = 0; i <10; i++){
            System.out.println("Podaj " + (i + 1) + " liczbę: ");
            int a = loadNumber();
            tenNumbers[i] = a;}

        for(int x =0; x < 9; x++) {
            for (int j = 0; j < 9;j++ ){
                if (tenNumbers[x] == tenNumbers[j] && x != j && !multipleNumbers.contains(tenNumbers[x]) ){
                   multipleNumbers.add(tenNumbers[x]);
                }

            }
        }
        System.out.println("Powtórzone liczby to: " + multipleNumbers);
        }

    static int loadNumber(){
        return s.nextInt();
    }
}
