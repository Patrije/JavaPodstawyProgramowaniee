package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void main(String[] args) {

        Pattern compiledPattern = Pattern.compile("[abcd]{5}p");
        Matcher matcher = compiledPattern.matcher("abcaa");

        System.out.println(matcher.matches());

        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9]+@[a-z]+\\.[a-z]");
    }
}
