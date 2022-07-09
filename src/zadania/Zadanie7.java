package zadania;

import java.util.*;

/*
Napisz program, który pobierze od użytkownika 10 dowolnie dużych liczb
 (zmiennych typu int) i wypisze te, które wystąpiły minimum dwukrotnie.
 */
public class Zadanie7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        duplicatedNumbers();
    }

    private static void duplicatedNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Set<Integer> dupliactes = new HashSet<>();

        System.out.println("Wprowadz 10 liczb");
        for (int i = 0; i <= 9; i++) {
            numbers.add(scanner.nextInt());
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (Objects.equals(numbers.get(i), numbers.get(j)) && i != j){
                    dupliactes.add(numbers.get(i));
                }
            }

        }
        System.out.println("Duplicated numbers: " + dupliactes);
    }
}
