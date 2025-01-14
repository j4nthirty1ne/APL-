package Ch3_1D_Array;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 scores (e.g., 70 65 92 86 20) ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] scores = new int[5];

        for (int i = 0; i < 5; i++) {
            scores[i] = Integer.parseInt(parts[i]);
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                System.out.println("Score " + scores[i] + " has grade A");
            } else if (scores[i] >= 80) {
                System.out.println("Score " + scores[i] + " has grade B");
            } else if (scores[i] >= 70) {
                System.out.println("Score " + scores[i] + " has grade C");
            } else if (scores[i] >= 60) {
                System.out.println("Score " + scores[i] + " has grade D");
            } else {
                System.out.println("Score " + scores[i] + " has grade F");
            }
        }

        scanner.close();
    }
}