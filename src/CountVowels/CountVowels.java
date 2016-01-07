import java.util.Scanner;

/**
 * Takes input string with punctuation, whitespace  and characters
 * and counts the number of vowels.
 * 
 * Note: y or Y also it considers vowel
 * 
 * @author Arun Kumar
 */
public class CountVowels {

    public CountVowels() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = scanner.nextLine();
        if(string.matches("[a-zA-Z\\p{P}\\s]+$"))
            System.out.println("Output : " + countVowels(string));
        else
            System.out.println("Invalid Input: Only punctuation, whitespace  and characters are allowed");
    }

    private long countVowels(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        long vowelCount = 0;
        for (int index = 0; index < sentence.length(); index++) {
            switch (sentence.charAt(index)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    //note: Consider Y as a Vowel.
                case 'y':
                case 'Y':
                    vowelCount++;
                    break;
                default:
                // do nothing
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        new CountVowels();
    }
}
