public class MiesiaceMain {
    public static void main(String[] args) {
        for (Miesiace miesiace : Miesiace.values()) {
            System.out.println("Miesiac: " + miesiace.name() + " Liczba dni: " + miesiace.getDniMiesiaca());
        }
    }
}