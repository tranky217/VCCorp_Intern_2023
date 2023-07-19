package Week3.Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // runnable task
        Runnable runnableTask = () -> {
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        // callable task
        Callable<String> callableTask1 = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "callable execution 1";
        };
        Callable<String> callableTask2 = () -> {
            TimeUnit.MILLISECONDS.sleep(500);
            return "callable execution 2";
        };
        Callable<String> callableTask3 = () -> {
            TimeUnit.MILLISECONDS.sleep(700);
            return "callable execution 3";
        };

        List<Callable<String>> callableList = new ArrayList<>();
        callableList.add(callableTask3);
        callableList.add(callableTask2);
        callableList.add(callableTask1);

        // submit 1 task
//        Future<String> future = executor.submit(callableTask);
//        System.out.println(future.get());

        // invokeAny
        String result = executor.invokeAny(callableList);
        System.out.println(result);

        // invokeAll
        executor.invokeAll(callableList)
                .stream()
                        .map(future -> {
                            return future.isDone();
                        })
                                .forEach(System.out::println);
//        for (Future<String> f: futures){
//            System.out.println("is done: " + f.isDone());
////            System.out.println("result: " + f.get(100, TimeUnit.MILLISECONDS));
//        }

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
        System.out.println("using thread pool");

    }
}
