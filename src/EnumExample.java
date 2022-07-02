public class EnumExample {

    public static void main(String[] args) {
        //   Przycisk przycisk = new Przycisk(Kolor.CZERWONY);
        //  przycisk.wyswietlKolorPrzycisku();
        // Activites bike = new Activites(Seasons.WIOSNA);
        //  Activites readBook = new Activites(Seasons.ZIMA);
        //        System.out.println("Średnia temperatura dla " + Seasons.JESIEN + " to " + Seasons.JESIEN.getAverageTemp());
        //     SeasonsTest poraRoku = new SeasonsTest(Seasons.WIOSNA);
        //Seasons newSeason = Seasons.valueOf("zima".toUpperCase());
        //System.out.println(newSeason);
        // System.out.println("Ordinal " + Seasons.ZIMA.ordinal());

        for(Month month : Month.values()){
            System.out.println("Miesiąc " + month.name() + " ma " + month.getHowManyDays() + " dni. Czy to jest parzysty miesiąc? " + month.getItIsEvenMonth()
                    + " Ten miesiąc jest w " + month.getSeasons()) ;
        }



        /* for (Seasons season : Seasons.values()){
            System.out.println(season + " " + season.getSnowing());
        } */


    }
}
