package zadania.zadanie10;

public class Poem {

    private Author creator;
    private int stropheNmbers;

    public Poem(Author creator, int stropheNmbers) {
        this.creator = creator;
        this.stropheNmbers = stropheNmbers;
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNmbers() {
        return stropheNmbers;
    }
}
