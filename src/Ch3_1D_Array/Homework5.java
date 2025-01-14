package Ch3_1D_Array;
/*Find two elements of an array of positive and negative numbers such that their sum is closest to zero. */
public class Homework5 {
    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};
        int minSum = Integer.MAX_VALUE;
        int first = 0, second = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    first = arr[i];
                    second = arr[j];
                }
            }
        }
        System.out.println("Two elements whose sum is closest to zero are: " + first + " and " + second);
    }
}
