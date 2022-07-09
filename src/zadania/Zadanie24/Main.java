package zadania.Zadanie24;

public class Main {

    public static void main(String[] args) {
        Position position1= new Position("Bread", 3.5);
        Position position2= new Position("Milk", 7.8);
        Position position3= new Position("Cola", 5.0);

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.addPosition(position1);
        zamowienie.addPosition(position2);
        zamowienie.addPosition(position3);

        zamowienie.printZamownienie();
    }
}
