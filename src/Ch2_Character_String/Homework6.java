package Ch2_Character_String;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII

        for (char ch : word.toCharArray()) {
            char lowerCh = Character.toLowerCase(ch);
            if (!seen[lowerCh]) {
                seen[lowerCh] = true;
                result.append(ch);
            }
        }

        System.out.println("Result: " + result);
    }
}