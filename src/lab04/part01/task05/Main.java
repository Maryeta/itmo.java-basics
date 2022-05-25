package lab04.part01.task05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, -11, 84, 51, 38, 3};
        System.out.println("Array = " + Arrays.toString(array));
        boolean result = false;
        for (int j = 0; j < array.length; j++){
            if (array[j] == 3){
                if (j == 0 || j == (array.length -1)){
                    result = true;
                }
            }
        }
        System.out.println(result);
    }
}
