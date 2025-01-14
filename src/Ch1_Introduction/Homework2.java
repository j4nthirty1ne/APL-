package Ch1_Introduction;

/*Ask the user to enter a number. Keep asking until they enter a value over 5 and then display the
message “The last number you entered was a [number]” and stop the program. */
public class Homework2 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(System.console().readLine());
            if (number > 5) {
                System.out.println("The last number you entered was a " + number);
                break;
            }
        }
    }
}
