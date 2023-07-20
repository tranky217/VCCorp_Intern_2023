package Week3.Concurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
public class ConcurrentUtils {
    public static void stop(ExecutorService executor) {
        executor.shutdown();
        try{
            // tasks can be completed during this time interval
            // shut down immediately after time out
            if(!executor.awaitTermination(1000, TimeUnit.MILLISECONDS)){
                executor.shutdownNow();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
