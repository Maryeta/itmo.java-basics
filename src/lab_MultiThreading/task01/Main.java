package lab_MultiThreading.task01;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            Thread thread = new Thread(new MyThread());
            Thread.State state = thread.getState();
            System.out.println(state);
            thread.start();
            Thread.State state2 = thread.getState();
            System.out.println(state2);
        }
    }
}
