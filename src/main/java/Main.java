import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Roman number: ");
        String romanNumber = scanner.next();
        romanNumber = romanNumber.toUpperCase(Locale.ROOT);
        System.out.println(romanNumber);
        Converters converter = new Converters();
        char[] romanNumbersToChars = converter.convertStringToChars(romanNumber);
        int[] charsToNumbers = converter.convertCharsToInt(romanNumbersToChars);
        int arabicNumber = converter.convertIntArrayToInt(charsToNumbers);
        System.out.print("Roman number converted to arabic number: " + arabicNumber);
    }

}


