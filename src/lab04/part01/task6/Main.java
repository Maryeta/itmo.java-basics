package lab04.part01.task6;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{5,1,92,43,290,3};
        check1or3(intArray);
    }
    public static void check1or3(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1){
                System.out.println("Массив содержит число 1");
            }
            else if(array[i] == 3){
                System.out.println("Массив содержит число 3");
            }
        }
    }
}
