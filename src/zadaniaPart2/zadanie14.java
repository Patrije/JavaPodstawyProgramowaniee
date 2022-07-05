package zadaniaPart2;

import java.util.Scanner;

public class zadanie14 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Write your text to cut it: ");
        String userInput = scanner.nextLine();
        secondLetterText(userInput);
    }
    static void secondLetterText(String userText){
        String userTextTab[] = userText.split("");
        System.out.println("Your cut version of text is:  ");
        for(int i =0; i < userTextTab.length; i++){
            if(i % 2 == 0){
                System.out.print(userTextTab[i]);
            }

        }
    }
}
