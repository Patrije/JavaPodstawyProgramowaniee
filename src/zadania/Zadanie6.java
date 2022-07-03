package zadania;

import java.util.Scanner;

public class Zadanie6 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        String longest = "";
        String textFromUser = "";
        String finalText = "";
        String warunek = "Starczy";

        do {
            textFromUser = loadText();
            if(textFromUser.length()>longest.length() && !textFromUser.equals("Starczy")){
                finalText = textFromUser;
                longest = textFromUser;
            }


        } while(!textFromUser.equals(warunek));

        System.out.println(finalText);


    }
    static String loadText(){
        System.out.println("Write text.(Write 'Starczy' to end the lop): ");
        return s.nextLine();
    }
}
