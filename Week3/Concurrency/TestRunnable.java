package Week3.Concurrency;

public class TestRunnable {
    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");
    }
}
