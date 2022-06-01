package lab09.task02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(rnd(100000));
        List<Integer> list1 = fillArrayList();
        List<Integer> list2 = fillLinkedList();

        long start = System.currentTimeMillis();
        //selection(list1);
        selection(list2);
        System.out.println("Время работы:" + (System.currentTimeMillis() - start) + "мс");

    }

    public static List<Integer> fillArrayList(){
        List<Integer> arrayList = new ArrayList<>();
        int k = 0;
        for (int i = 0; i <= 1000000; i++){
            arrayList.add(++k);
        }
        return arrayList;
    }

    public static List<Integer> fillLinkedList(){
        List<Integer> linkedList = new LinkedList<>();
        int k = 0;
        for (int i = 0; i <= 1000000; i++){
            linkedList.add(++k);
        }
        return linkedList;
    }

    public static int rnd(int max){
        return (int)(Math.random() * ++max);
    }

    public static void selection(List<Integer> list){
        int i = 0;
        while(i < 100000){
            System.out.println(list.get(rnd(1000000)));
            i++;
        }
    }
}
