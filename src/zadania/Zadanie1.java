package zadania;

import java.util.Scanner;
/*
Zadanie 1
Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną typu float)
i obliczy obwód tego okręgu. Do obliczeń przyjmij najpierw π = 3.14, a następnie
skorzystaj z wbudowanej klasy Math i znajdującej się tam stałej PI.
 */
public class Zadanie1 {

   private static final float PI = 3.14f;

    public static void main(String[] args) {
        System.out.println("Podaj sreednice okregu");
        Scanner scanner = new Scanner(System.in);
        float srednica = scanner.nextFloat();
        System.out.println("Obowd bez klasy Math: "+ obwod(srednica));
        System.out.println("Obowd z klasa Math: "+ obwodZMath(srednica));
    }

    private static double obwod(float srednica){
        return srednica * PI;
    }

    private static double obwodZMath(float srednica){
        return srednica * Math.PI;
    }
}
