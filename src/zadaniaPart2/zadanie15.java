package zadaniaPart2;

import java.util.Scanner;

public class zadanie15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isTriangleRectangular());

    }
    static boolean isTriangleRectangular(){
        System.out.println("Give lenght of the first parotid of the triangle: ");
        int side1 = scanner.nextInt();
        System.out.println("Give lenght of the second parotid of the triangle: ");
        int side2 = scanner.nextInt();
        System.out.println("Give lenght of the hypotenuse side of the triangle: ");
        int side3 = scanner.nextInt();

        if((side1*side1) + (side2*side2) == (side3*side3)){
            return true;
        }
        else {
            return false;
        }

    }
}
