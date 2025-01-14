package Ch1_Introduction;

public class Homework7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 600; i <= 1400; i++) {
            if ((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0)) {
                if (i < 1000)
                    System.out.print(i + "  ");
                count++;
                if (i >= 1000)
                    System.out.print(i + " ");
                if (count % 10 == 0) {
                    System.out.println(); // print a new line after 10 numbers
                }
            }
        }
    }
}
