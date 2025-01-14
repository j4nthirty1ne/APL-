package Ch1_Introduction;

/*Find the largest even integer n such that n³ is less than 10000. */
public class Homework5 {
    public static void main(String[] args) {
        int n = 0;
        while (n * n * n < 10000) {
            n += 2;
            System.out.println("n = " + n);
        }
        System.out.println("The largest even integer n such that n³ is less than 10000 is " + (n-2));
    }
}