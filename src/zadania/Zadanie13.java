package zadania;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie13 {

    public static void main(String[] args) {
        System.out.println("Wprowadz kod pocztowy");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //20-100
        Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{3}");
//        Pattern compiledPattern = Pattern.compile("^[0-9]{2}-[0-9]{3}$");

        Matcher matcher = pattern.matcher(text);
        if(matcher.matches()){
            System.out.println("Poprawny kod pocztowy");
        }


    }
}
