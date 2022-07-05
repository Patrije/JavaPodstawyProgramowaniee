package Zadania;

import java.util.Scanner;

public class Zadanie_15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("This triangle is right triangle: " + isRightTriangle());
    }

    private static boolean isRightTriangle() {
        int[] array = new int[3];
        int theLongestSide = 0;
        int otherSidesPow2 = 0;
        System.out.println("Enter three sides [cm] and check if triangle is  right triangle");
        System.out.println("Enter a first side: ");
        array[0] = scanner.nextInt();
        System.out.println("Enter a second side: ");
        array[1] = scanner.nextInt();
        System.out.println("Enter a third side: ");
        array[2] = scanner.nextInt();

        for (int side : array) {
            if (side > theLongestSide) {
                theLongestSide = side;
            }
        }
        for (int side : array) {
            if (side != theLongestSide){
                otherSidesPow2 += (side * side);
            }
        }
        return Math.pow(theLongestSide, 2) == otherSidesPow2;
    }
}
