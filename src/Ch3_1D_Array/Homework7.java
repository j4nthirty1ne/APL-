package Ch3_1D_Array;
/*Ask the user to enter a sentence, then displays the longest word within the sentence. Note: the input
sentence might contain special characters, while words can contain only alphabets. You only need to
display the first longest word that appears in the sentence. */

import java.util.Scanner;
public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("[^a-zA-Z]+");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("The longest word: " + longestWord);
        scanner.close();
    }
}
