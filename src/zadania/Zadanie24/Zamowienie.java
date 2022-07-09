package zadania.Zadanie24;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private final List<Position> positions = new ArrayList<>();

    public void addPosition(Position position){
        positions.add(position);
    }

    public void printZamownienie(){
        System.out.println(positions);
    }
}
