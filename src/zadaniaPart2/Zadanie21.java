package zadaniaPart2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie21 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Give your text: ");
            StringBuilder inputText = new StringBuilder(s.nextLine());
            String reversedTex = new StringBuilder(inputText).reverse().toString();
            System.out.println(reversedTex);

        }

    }

