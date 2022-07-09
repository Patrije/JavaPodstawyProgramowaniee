package zadaniaPart2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zamowienie {

    static Scanner s = new Scanner(System.in);

    private List<Pozycja> towarNaStanie = new ArrayList<>();

    private String pokazTowary;

    private Pozycja zlozZamowienie;


    public static List naszeTowary() {
        List<Pozycja> towarNaStanie = new ArrayList<>();
        towarNaStanie.add(new Pozycja("Cukier",8.5));
        towarNaStanie.add(new Pozycja("Mąka",2));
        towarNaStanie.add(new Pozycja("Makaron nitki",3.5));
        towarNaStanie.add(new Pozycja("Cukier Puder",5));
        towarNaStanie.add(new Pozycja("Ryż jaśminowy",2.5));
        towarNaStanie.add(new Pozycja("Kasza",2,426));
        towarNaStanie.add(new Pozycja("Makaron Spaghetti",3.34));
        towarNaStanie.add(new Pozycja("Makaron kokardki",3.15));
        towarNaStanie.add(new Pozycja("Ryż brązowy",2.95));
        towarNaStanie.add(new Pozycja("Ryż czarny",3.24));

        System.out.println("W naszym magazynie znajdują się następujące towary: ");
        int i = 0;
        for(Pozycja towar : towarNaStanie){
            System.out.println(i + ". " + towar.getNazwaTowaru()+" - " + towar.getCenaZaSztuke()+"zł za sztukę");
            i++;
        }
        return towarNaStanie;
    }

    public static void zlozZamowienie(List<Pozycja> towarNaStanie){
        System.out.println("Hej! Możesz zlożyć zamówienie!");
        naszeTowary();
        System.out.println("Wybierz którą pozycję chcesz zamówić: ");
        for(;;){
            int numerInput = s.nextInt();
            switch (numerInput){
                case 1:
                    System.out.println("Ile sztuk cukru chcesz kupić? ");
                    towarNaStanie.get(0).setIleSztuk(s.nextInt());
                    System.out.println("Wartość dodanych produktów wynosi: " + towarNaStanie.get(0).wartoscZamowieniaWpl()
                    + "zł");



            }
        }

    }
    public static double lacznaWartoscKoszyka(List<Pozycja> towarNaStanie){
        towarNaStanie = naszeTowary();
        double wartoscZakupow = 0;
        for(Pozycja towar : towarNaStanie){
            wartoscZakupow += towar.getWartoscZamowienia();
        }
        return wartoscZakupow;
        }

    }


