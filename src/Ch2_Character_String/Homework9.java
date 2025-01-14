package Ch2_Character_String;
/*The hexadecimal number is one that uses 16 symbols (0-9 and A-F) to represent a number. For
example, A1, 2AB, 3E.5C are hexadecimal numbers. Write a program that asks the user to enter a
value. If the value entered is a hexadecimal number, display “Yes”, otherwise, display “No”. Note:
ignore the case of the entered value. A number should not start with zero, dot or end with dot, so if
the user enters such value, it is also considered as invalid.  */
import java.util.Scanner;
public class Homework9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexNumber = scanner.nextLine().toUpperCase(); // convert to upper case
        if (hexNumber.matches("^[0-9A-F]+$") && !hexNumber.startsWith("0") && !hexNumber.endsWith(".")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
