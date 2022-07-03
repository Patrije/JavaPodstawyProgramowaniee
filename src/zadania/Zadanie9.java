package zadania;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie9 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Write 'a(or more) psik'' if you want to sneeze: ");
        String sneeze = s.nextLine();

        Pattern pattern = Pattern.compile("a{1,} psik");
        Matcher matcher = pattern.matcher(sneeze);
        if(matcher.matches()){
            System.out.println("Congratulations! You sneezed :)");
        } else{
            System.out.println("Unfortunately, you did't sneezed :(");
        }
    }
}
