package lab_MultiThreading.task01;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            //System.out.println(i);
            i++;
        }
        Thread.State state = Thread.currentThread().getState();
        System.out.println("Name: " + Thread.currentThread().getName() + " " + "State: " + Thread.currentThread().getState());
    }
}
