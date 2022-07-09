package zadania.Zadanie17;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private int wzrost;

    public Pracownik(String imie, String nazwisko, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wzrost = wzrost;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWzrost() {
        return wzrost;
    }
}
