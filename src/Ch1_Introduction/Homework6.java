package Ch1_Introduction;/*Write a program that reads an unspecified number of integers, determines how many positive and
negative values have been read, and computes the total and average of the input values (not counting
zero). Your program ends with the input 0. Display the total number of positive integers, the total
number of negative integers, the total, and the average. */
import java.util.Scanner;
public class Homework6 {
    public static void main(String[] args) {
        int total = 0;
        int positive = 0;
        int negative = 0;
        int count = 0;
        System.out.println("Please input the number. and Enter 0 to stop.");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                if (number > 0) {
                    positive++;
                } else {
                    negative++;
                }
                total += number;
                count++;
            }
        }
        System.out.println("The total number of positive integers is " + positive);
        System.out.println("The total number of negative integers is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + (total / count));
    }
}
