package Ch1_Introduction;

//(Sum a series) Write a program to sum the following series:
public class Homework8 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        for (i = 1; i <= 97; i += 2) {
            j += 2;
            System.out.print(i + "/" + j + " + ");
        }
    }
}
