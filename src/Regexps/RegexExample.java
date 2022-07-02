package Regexps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {

        Pattern compildPattern = Pattern.compile("[abcde]{3}");
        Matcher matcher = compildPattern.matcher("abcaa");

        System.out.println(matcher.matches());

        Pattern isCorrect = Pattern.compile(".+@\\.[a-z]\\.+");
        Matcher matcher1 = isCorrect.matcher("michLangner@gmail.com");
        System.out.println(matcher1.matches());


    }
}
