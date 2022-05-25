package lab04.part02.task04;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 99, 25, 3, 5, 7, 5, 2, 2, 3, 8, 8, 103, 99, 1};
        System.out.println(uniqueElement(intArray));
    }
    public static int uniqueElement(int[] inArray){
        int unElem = 0;
        for (int i = 0; i < inArray.length; i++){
            int count = 0;
            for (int j = 0; j < inArray.length; j++){
                if (j == i){
                    continue;
                }
                else if (inArray[j] == inArray[i]){
                    count++;
                }
            }
            if (count == 0){
                unElem = inArray[i];
                break;
            }
        }
        return unElem;
    }
}
