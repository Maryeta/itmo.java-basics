package lab_MultiThreading.task03;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(counter);
            thread.start();
            thread.join();
        }
        System.out.println(counter.getCount());
        // разные значения count = 92892, 94675 - потоки выполняются параллельно и асинхронно,
        // чтобы значение счётчика было 100 000 необходимо последовательное выполнение.
    }
}
