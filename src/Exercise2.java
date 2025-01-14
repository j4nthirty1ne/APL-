import java.util.Scanner;
public class Exercise2 {
/*Ask the user to enter a number. Keep asking until they enter a value over 5 and then display the
message “The last number you entered was a [number]” and stop the program. */
    public static void main(String[] args) {
//        System.out.println("Please enter a number");
        float number;
        int count = 0;
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        do {
            System.out.println("Please enter a number");
            number = input.nextFloat();
            count++;
            do {
                System.out.println("Would you like to continue? (y/n)");
                char c = input.next().charAt(0);
                if (c == 'n') {
                    isValid = true;
                }
                else if (c != 'y') {
                    System.out.println("Invalid input. Please enter 'y' or 'n'");
                }
            } while (!isValid);
        } while (count < 5);
    }
}
