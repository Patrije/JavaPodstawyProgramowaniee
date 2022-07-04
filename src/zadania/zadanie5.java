package zadania;

//Napisz program, który pobierze od użytkownika
//jedną liczbę dodatnią (typu int) i obliczy sumę
//cyfr podanej liczby. Podpowiedź: aby
//rozpatrywać liczbę cyfra po cyfrze, możesz
//obliczać resztę z dzielenia liczby przez 10 (aby
//uzyskać wartość ostatniej cyfry) i dzielić liczbę
//bez reszty przez 10 (żeby „przesuwać” się do
//kolejnej cyfry)

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scan.nextInt();
        int wynik = 0;
        while (number != 0) {
            wynik += number%10;
            number /= 10;
        }
        System.out.println("Suma cyfr podanej liczby wynosi: " + wynik);
    }
}
