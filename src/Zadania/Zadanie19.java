package Zadania;

public class Zadanie19 {
    public static void main(String[] args) {
        String str = "x7854.455xxxxxxxxxxxx-3x-553.00x53xxxxxxxxxxxxx3456xxxxxxxx3567.4xxxxx\\";
        String strArray[] = str.split("[x]+\\\\");

        //double max = Double.MIN_VALUE, maxIndex = 0;

        //for (int i = 0; i < strArray.length; i++) {
        //    if (Double.parseDouble(strArray[i]) > max) {
        //        max = Double.parseDouble(strArray[i]);
        //        maxIndex = i;
        //        System.out.println(maxIndex);
        System.out.println(strArray);
            }
        }
//   }
//}
