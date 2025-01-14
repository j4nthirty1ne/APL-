package Ch3_1D_Array;

public class Homework2 {
    public static void main(String[] args) {
        String [] array1 = {"Java", "Python", "C++", "C#", "JavaScript"};
        String [] array2 = {"HTML", "Java", "Ruby", "Python", "CSS"};
        // find common elements in array1 and array2
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }

    }

}
