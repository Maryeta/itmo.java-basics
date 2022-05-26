package lab04.part01.task05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, -11, 84, 51, 38, 3};
        System.out.println("Array = " + Arrays.toString(array));
        checkArray(array);
    }

    public static void checkArray(int[] array) {
        System.out.println(array[0] == 3 || array[array.length - 1] == 3);
    }
}
