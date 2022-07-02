package Regexps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        Pattern compiledPattern = Pattern.compile("[abcd]{9}p");
        Matcher matcher = compiledPattern.matcher("abcaabaaap");

        System.out.println(matcher.matches());
    }
}
