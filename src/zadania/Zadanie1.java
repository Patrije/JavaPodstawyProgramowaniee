package zadania;

import java.util.Scanner;
import java.util.regex.Matcher;


public class Zadanie1 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        float a = loadNumber();
        float poleKola = a * 2 * (float)Math.PI;
        System.out.println("Pole koła wynosi: " + poleKola);

    }
    static float loadNumber(){
            System.out.print("Podaj średnice kołą: ");
           return s.nextFloat();
    }
}
