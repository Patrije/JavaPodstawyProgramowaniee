package zadania.zadanie10;

public class Main {

    public static void main(String[] args) {
        Author author1 =new Author("Dickens", "English");
        Author author2 =new Author("Mickiewicz", "Polish");
        Author author3 =new Author("Grimm", "American");
        Poem poem1 = new Poem(author1, 1400);
        Poem poem2 = new Poem(author2, 5600);
        Poem poem3 = new Poem(author3, 4000);

        Poem[] poems = new Poem[]{poem1, poem2, poem3};
        Poem longestPoem = poem2;

        for (Poem poem:poems) {
            if(poem.getStropheNmbers()> longestPoem.getStropheNmbers()){
                longestPoem = poem;
            }
        }
        System.out.println(longestPoem.getCreator().getSurname());
    }
}
