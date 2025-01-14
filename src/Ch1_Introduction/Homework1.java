package Ch1_Introduction;

import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        int total = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (total <= 50) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                total += number;
                System.out.println("The total is " + total);
            }
        }
    }
}