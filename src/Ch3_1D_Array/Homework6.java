package Ch3_1D_Array;

/*Write a program that reads in ten integer numbers separated by a space in one line, and displays
distinct numbers (i.e., if a number appears multiple times, display it only once). (Hint: Read all the
numbers and store them in array1. Create a new array called array2. Add a number in array1 to
array2. If the number is already in the array2, ignore it.)*/

public class Homework6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int[] array2 = new int[10];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < count; j++) {
                if (array1[i] == array2[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                array2[count] = array1[i];
                count++;
            }
        }
        System.out.print("Distinct numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array2[i] + " ");
        }
    }

}
