package Zadania;

public class Zadanie_18 {
    public static void main(String[] args) {

        String s1 = "64x6xxxxx453xxxxx9xx038x-68xxxxxx95786xxx7986";

        sumOfNumbersFromString(s1);
    }

    private static void sumOfNumbersFromString(String s1) {
        int result = 0;
        String[] array = s1.split("[\\D]+");

        for (String s : array) {
            result += Integer.parseInt(s);
        }
        System.out.println(result);
    }
}
