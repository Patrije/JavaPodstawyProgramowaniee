package Regexps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern compiledPattern = Pattern.compile("[abcd]");
        Matcher matcher = compiledPattern.matcher("a");
        System.out.println(matcher.matches());

        Pattern compiledPattern = Pattern.compile("[a-z,]");
        Matcher matcher = compiledPattern.matcher("cos.tam@gmail.com");
        System.out.println(matcher.matches());

    }
}
