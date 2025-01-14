package Ch2_Character_String;
import java.util.Scanner;

/*(Check Valid Password) Some websites impose certain rules for passwords. Suppose the rules are:
• A password must have exactly 8 characters.
• A password must consist of both digits and letters, but no spaces or special characters.
• A password must always start with a digit.
• A password must contain at least one uppercase letter.
Write a program that asks the user to enter a password and displays if the password entered is valid
or invalid. If it is invalid, let the user know why. */

public class Homework8 {
    public static void main(String[] args) {
        System.out.println("""
                Your Password must have
                - exactly 8 characters.
                - consist of both digits and letters, but no spaces or special characters.
                - start with a digit.
                - at least one uppercase letter.
                """);
        boolean isValid;
        
        do {
            System.out.print("Please Enter your password: ");

            Scanner scanner = new Scanner(System.in); // Create Scanner object
            String password = scanner.nextLine(); // Read user input and store it in password
            isValid = true;

            if (password.length() != 8) {
                isValid = false;
                System.out.println("Password must have exactly 8 characters.");
            } else if (!Character.isDigit(password.charAt(0))) { // password.charAt(0) is the first character of the password
                isValid = false;
                System.out.println("Password must start with a digit.");
            } else if (!password.matches(".*[A-Z].*")) { // .*[A-Z].* regex pattern that matches at least one uppercase letter
                isValid = false;
                System.out.println("Password must contain at least one uppercase letter.");
            } else {
                for (int i = 0; i < password.length(); i++) {
                    char ch = password.charAt(i);
                    if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                        isValid = false;
                        System.out.println("Password must not contain spaces or special characters.");
                        break;
                    }
                }
            }

            if (isValid) {
                System.out.println("Password: " +  password + " is valid.");
            } else {
                System.out.println("Password: " +  password + " is Invalid.");
            }
        } while (!isValid);
    }
}