package Ch2_Character_String;
/*Convert each alphabet of a sentence  (which can contain spaces and special characters) into its next 
alphabet and print the sentence. Note: ignore all the character that are not a letter. Z → A, z →a. */

public class Homework1 {
    public static void main(String[] args) {
        String sentence = "Hello World";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 1);
                if (ch == 'Z' + 1) {
                    ch = 'A';
                }
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + 1);
                if (ch == 'z' + 1) {
                    ch = 'a';
                }
            } else {
                result.append(ch);
                continue;
            }
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}