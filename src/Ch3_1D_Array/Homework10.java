package Ch3_1D_Array;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer number (0-999): ");
            int number = scanner.nextInt();

            if (number < 0 || number > 999) {
                System.out.println("Invalid input! Number must be between 0 and 999.");
                continue;
            }

            String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                    "seventeen", "eighteen", "nineteen"};
            StringBuilder numberInEnglish = new StringBuilder();

            int hundreds = number / 100;
            int tensDigit = (number % 100) / 10;
            int unitsDigit = number % 10;

            if (hundreds > 0) {
                numberInEnglish.append(units[hundreds]).append(" hundred ");
            }
            if (tensDigit == 1) {
                numberInEnglish.append(teens[unitsDigit]);
            } else {
                if (tensDigit > 1) {
                    numberInEnglish.append(tens[tensDigit]).append(" ");
                }
                if (unitsDigit > 0) {
                    numberInEnglish.append(units[unitsDigit]);
                }
            }

            System.out.println("Number in English: " + numberInEnglish.toString().trim());

            System.out.print("Press any key to exit or 'c' to continue: ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("c")) {
                break;
            }
        }
        scanner.close();
    }
}