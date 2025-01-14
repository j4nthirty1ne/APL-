package Ch2_Character_String;
/*Ask the user to enter a sentence, then display the number of words, consonants, and vowels (a, e, i, o
and u), special characters (not include spaces) in the sentence.  */
import java.util.Scanner;
public class Homework10 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int words = 0, consonants = 0, vowels = 0, specialCharacters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch == ' ') {
                words++;
            } else {
                specialCharacters++;
            }
        }
        System.out.println("Number of words: " + (words));
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of special characters: " + specialCharacters);
    }
}
