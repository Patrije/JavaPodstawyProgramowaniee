package zadaniaPart2;

public class Pozycja {

    private String nazwaTowaru;
    private int ileSztuk;
    private double cenaZaSztuke;

    private double wartoscZamowienia;

    public Pozycja(String nazwaTowaru, double cenaZaSztuke, int ileSztuk) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cenaZaSztuke = cenaZaSztuke;
        this.wartoscZamowienia = wartoscZamowieniaWpl();
    }

    public double wartoscZamowieniaWpl(){
        double wartoscZamowieniawpl =(double) this.ileSztuk * this.cenaZaSztuke;
        return wartoscZamowieniawpl;


    }

    @Override
    public String toString() {
        return
                 nazwaTowaru +
               " " + cenaZaSztuke + "zł" +
                " " + ileSztuk + "szt." +
                " " + wartoscZamowienia + "zł"
                ;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public double getCenaZaSztuke() {
        return cenaZaSztuke;
    }

    public void setCenaZaSztuke(double cenaZaSztuke) {
        this.cenaZaSztuke = cenaZaSztuke;
    }
}
