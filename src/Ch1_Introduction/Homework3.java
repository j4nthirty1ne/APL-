package Ch1_Introduction;

import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        int total = 0;
//        boolean isnumber = true;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine()); // scanner.nextInt(); read as string, Integer.parseInt() convert to int
            total += number;
            System.out.println("The total is " + total);
            System.out.print("Do you want to add another number? (y/n): ");
            if (scanner.nextLine().equals("y")) { // equals() method compares two strings.
                continue;
            }
            else {
                System.out.println("The total is " + total);
                break;
            }
        }
        scanner.close(); // close the scanner and free up resources
    }
}