package Zadania;

public class Zadanie_1 {
    public static void main(String[] args) {

        System.out.println(circuitofcircle (2.91F));
        System.out.println(circuitofcircle2 (4.13F));
    }

    private static float circuitofcircle2(float v) {
        return (float)(v * Math.PI);
    }

    private static float circuitofcircle(float v) {

        return v * 3.14f;
    }


}
