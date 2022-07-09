package zadaniaPart2;

public class Zadanie19 {
    public static void main(String[] args) {

        String inputText = "x7854.455xxxxxxxxxxxx-3x-553.00x53xxxxxxxxxxxxx3456xxxxxxxx3567.4xxxxx";
        String[] numbersTab= inputText.split("[\\D]+");
        String maxNumber = numbersTab[1];
        for(int i =1; i<numbersTab.length -1; i++){
            if(Float.parseFloat(maxNumber) < Float.parseFloat(numbersTab[i])){
                maxNumber = numbersTab[i];
            }
        }
        System.out.println("Biggest number from text is: " + maxNumber);
    }
}
