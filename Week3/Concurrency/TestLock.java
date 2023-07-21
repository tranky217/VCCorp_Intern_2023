package Week3.Concurrency;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

import static Week3.Concurrency.ConcurrentUtils.sleep;
import static Week3.Concurrency.ConcurrentUtils.stop;

public class TestLock {
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
//
//        stop(executor);

        // readlock
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        Map<String, String> map = new HashMap<>();
//        ReadWriteLock lock = new ReentrantReadWriteLock();
//
//        executor.submit(() -> {
//            lock.writeLock().lock();
//            try {
//                sleep(1);
//                map.put("foo", "bar");
//                System.out.println("wait");
//            } finally {
//                lock.writeLock().unlock();
//            }
//        });
//
//        Runnable readTask = () -> {
//            lock.readLock().lock();
//            try {
//                System.out.println(map.get("foo"));
//                sleep(1);
//            } finally {
//                lock.readLock().unlock();
//            }
//        };
//
//        executor.submit(readTask);
//        executor.submit(readTask);
//
//        stop(executor);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();
        StampedLock lock = new StampedLock();

        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                sleep(1);
                map.put("foo", "bar");
            } finally {
                lock.unlockWrite(stamp);
            }
        });

        Runnable readTask = () -> {
            long stamp = lock.readLock();
            // still need to wait for writelock is  released
            try {
                System.out.println(map.get("foo"));
                sleep(1);
            } finally {
                lock.unlockRead(stamp);
            }
        };

        executor.submit(readTask);
        executor.submit(readTask);

        stop(executor);
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        StampedLock lock = new StampedLock();
//
//        executor.submit(() -> {
//            long stamp = lock.tryOptimisticRead();
            // only grant lock if it is not held in write mode
        // if not return 0
        // previous read lock prevent other thread to acquire write lock while they reading
        // optimistic lock still allows other to acquire write lock -> its read will be invalid
        // so validate the lock everytime after accessing the recourses
//            try {
//                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
//                sleep(1);
//                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
//                sleep(2);
//                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
//            } finally {
//                lock.unlock(stamp);
//            }
//        });
//
//        executor.submit(() -> {
//            long stamp = lock.writeLock();
//            try {
//                System.out.println("Write Lock acquired");
//                sleep(2);
//            } finally {
//                lock.unlock(stamp);
//                System.out.println("Write done");
//            }
//        });
//
//        stop(executor);
    }
}
