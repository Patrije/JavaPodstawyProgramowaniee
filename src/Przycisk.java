public class Przycisk {

    private Kolor kolorPrzycisku;

    public Przycisk(Kolor kolorPrzycisku) {
        this.kolorPrzycisku = kolorPrzycisku;
    }

    public void wyswietlKolorPrzycisku(){
        System.out.println("przycisk jest koloru: " + kolorPrzycisku);
    }
}
