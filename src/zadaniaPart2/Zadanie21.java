package zadaniaPart2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie21 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Give your text: ");
        String inputText= s.nextLine();
        String[] inputTextTab=inputText.split("");
        String[] backToFrontText = new String[inputTextTab.length];
        int fromBackToFront =0;


        for(int i= inputTextTab.length-1; i >= 0; i--){
           backToFrontText[fromBackToFront]=inputTextTab[i];
            System.out.print(backToFrontText[fromBackToFront]);
            fromBackToFront++;

        }

    }
}
