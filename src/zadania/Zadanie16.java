package zadania;

import java.util.Scanner;

public class Zadanie16 {

    public static void main(String[] args) {
        System.out.println("wprowadz tablice liczb");
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(znajdzNajczestszaLiczbe(numbers));

    }

    private static int znajdzNajczestszaLiczbe(int[] array){

        int licznik =0;
        int najczestszyLicznik=0;
        int index = 0;

        for(int i= 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                if(array[i]==array[j] && i!=j)
                licznik++;
            }
            if(licznik> najczestszyLicznik) {
                najczestszyLicznik = licznik;
                index = i;
            }
            licznik = 0;
        }
        return array[index];
    }
}
