package zadania.zadanie10;

import java.util.ArrayList;

public class Zadanie10 {

    public static void main(String[] args) {

        Author author = new Author(" Twardoch", "Poland");
        Author author1 = new Author("Milton", "England");
        Author author2 = new Author("Alighieri", "Italian");

        Poem poem = new Poem(author, 20);
        Poem poem1 = new Poem(author1, 18);
        Poem poem2 = new Poem(author2, 25);

        ArrayList<Poem> poems = new ArrayList<>();
        poems.add(poem);
        poems.add(poem1);
        poems.add(poem2);

        int poemLenght = 0;

        for (Poem p : poems) {
            if (p.getStropheNumbers() > poemLenght) {
                poemLenght = p.getStropheNumbers();
            }
        }
        for (Poem p : poems) {
            if (poemLenght == p.getStropheNumbers()) {
                System.out.println("Author with longest poem is " + p.getCreator().getSurname());
            }
        }


    }
}

