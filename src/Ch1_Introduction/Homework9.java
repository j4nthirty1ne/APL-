package Ch1_Introduction;
public class Homework9 {
    public static void main(String[] args) {
        double sum = 0;
        // loop 1 - 624
        for (int i = 1 ; i <= 624 ; i++){
            sum += 1 / (Math.sqrt(i) + (Math.sqrt(i + 1))); //calculate the sum of the series
        }
        System.out.printf("Sum : %.2f%n",sum); // print the sum
    }

}