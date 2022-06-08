package lab_MultiThreading.task04;

public class Main {
    public static void main(String[] args) {
        GetNameThread getNameThread = new GetNameThread();
        Thread thread1 = new Thread(new MyThreadFirst(getNameThread));
        Thread thread2 = new Thread(new MyThreadSecond(getNameThread));
        thread1.start();
        thread2.start();
    }
}
