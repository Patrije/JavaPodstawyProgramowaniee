package zadania;

import java.util.Scanner;

public class Zadanie3 {
    static Scanner s = new Scanner((System.in));

    public static void main(String[] args) {

        int userNumber = loadNumber();

            for(int i =1; i > userNumber;){
                if(userNumber<= 0){
                    System.out.println("Wrong number! Write positive number!");
                    userNumber = loadNumber();
                    continue;
            }
            }
            for(int i = 1; i <= userNumber; i++){
                    if ((i % 3 == 0 && i % 7 == 0))
                        System.out.println("Pif Paf");
                    else if (i % 3 == 0) {
                        System.out.println("Pif");
                    } else if (i % 7 ==0) {
                        System.out.println("Paf");
                    } else System.out.println(i);

                }

            }







    static int loadNumber(){
        System.out.println("Podaj dodatnią liczbę: ");
        return s.nextInt();
    }

}
