package lab04.part02.task02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        outputArray();
    }

    public static void outputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length: ");
        int lengthArray = scanner.nextInt();
        System.out.println("Numbers of array:");

        int[] intArray = new int[lengthArray];
        for (int i =0; i < lengthArray; i++){
            intArray[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(intArray));
    }
}
