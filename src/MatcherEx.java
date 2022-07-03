import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherEx {
    public static void main(String[] args) {
        Pattern compiledPattern = Pattern.compile(".+@.+\\..+");
        Matcher matcher = compiledPattern.matcher("kamil@lodz.com");

        System.out.println(matcher.matches());
    }

}

