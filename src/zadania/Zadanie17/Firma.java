package zadania.Zadanie17;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private List<Pracownik> pracownicy = new ArrayList<>();

    public void dodajPracownik(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public Pracownik wyszukajNajwyzszegoPracownika() {
        Pracownik najwyzszyPracownik = pracownicy.get(0);
        for (int i = 0; i < pracownicy.size(); i++) {
            if (pracownicy.get(i).getWzrost() > najwyzszyPracownik.getWzrost()) {
                najwyzszyPracownik = pracownicy.get(i);
            }
        }
        return najwyzszyPracownik;
    }
}
