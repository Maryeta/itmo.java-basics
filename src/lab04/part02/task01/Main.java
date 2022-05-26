package lab04.part02.task01;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{3, 6, 9, 10, 39, 230, 56};
        sortAscending(intArray);
    }

    public static void sortAscending(int[] array){
        int check = 0;
        for (int i = 0; i < (array.length-1); i++){
            if (array[i] >= array[i+1]){
                System.out.println("Please, try again!");
                break;
            }
            check++;
        }
        if (check == array.length-1){
            System.out.println("Ok");
        }
    }
}
