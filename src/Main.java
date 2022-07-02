

public class Main {
    public static void main(String[] args) {

//        Activities rideBike = new Activities(Seasons.SPRING);
//        Activities swimming = new Activities(Seasons.SUMMER);
//        Activities sledding = new Activities(Seasons.WINTER);
//        Activities readingBooks = new Activities(Seasons.AUTUMN);

        for (Months month : Months.values()) {
            System.out.println(month.name() + " has " + month.getDays() + " days.");
        }


    }
}
