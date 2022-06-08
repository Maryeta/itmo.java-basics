package lab_MultiThreading.task04;

public class GetNameThread {
    private int count = 0;

    public synchronized void printNameFirst(){
        while (count > 0){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(Thread.currentThread().getName());
        count++;
        notify();
    }
    public synchronized void printNameSecond(){
        while (count == 0){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        count--;
        System.out.println(Thread.currentThread().getName());
        notify();
    }

}
