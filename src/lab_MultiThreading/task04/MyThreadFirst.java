package lab_MultiThreading.task04;

public class MyThreadFirst extends Thread {
    GetNameThread getNameThread;
    public MyThreadFirst(GetNameThread getNameThread){
        this.getNameThread = getNameThread;
    }
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            ++i;
            getNameThread.printNameFirst();
        }
    }
}
