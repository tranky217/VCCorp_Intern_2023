package Week3.Concurrency;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static Week3.Concurrency.ConcurrentUtils.sleep;
import static Week3.Concurrency.ConcurrentUtils.stop;

public class testLock {
    public static void main(String[] args) {
        // lock
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        ReentrantLock lock = new ReentrantLock();
//
//        executor.submit(() -> {
//            lock.lock();
//            try {
//                sleep(1);
//            } finally {
//                lock.unlock();
//            }
//        });
//
//        executor.submit(() -> {
//            System.out.println("Locked: " + lock.isLocked());
//            System.out.println("Held by me: " + lock.isHeldByCurrentThread());
//            boolean locked = lock.tryLock();
//            System.out.println("Lock acquired: " + locked);
//        });

//        stop(executor);

        // readlock
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        executor.submit(() -> {
            lock.writeLock().lock();
            try {
                sleep(1);
                map.put("foo", "bar");
                System.out.println("wait");
            } finally {
                lock.writeLock().unlock();
            }
        });

        Runnable readTask = () -> {
            lock.readLock().lock();
            try {
                System.out.println(map.get("foo"));
                sleep(1);
            } finally {
                lock.readLock().unlock();
            }
        };

        executor.submit(readTask);
        executor.submit(readTask);

        stop(executor);
    }
}
