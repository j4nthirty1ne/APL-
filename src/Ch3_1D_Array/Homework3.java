package Ch3_1D_Array;
/*Ask the user to enter the name and age of three people, then display the name of the person who is the
youngest. Note: display all the youngest even if they are more than one person. */
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        int[] ages = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name and age of person " + (i + 1) + " (e.g., John 25): ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            names[i] = parts[0];
            ages[i] = Integer.parseInt(parts[1]);
        }

        int minAge = ages[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
            }
        }

        System.out.println("The youngest person(s): ");
        for (int i = 0; i < 3; i++) {
            if (ages[i] == minAge) {
                System.out.println(names[i] + ages[i] + " years old");
            }
        }

        scanner.close();
    }
}