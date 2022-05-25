package lab04.part02.task01;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{3, 6, 9, 10, 39, 230, 56};
        int chek = 0;
        for (int i = 0; i < (intArray.length-1); i++){
            if (intArray[i] >= intArray[i+1]){
                System.out.println("Please, try again!");
                break;
            }
            chek++;
        }
        if (chek == intArray.length-1){
            System.out.println("Ok");
        }
    }
}
