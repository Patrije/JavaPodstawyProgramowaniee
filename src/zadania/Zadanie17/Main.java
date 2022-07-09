package zadania.Zadanie17;

public class Main {

    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Marek", "Nowak", 170);
        Pracownik pracownik2 = new Pracownik("Krzysztof", "Kowalski", 190);
        Pracownik pracownik3 = new Pracownik("Anna", "Malinowska", 160);
        Pracownik pracownik4 = new Pracownik("Jan", "Kowal", 176);

        Firma firma = new Firma();
        firma.dodajPracownik(pracownik1);
        firma.dodajPracownik(pracownik2);
        firma.dodajPracownik(pracownik3);
        firma.dodajPracownik(pracownik4);

        Pracownik najwyzszyPRacownikWFirmime = firma.wyszukajNajwyzszegoPracownika();
        System.out.println(najwyzszyPRacownikWFirmime.getImie() + " " + najwyzszyPRacownikWFirmime.getNazwisko());
    }
}
