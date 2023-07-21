package Week3.Concurrency;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class TestConcurrentMap {
    public static void main(String[] args) throws Exception {
        givenConcurrentMap_whenSumParallel_thenCorrect();
        givenHashMap_whenSumParallel_thenError();
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>(){};
        map.putIfAbsent("a", 1);
        map.putIfAbsent("b", 2);
        map.putIfAbsent("c", 3);
        map.putIfAbsent("d", 4);

        map.forEach((k, v) -> {
            System.out.println("key: " + k + "| value: " + v);
        });
    }
    @Test
    public static void givenHashMap_whenSumParallel_thenError() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> sumList = parallelSum100(map, 100);
        AtomicInteger result = new AtomicInteger();
        sumList.forEach(i -> result.addAndGet(i));
        System.out.println("expected: " + 1000 + "\nreal: " + result);
    }

    private static List<Integer> parallelSum100(Map<String, Integer> map,
                                                int executionTimes) throws InterruptedException {
        List<Integer> sumList = new ArrayList<>(1000);
        map.put("test", 0);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        IntStream.range(0, executionTimes)
                        .forEach(i -> executorService.submit(()->{
                            map.computeIfPresent("test", (k, v) -> v += 1);
                        }));
        ConcurrentUtils.stop(executorService);
        sumList.add(map.get("test"));
        return sumList;
    }

    @Test
    public static void givenConcurrentMap_whenSumParallel_thenCorrect()
            throws Exception {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        List<Integer> sumList = parallelSum100(map, 1000);
        AtomicInteger result = new AtomicInteger();
        sumList.forEach(i -> result.addAndGet(i));
        System.out.println("expected: " + 1000 + "\nreal: " + result);
    }
}
