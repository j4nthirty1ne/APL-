package Ch2_Character_String;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII character set

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(word.charAt(i));
            }
        }

        System.out.println("Result: " + result.toString());
    }
}