public class Converters {

    public char[] convertStringToChars(String romanNumber){
        char[] romanNumbersToChars = new char[romanNumber.length()];
        for (int i = 0; i < romanNumber.length(); i++) {
            romanNumbersToChars[i] = romanNumber.charAt(i);
        }
        return romanNumbersToChars;
    }

    public int[] convertCharsToInt(char[] romanNumbersToChars){
        int[] charsToNumbers = new int[romanNumbersToChars.length];
        for (int i = 0; i < romanNumbersToChars.length; i++) {
            if (romanNumbersToChars[i] == 'I') {
                charsToNumbers[i] = 1;
            } else if (romanNumbersToChars[i] == 'V') {
                charsToNumbers[i] = 5;
            } else if (romanNumbersToChars[i] == 'X') {
                charsToNumbers[i] = 10;
            } else if (romanNumbersToChars[i] == 'L') {
                charsToNumbers[i] = 50;
            } else if (romanNumbersToChars[i] == 'C') {
                charsToNumbers[i] = 100;
            } else if (romanNumbersToChars[i] == 'D') {
                charsToNumbers[i] = 500;
            } else if (romanNumbersToChars[i] == 'M') {
                charsToNumbers[i] = 1000;
            } else {
                System.out.println("The inserted roman number is not valid!");
            }
        }
        return charsToNumbers;
    }

    public int convertIntArrayToInt(int[] charsToNumbers){
        int arabicNumber = 0;
        for(int i=0; i < charsToNumbers.length; i++){
            int aux1 = charsToNumbers[i];
            if(i+1 < charsToNumbers.length){
                int aux2 = charsToNumbers[i+1];
                if(aux1 >= aux2){
                    arabicNumber += aux1;
                }else{
                    arabicNumber = arabicNumber + aux2 - aux1;
                    i++;
                }
            }else{
                arabicNumber += aux1;
            }
        }
        return arabicNumber;
    }
}
