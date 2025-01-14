package Ch2_Character_String;
/*Ask the user to enter a sentence, then capitalizes the first character of each word in the sentence. Note
that the other letters beside the first letter of each word must be in the lowercase.*/
import java.util.Scanner;
public class Homework7 {
    public static void main(String[] args) {
        System.out.println("Please Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);  // Create Scanner object
        String sentence = scanner.nextLine(); // Read user input and store it in sentence
        String[] words = sentence.split(" "); // Split the sentence into words
        String result = "";
        for (String word : words) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        System.out.println(result);
        
        
    }
}
