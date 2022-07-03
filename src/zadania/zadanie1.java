package zadania;

import java.util.Scanner;

public class zadanie1 {

        public static void main(String[] args){
            System.out.println("Podaj srednice");
            Scanner scanner = new Scanner(System.in);

            System.out.println(circumference(scanner.nextFloat()));
            System.out.println(radius(scanner.nextFloat()));
        }

        private static double radius(float srednica) {
            return (float)(3.14 * srednica);
        }

        private static float circumference(float srednica) {
            return (float)(Math.PI * srednica);}
}
