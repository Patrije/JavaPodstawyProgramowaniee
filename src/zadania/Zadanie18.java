package zadania;/*
wyświetl sumę wszystkich liczb znajdujących się zadanym tekście
64x6xxxxx453xxxxx9xx038x-68xxxxxx95786xxx7986
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie18 {

    public static void main(String[] args) {
        String text ="64x6xxxxx453xxxxx9xx038x-68xxxxxx95786xxx7986";
        String regex = "-?\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int sum = 0;
        while (matcher.find()){
            int number = Integer.parseInt(matcher.group());
            sum += number;
        }
        System.out.println(sum);
    }
}
