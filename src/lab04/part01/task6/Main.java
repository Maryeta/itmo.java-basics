package lab04.part01.task6;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{5,1,92,43,290,3};
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] == 1){
                System.out.println("Массив содержит число 1");
            }
            else if(intArray[i] == 3){
                System.out.println("Массив содержит число 3");
            }
        }
    }
}
