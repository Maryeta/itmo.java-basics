package lab_MultiThreading.task03;

public class Counter extends Thread {
    private volatile int count = 0;

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
//        System.out.println(getCount());
//        Thread.yield();
    }

}
