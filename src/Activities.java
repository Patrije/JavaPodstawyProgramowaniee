public class Activities {

    private static Seasons seasons;

    public Activities(Seasons seasons) {
        this.seasons = seasons;
    }

    public static void showSeason (Activities activities){
        System.out.println(activities + " is good for " + seasons);
    }


}
