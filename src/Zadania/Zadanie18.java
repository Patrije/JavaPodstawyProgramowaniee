package Zadania;

public class Zadanie18 {
    public static void main(String[] args) {
        String result = countSum("64x6xxxxx453xxxxx9xx038x-68xxxxxx95786xxx7986");
        System.out.println(result);
    }

    static String countSum(String s) {
        String numbersStr[] = s.split("[x]+");
        double sum = 0;

        for (String str : numbersStr) {
            sum += Double.parseDouble(str);
        }
        return String.valueOf(sum);
    }
}
