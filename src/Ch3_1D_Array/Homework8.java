package Ch3_1D_Array;

public class Homework8 {

    public static void main(String[] args) {
        // Initialize array of 50 lockers (false = closed, true = open)
        boolean[] lockers = new boolean[50];

        // Simulate all 50 players
        for (int player = 1; player <= 50; player++) {
            // Each player starts at their number and moves in steps of their number
            for (int locker = player - 1; locker < 50; locker += player) {
                // Toggle the locker state
                lockers[locker] = !lockers[locker]; // true -> false, false -> true
            }
        }

        // Display open lockers and count them
        int openCount = 0;
        System.out.println("Open lockers are:");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " "); // Add 1 because array is 0-based
                openCount++;
            }
        }

        System.out.println("\nTotal number of open lockers: " + openCount);
        System.out.println("Number of closed lockers: " + (50 - openCount));
    }
}