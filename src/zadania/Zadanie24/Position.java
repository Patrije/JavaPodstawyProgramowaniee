package zadania.Zadanie24;

public class Position {

    private final String productName;
    private final double price;

    public Position(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return productName + " " + price;
    }

}
