package zadania;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie22 {

    public static void main(String[] args) {
        System.out.println("Podaj dochod brutto");
        Scanner scanner = new Scanner(System.in);
        double dochodBrutto = scanner.nextDouble();
        double tax = calculateTax(dochodBrutto);
        BigDecimal taxMoney = new BigDecimal(tax).setScale(0, RoundingMode.HALF_EVEN);
        System.out.println(tax);
        System.out.println(taxMoney);

    }

    private static double calculateTax(double incomeGross){
        return 0.19 * incomeGross;
    }
}
