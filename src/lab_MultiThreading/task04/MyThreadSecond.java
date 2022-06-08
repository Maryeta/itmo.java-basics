package lab_MultiThreading.task04;

public class MyThreadSecond extends Thread{
    GetNameThread getNameThread;
    public MyThreadSecond(GetNameThread getNameThread){
        this.getNameThread = getNameThread;
    }
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            ++i;
            getNameThread.printNameSecond();
        }
    }
}
