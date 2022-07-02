public class EnumExample extends Object{

    public static void main(String[] args) {
        Przycisk przycisk = new Przycisk(Kolor.CZERWONY);
//        przycisk.wyswietlKolorPrzycisku();
//
//        System.out.println("srednia temperatur dla " + PoraRoku.JESIEN + PoraRoku.JESIEN.getSredniaTEmperatura());
//        PoraRoku poraRoku = PoraRoku.valueOf("jesien".toUpperCase());
//        System.out.println(PoraRoku.values());
//        System.out.println(poraRoku.getSredniaTEmperatura());

        for (PoraRoku poraRoku:
             PoraRoku.values()) {
            System.out.println(poraRoku + " "+poraRoku.getCzyPadaSnieg());
        }

        System.out.println("Ordinal" + PoraRoku.JESIEN.ordinal());
    }
}
