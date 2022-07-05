package zadaniaPart2;

public class zadanie12 {
    public static void main(String[] args) {
        String palindromText = "kobyła ma mały bok";
        palidrom(palindromText);
    }
    static boolean palidrom(String text){

        String lowLetterAndNoSpace = text.replace(" ", "").toLowerCase();
        char lowLetterNoSpaceTab[] = lowLetterAndNoSpace.toCharArray();
        boolean result = false;
        int textFromTheEnd = lowLetterNoSpaceTab.length -1;

        for(int textStart = 0; textStart < lowLetterNoSpaceTab.length; textStart++ ){
            if(lowLetterNoSpaceTab[textStart] == lowLetterNoSpaceTab[textFromTheEnd--]){
                result = true;
            }else{
                result=false;
                break;
            }

        }
        System.out.print(result);
        return result;
    }
}
