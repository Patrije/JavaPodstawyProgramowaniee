package zadania;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika jedną liczbę dodatnią (typu int)
 i obliczy sumę cyfr podanej liczby. Podpowiedź: aby rozpatrywać liczbę cyfra po cyfrze,
  możesz obliczać resztę z dzielenia liczby przez 10 (aby uzyskać wartość ostatniej cyfry)
   i dzielić liczbę bez reszty przez 10 (żeby „przesuwać” się do kolejnej cyfry).

 */
public class Zadanie5 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        System.out.println(obliczSumeCyfr(liczba));
    }

    private static int obliczSumeCyfr(int liczba){
        int wynik =0;
        while(liczba !=0){
            wynik = wynik + liczba%10;
            liczba = liczba / 10;
        }
        return wynik;
    }
}
