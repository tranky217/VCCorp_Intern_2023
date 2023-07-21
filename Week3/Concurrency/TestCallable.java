package Week3.Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TestCallable {
        public static void main(String[] args) {
            Callable<String> callableTask1 = () -> {
                TimeUnit.MILLISECONDS.sleep(300);
                return "callable execution 1";
            };
//            Thread a = new Thread(callableTask1);
    }
}
