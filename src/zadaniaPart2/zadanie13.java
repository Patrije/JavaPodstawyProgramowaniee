package zadaniaPart2;

import regex.RegexExamples;

import java.util.regex.Pattern;

public class zadanie13 {
    public static void main(String[] args) {
        String zipCode1 = "32-020";
        String zipCode2 = "31-474";
        String zipCode3 = "A2-300";
        String zipCode4 = "22-20!";
        String zipCode5 = "22-20";
        System.out.println(zipCode(zipCode1));
        System.out.println(zipCode(zipCode2));
        System.out.println(zipCode(zipCode3));
        System.out.println(zipCode(zipCode4));
        System.out.println(zipCode(zipCode5));

    }
    static boolean zipCode(String zipCode){
        return Pattern.matches("[0-9]{2}-[0-9]{3}",zipCode)  ;
    }
}
