package zadaniaPart2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Zadanie22 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please, give me your netto salary: ");
        float salary = s.nextFloat();
        float taxAmount = (float) (salary * 0.19);
        BigDecimal taxMoney = new BigDecimal(taxAmount);

        System.out.print(("You will pay  " + (String.format("%.2f%n", taxAmount)) + "  taxes"));



    }
}
