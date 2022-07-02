package Regexps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        Pattern compiledPattern = Pattern.compile(".+@.{2,}\\.[a-z]+");
        Matcher matcher = compiledPattern.matcher("pbr@gmail.com");

        System.out.println(matcher.matches());
    }
}
