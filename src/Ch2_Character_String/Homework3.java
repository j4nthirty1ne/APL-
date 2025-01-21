package Ch2_Character_String;

public class Homework3 {
    public static void main(String[] args) {
        String sentence = "Hello World! This is a test sentence.";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}