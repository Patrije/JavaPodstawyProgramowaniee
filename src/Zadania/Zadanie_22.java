package Zadania;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie_22 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        taxCalculation();

    }

    private static void taxCalculation() {
        System.out.println("If you want to count Your tax enter your net salary:");
        float salary = scanner.nextFloat();
        float tax = 0.19f * salary;
        BigDecimal taxMoney = new BigDecimal(tax).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("You have to pay " + taxMoney);
    }
}
