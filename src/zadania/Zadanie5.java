package zadania;

import java.util.Scanner;

public class Zadanie5 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int userNumber = loadNumber();
        int result = 0;
        int a = 0;

        for (int i = 1; i > userNumber; ) {
            if (userNumber <= 0) {
                System.out.println("Wrong number! Write positive number!");
                userNumber = loadNumber();
                continue;
            }
        }
        for (int j =0; j < userNumber; j++) {
            a = userNumber % 10;
            result += a;
            for (int i = 0; i < userNumber; i++) {
                float b = (float) userNumber / 10;
                userNumber = (int) b;
                if (userNumber>10){
                    break;
                }else result += userNumber;
            }
        }

        System.out.println(result);



    }
    static int loadNumber(){
        System.out.println("Write positive number.");
        return s.nextInt();
    }
}
