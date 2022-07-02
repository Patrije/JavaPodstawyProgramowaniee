import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {

        Pattern compiledPattrern = Pattern.compile("[a-z]+@[a-z]+\\.com");
        Matcher matcher = compiledPattrern.matcher("marcin@gmail.com");

        System.out.println(matcher.matches());
    }

}
