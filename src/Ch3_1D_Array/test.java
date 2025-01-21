package Ch3_1D_Array;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer number (0-999): ");
            int number = scanner.nextInt();

            if (number < 0 || number > 999) {
                System.out.println("Invalid input! Number must be between 0 and 999.");
                continue;
            }

            System.out.println("Roman numeral: " + intToRoman(number));

            System.out.print("Press any key to exit or 'c' to continue: ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("c")) {
                break;
            }
        }
        scanner.close();
    }

    public static String intToRoman(int num) {
        if (num == 0) {
            return "N"; // There is no Roman numeral for zero, using "N" for nulla (Latin for "none")
        }

        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return hundreds[num / 100] + tens[(num % 100) / 10] + units[num % 10];
    }
}