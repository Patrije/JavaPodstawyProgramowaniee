package zadaniaPart2;

import java.util.regex.Pattern;

public class zadanie18 {
    public static void main(String[] args) {
        String inputText = "64x6xxxxx453xxxxx9xx038x-68xxxxxx95786xxx7986";
        String numbersFromInputText = inputText.replaceAll("[^0-9]", "");
        String splitNumbers[] = numbersFromInputText.split("");
        int result = 0;

        for(int i =0; i < splitNumbers.length -1; i++){
            result += Integer.parseInt(splitNumbers[i]);
        }

        System.out.println(result);


    }



}
