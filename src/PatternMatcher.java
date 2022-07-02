import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        Pattern mailPattern = Pattern.compile(".+@{2,}\\.[a-z]+");
        Matcher matcher = mailPattern.matcher("igor.musial@mail.com");
        System.out.println(matcher.matches());
    }
}
