package Zadania.Zadanie10;

public class Main {
    public static void main(String[] args) {

        Poem [] arrayPoems = {new Poem(new Author("Tuwim", "Polish"), 134),
                new Poem(new Author("Brzechwa", "Polish"), 1119),
                new Poem(new Author("Poe", "USA" ), 340)};

        theMostVersesOfPoeams(arrayPoems);
    }

    private static void theMostVersesOfPoeams(Poem[] arrayPoems) {
        String surnameOfPoem = "";
        int numOfVerses = 0;

        for (Poem poem: arrayPoems) {
            if(poem.getStropheNumbers() > numOfVerses){
                numOfVerses = poem.getStropheNumbers();
                surnameOfPoem = poem.getCreator().getSurname();
            }
        }
        System.out.println(surnameOfPoem);
    }
}
