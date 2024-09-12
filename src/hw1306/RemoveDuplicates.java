package hw1306;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] originalArray = {5, 12, 9, -25, 8, 15, 7, 14, 20, -18, 9, 5};
        int[] uniqueArray = new int[originalArray.length];
        int uniqueCount = 0;

        for (int i = 0; i < originalArray.length; i++) {
            int j;
            for (j = 0; j < uniqueCount; j++) {
                if (originalArray[i] == uniqueArray[j]) {
                    break;
                }
            }
            if (j == uniqueCount) {
                uniqueArray[uniqueCount++] = originalArray[i];
            }
        }

        uniqueArray = Arrays.copyOf(uniqueArray, uniqueCount);

        System.out.println("Original Array:");
        for (int element : originalArray) {
            System.out.print(element + " ");
        }

        System.out.println("\nArray after removing duplicates:");
        for (int element : uniqueArray) {
            System.out.print(element + " ");
        }
    }
}