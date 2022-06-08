package lab_MultiThreading.task03;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(counter);
            thread.start();
//            System.out.println(counter.getCount());
        }
        System.out.println(counter.getCount());
    }
}
