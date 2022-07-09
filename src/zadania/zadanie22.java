package zadania;
//Napisz program, który obliczy podatek dochodowy od wskazanego wynagrodzenia
//        netto.
//        Przyjmij, że podatek to 19% dochodu netto. W tym celu:
//        - poproś użytkownika o podanie swojego dochodu //
//        - przypisz do zmiennej rezultat obliczania kwotu podatku
//        - wyświetl ten rezultat

import java.util.Scanner;

public class zadanie22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wynagrodzenie netto: ");
        int wynagrodzenie = scan.nextInt();

        float kwota = (float) (0.01 * 19 * wynagrodzenie);


        System.out.println("Podatek dochodowy: " + kwota);
    }

}
