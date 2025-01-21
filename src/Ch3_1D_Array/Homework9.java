package Ch3_1D_Array;

public class Homework9 {
    public static void main(String[] args) {
        String sentence = "www.google.com";
        String[] words = sentence.split("[.,\\s]+");

        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}