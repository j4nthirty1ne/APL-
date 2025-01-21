package Ch2_Character_String;

public class Homework1 {
    public static void main(String[] args) {
        String sentence = "Hello World!";
        StringBuilder result = new StringBuilder();

        for (char ch : sentence.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (ch == 'Z') ? 'A' : (char) (ch + 1);
            }
            else if (ch >= 'a' && ch <= 'z') {
                ch = (ch == 'z') ? 'a' : (char) (ch + 1);
            }
            result.append(ch);
        }

        System.out.println(result);
    }
}