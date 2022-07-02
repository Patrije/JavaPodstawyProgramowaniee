public class EnumExample {

    public static void main(String[] args) {
        Przycisk przycisk = new Przycisk(Kolor.CZERWONY);
        przycisk.wyswietlKolorPrzycisku();


        System.out.println("srednia temperatura " +
                PoryRoku.JESIEN.getSredniaTemperatura());

        for (DniWMiesiacu month:DniWMiesiacu.values()){
            System.out.println( month.getTheDays());



        }

    }
}
