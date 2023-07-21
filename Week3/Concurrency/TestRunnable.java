package Week3.Concurrency;

public class TestRunnable {
    private static class notRunnable{
        String hello = "not runnable class";
        public notRunnable(){}

        public String test(){
            System.out.println("runnning method");
            return hello;
        }
        public void run(){
            System.out.println("running ?");
        }

    }
    public static void main(String[] args){
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");

//        notRunnable a = new notRunnable();
//        Thread newThread = new Thread((Runnable) a);
//        newThread.start();
    }
}
