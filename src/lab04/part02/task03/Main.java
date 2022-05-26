package lab04.part02.task03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{5, 6, 7, 2};
        System.out.println("Array 1: " + Arrays.toString(intArray));
        changeArray(intArray);
        System.out.println("Array 2: " + Arrays.toString(intArray));
    }

    public static int[] changeArray(int[] inArray) {
        int buf = inArray[inArray.length - 1];
        inArray[inArray.length - 1] = inArray[0];
        inArray[0] = buf;
        return inArray;
    }
}
