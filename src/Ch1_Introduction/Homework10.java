package Ch1_Introduction;

public class Homework10 {
    public static void main(String[] args) {
        int perfectNumber = 0; // Count the number of perfect numbers
        for (int i = 1; i < 10000; i++) { // loop from 1 to 10000
            int sum = 0;
            for (int j = 1; j < i; j++) { // find all divisors of i
                if (i % j == 0) {
                    sum += j; // add the divisor to the sum
                }
            }
            if (sum == i) { // If the sum  = i, then i is a perfect number
                perfectNumber++;
                System.out.println(i + " is a perfect number.");
            }
        }
    }
}
