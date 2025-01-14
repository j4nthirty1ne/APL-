package Ch2_Character_String;
/*Ask the user to enter a word that contains uppercase and lowercase characters, then insert a space
before every capital letter (except the first character) appears in the word. */

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a word: ");
        String word = scanner.nextLine();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (i > 0 && Character.isUpperCase(ch)) {
                result += " ";
            }
            result += ch;
        }
        System.out.println(result);
    }
}