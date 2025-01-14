package Ch1_Introduction;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        int computerNum = 50; // computer number
        int count = 0; // count of attempts
        Scanner scanner = new Scanner(System.in); // for user input
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            count++;
            if (number < computerNum) {
                System.out.println("Too low");
            }
            else if (number > computerNum) {
                System.out.println("Too high");
            }
            else {
                System.out.println("Well done, you took " + count + " attempts");
                break;
            }
        }
        scanner.close();
    }
}